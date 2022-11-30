package com.example.practice.java_io_stream_prac.wrapperstream;

import java.io.*;
import java.net.Socket;

public class FileCopyTest {

    public static void main(String[] args) {

        long millisecond = 0;
        int i;

        /* FileInputStream 으로 사용할 경우 바이트 하나씩 처리하기 때문에 시간이 오래걸린다.
        try(FileInputStream fis = new FileInputStream("a.zip")) {
            FileOutputStream fos = new FileOutputStream("copy.zip");

         */

        // 이렇게 BufferedInputStream 로 감싸서 Buffer 로 처리하면 속도가 현저히 빨라진다.
        // FileInputStream 인 경우 BufferedInputStream 로, FileReader 인 경우 BufferedReader 로 감싸는 식.
        try(BufferedInputStream bis = new BufferedInputStream(new FileInputStream("a.zip"))) {
            BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("copy.zip"));

            millisecond = System.currentTimeMillis();

            while((i = bis.read()) != -1) {
                bos.write(i);
            }

            millisecond = System.currentTimeMillis() - millisecond;

        } catch(IOException e) {
            e.printStackTrace();
        }
        System.out.println(millisecond + " 경과 되었습니다.");

        // Ex) Socket 으로 채팅 기능을 사용한다 가정하면
        Socket socket = new Socket();

//         socket 을 InputStreamReader 로 감싸서 문자로 변환하고 BufferedReader 로 다시 감싸서 속도를 높혀주는 식.
//        BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
//        br.read();
    }
}
