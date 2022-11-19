package com.example.practice.java_lamda_prac;

public class StringConcatTest {

    public static void main(String[] args) {

        String s1 = "Hello";
        String s2 = "World";

        // 기존 객체지향 클래스 이용 구현 방법
//        StringConcatImpl stringConcatImpl = new StringConcatImpl();
//        stringConcatImpl.makeString(s1,s2);

        // 람다식 이용 방법    @FunctionalInterface 선언한 후  Impl 구현클래스를 만드는 과정 생략.
        StringConcat stringConcat = (s, v)-> {System.out.println(s + "," + v);};    // 람다식 내부에 익명클래스가 쓰여진다.
        stringConcat.makeString(s1, s2);                                            // 자바에서는 객체 없이 메서드가 호출 될수 없음.


    }
}

// 인터페이스형 변수로 람다식 사용 가능.
// 매개변수로 람다식을 전달 가능.
// 반환값으로 람다식을 사용 가능.