package com.example.practice.java_io_stream_prac.outputstream;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest {

    // InputStream 은 파일이 없을시 예외 발생, OutputStream 은 파일이 없을시 파일을 만들어준다.

    public static void main(String[] args) {

        try(FileOutputStream fos = new FileOutputStream("output.txt")) {

            fos.write(65);      // 아스키 코드로 A,B,C
            fos.write(66);
            fos.write(67);

        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("finish");
    }
}
