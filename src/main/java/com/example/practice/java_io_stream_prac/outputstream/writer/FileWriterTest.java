package com.example.practice.java_io_stream_prac.outputstream.writer;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest {

    public static void main(String[] args) {

        try(FileWriter fw = new FileWriter("writer.txt")) {

            fw.write('A');
            char[] buf = {'B','C','D','E','F','G'};

            fw.write(buf);
            fw.write("\n");
            fw.write("안녕하세요\n");
            fw.write(buf, 3,2);

        } catch(IOException e) {
            e.printStackTrace();
        }

        System.out.println("finished");
    }
}
