package com.example.practice.java_io_stream_prac;

import java.io.IOException;
import java.io.RandomAccessFile;

/*
    입출력 클래스 중 유일하게 파일에 대한 입력과 출력을 동시에 할 수 있는 클래스

    파일 포인터가 있어서 읽고 쓰는 위치의 이동이 가능함

    다양한 메서드가 제공됨
 */

public class RandomAccessFileTest {

    public static void main(String[] args) throws IOException {

        RandomAccessFile raf = new RandomAccessFile("random.txt", "rw");

        raf.writeInt(100);
        System.out.println("pos: " + raf.getFilePointer());
        raf.writeDouble(10.5);
        System.out.println("pos: " + raf.getFilePointer());
        raf.writeUTF("안녕하세요");
        System.out.println("pos: " + raf.getFilePointer());


        raf.seek(0);        // read 하기 위해서 FilePointer 를 맨앞으로 다시 옮긴다.


        int i = raf.readInt();
        double d = raf.readDouble();
        String s = raf.readUTF();

        System.out.println(i);
        System.out.println(d);
        System.out.println(s);
    }
}
