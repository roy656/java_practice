package com.example.practice.java_exception_prac;

public class AutoCloseTest {

    public static void main(String[] args) {

        try(AutoCloseableObj obj = new AutoCloseableObj();) {   // AutoCloseable 을 구현한 클래스 이기 때문에
                                                                // try 문이 수행이 끝나면 Auto Close 가 된다.
            throw new Exception();      // 강제 Exception 발생 시키기
        } catch (Exception e) {
            System.out.println("Exception");
        }

        System.out.println("end");
    }
}
