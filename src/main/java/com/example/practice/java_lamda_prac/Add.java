package com.example.practice.java_lamda_prac;

@FunctionalInterface                // 함수형 인터페이스 (FunctionalInterface)
public interface Add {              // 내부에 두개이상의 메서드를 선언하면 에러를 일으킨다.
    public int add(int x, int y);   // 익명 함수와 매개변수만으로 구현되므로 단 하나의 메서드만을 선언해야된다.

}
