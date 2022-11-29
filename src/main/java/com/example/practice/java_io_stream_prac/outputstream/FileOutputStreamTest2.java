package com.example.practice.java_io_stream_prac.outputstream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest2 {

    public static void main(String[] args) throws FileNotFoundException {

        FileOutputStream fos = new FileOutputStream("output2.txt", true);   // 2번째 인자가 true 일 경우 append 허용.
                                                        // 2번째 인자를 안넣을경우 default 로 false 가 적용되 다시 쓸 경우엔 overwrite 됨.
        try(fos) {

            byte[] bt = new byte[26];
            byte data = 65;

            for (int i = 0; i < bt.length; i++) {
                bt[i] = data++;
            }

            fos.write(bt);
            fos.write(bt, 2, 10);       // write 메서드 중 offset 값과 원하는 길이 를 인자로 넣으면 원하는 위치 부터 몇개까지 쓰기 가능.

        } catch (IOException e) {
            System.out.println(e);
        }

        System.out.println("Finished");
    }
}
