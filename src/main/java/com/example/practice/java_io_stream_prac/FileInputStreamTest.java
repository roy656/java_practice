package com.example.practice.java_io_stream_prac;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamTest {

    public static void main(String[] args) {

//        File file = new File("src/main/java/com/example/practice/input.txt");
        FileInputStream fis = null;

        try {
            fis = new FileInputStream("src/main/java/com/example/practice/input.txt");
            System.out.print((char) fis.read());
            System.out.print((char) fis.read());
            System.out.println((char) fis.read());

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            } catch (Exception e1) {
                e1.printStackTrace();
            }
        }

        System.out.println("살아있음");
    }
}
