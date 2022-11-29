package com.example.practice.java_io_stream_prac;

import java.io.IOException;
import java.io.InputStreamReader;

public class SystemInTest {

    public static void main(String[] args) {

        System.out.println("알파벳을 입력한 후 [Enter]를 누르세요");

        int enter;

        try {
            InputStreamReader isr = new InputStreamReader(System.in);   // 바이트를 문자로 바꿔주는 InputStreamReader(보조스트림) 로 감싸면 한글도 가능
            while((enter = isr.read()) != '\n') {     // System.in 은 1바이트씩 읽기 때문에 한글을 쓰면 깨진다.
//                System.out.println(enter);
                System.out.print((char)enter);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
