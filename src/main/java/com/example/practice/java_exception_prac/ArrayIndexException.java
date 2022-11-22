package com.example.practice.java_exception_prac;

import java.util.ArrayList;

public class ArrayIndexException {

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5};

//        for(int i = 0; i <= 5; i++) {           // 오류 발 / 배열의 인덱스 범위를 벗어남
//            System.out.println(arr[i]);         // java.lang.ArrayIndexOutOfBoundsException: 5
//                                                //at com.example.practice.java_exception_prac.ArrayIndexException.main(ArrayIndexException.java:12)
//        }


        try {
            for(int i = 0; i <= 5; i++) {           // try catch 문을 사용하면 오류는 나긴 하지만 비정상 종료는 피할수 있다는 차이가 있다.
                System.out.println(arr[i]);         // 오류가 나고 난 뒤에도 계속 실행중인 상태.
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
            System.out.println(e.toString());       // toString 을 쓰면 해당 exception 의 풀네임 과 메세지를 포함해 보여준다.
        }

        System.out.println("비정상 종료 되지 않고 프로그램은 계속 실행중");
    }
}
