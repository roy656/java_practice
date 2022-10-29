package com.example.practice.java_abstract_prac;

public abstract class Computer {        // 추상 클래스는 상속을 하기 위해 있는 클래스 이고 new 인스턴스화 할수 없음.

    public abstract void display();
    public abstract void typing();

    void turnOn() {

        System.out.println("전원을 켠다");
    }

    void turnOff() {

        System.out.println("전원을 끈다");
    }
}
