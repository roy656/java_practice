package com.example.practice.java_lamda_prac;

public class AddTest {

    public static void main(String[] args) {

        Add addC = (x ,y)-> {return x+y;};

//        Add addC = (x, y)-> x+y;              // 람다식의 생략 규칙에 따라 생략가능한 부분 존재.

        System.out.println(addC.add(2,3));
    }
}
