package com.example.practice.java_io_stream_prac.inputstream.reader;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest {

    public static void main(String[] args) {

        int i;

        try(FileReader fr = new FileReader("reader.txt")) {

            while( (i = fr.read()) != -1) {
                System.out.print((char)i);
            }

        } catch(IOException e) {
            e.printStackTrace();
        }
    }
}
