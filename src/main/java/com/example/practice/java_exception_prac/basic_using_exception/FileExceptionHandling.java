package com.example.practice.java_exception_prac.basic_using_exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileExceptionHandling {

    public static void main(String[] args) {

        FileInputStream fis = null;

//        try {
//            fis = new FileInputStream("a.txt");     // a.txt 파일이 없기 때문에 오류 발생
//            System.out.println("read");
//
//            try {
//                fis.close();                            // 리소스를 사용한 후에는 닫아줘야 한다.
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        } catch (FileNotFoundException e) {             // 여기의 FileNotFoundException 이 발생.
//            System.out.println(e);
//        }                                               // 또다른 try catch 문이 있다면 거기서도 close 를 해야한다.
//        System.out.println("end");                      // 반복되므로 finally 블럭을 이용하여 한번에 처리 하는게 목적.



        try {
            fis = new FileInputStream("a.txt");   // a.txt 파일이 없기 때문에 오류 발생
            System.out.println("read");

        } catch (FileNotFoundException e) {             // 여기의 FileNotFoundException 이 발생.
            System.out.println(e);
            return;                                     // return 이 불린다 하더라도 finally 는 불린다.
        } finally {                                     // try 가 불리게 되면 finally 는 항상 불린다.
            if(fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("계속 실행중");
        }
        System.out.println("계속 실행중");
    }
}