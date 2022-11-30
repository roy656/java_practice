package com.example.practice.java_io_stream_prac.wrapperstream;

import java.io.*;

public class DataStreamTest {

    /*
    자료가 메모리에 저장된 상태 그대로 읽거나 쓰는 스트림
    DataInputStream 와 DataOutputStream
     */

    public static void main(String[] args) {


        try(FileOutputStream fos = new FileOutputStream("data.txt");
            DataOutputStream dos = new DataOutputStream(fos))
        {

            dos.writeByte(100);
            dos.writeChar('A');
            dos.writeInt(10);
            dos.writeFloat(3.14f);
            dos.writeUTF("Test");
        }catch(IOException e) {
            e.printStackTrace();
        }

        try(FileInputStream fis = new FileInputStream("data.txt");
            DataInputStream dis = new DataInputStream(fis))
        {

            System.out.println(dis.readByte());
            System.out.println(dis.readChar());
            System.out.println(dis.readInt());
            System.out.println(dis.readFloat());
            System.out.println(dis.readUTF());
        }catch (IOException e) {
            e.printStackTrace();
        }
    }
}

