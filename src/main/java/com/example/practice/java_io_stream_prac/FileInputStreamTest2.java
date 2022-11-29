package com.example.practice.java_io_stream_prac;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamTest2 {

    // FileInputStream 은 파일에서 바이트 단위로 자료를 읽는다.

    public static void main(String[] args) {

        int i;
//        FileReader fr = new FileReader("src/main/resources/input.txt");   FileReader 를 쓰면 문자를 핸들링 가능.

        try(FileInputStream fis = new FileInputStream("src/main/resources/input.txt")) {

            while((i = fis.read()) != -1) {
                System.out.print((char)i);
            }
        } catch(IOException e) {
            System.out.println(e);
        }
    }
}
