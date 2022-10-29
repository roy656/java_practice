package com.example.practice.java_abstract_prac.basic_using_abstract;

public class Desktop extends Computer {

    @Override
    public void display() {                     // 상위 추상클래스의 추상 메서드를 전부 구현 하거나 혹은 클래스를 추상클래스로 변경해야 한다.
        System.out.println("Desktop display");
    }

    @Override
    public void typing() {
        System.out.println("Desktop typing");
    }

    @Override
    public void turnOn() {                      // 상위 클래스의 메서드를 재정의 하기
        System.out.println("Desktop turnOn");
    }
}
