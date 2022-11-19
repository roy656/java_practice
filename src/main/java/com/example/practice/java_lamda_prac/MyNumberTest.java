package com.example.practice.java_lamda_prac;

public class MyNumberTest {

    public static void main(String[] args) {

        MyNumber myNumber = (x,y)-> {return x > y ? x : y;};        // 상항연산자

        // MyNumber myNumber = (x,y)-> x > y ? x : y;   리턴 과 반환문이 하나일경우 중괄호 생략 가능.

        System.out.println(myNumber.getMax(10,30));

    }
}
