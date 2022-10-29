package com.example.practice.java_abstract_prac;

public abstract class NoteBook extends Computer {

    @Override
    public void display() {                     // 상위 추상클래스의 추상 메서드를 전부 구현하지 않을거면 클래스를 추상클래스로 변경해야 한다.
        System.out.println("NoteBook display");
    }


}
