package com.example.practice.java_io_stream_prac;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamTest3 {

    // FileInputStream 은 파일에서 바이트 단위로 자료를 읽는다.

    public static void main(String[] args) {

        int i;

        try(FileInputStream fis = new FileInputStream("src/main/resources/input2.txt")) {

            byte[] bt = new byte[10];               // 묶어서 읽을 바이트 배열을 만들고

            while((i = fis.read(bt)) != -1) {       // 파일 내용을 끝까지 읽도록 while 문 작성
                                                    // * read(byte bt[]) - read 메서드에 바이트 배열을 넣으면 읽은 자료의 바이트 수를 반환.

                for(int j=0; j<i; j++) {            // for 문 으로 한 묶음씩 꺼내서 출력
                    System.out.print((char)bt[j]);  // 반환값이 int 이므로 char 로 형변환
                }
                System.out.println(" : " + i + " 바이트 읽음");
            }
        } catch(IOException e) {
            System.out.println(e);
        }
    }
}
