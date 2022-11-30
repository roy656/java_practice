package com.example.practice.java_io_stream_prac.wrapperstream.in_out_stream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputStreamReaderTest {

    public static void main(String[] args) {

        // 바이트->문자 변환을 위해 바이트 단위의 자료들을 문자로 바꿔주는 InputStreamReader 로 FileInputStream 을 감싸서 사용.
        try(InputStreamReader isr = new InputStreamReader(new FileInputStream("reader.txt"))) {

            int i;

            while((i = isr.read()) != -1) {
                System.out.print((char)i);
            }

        } catch(IOException e) {
            e.printStackTrace();
        }
    }
}
