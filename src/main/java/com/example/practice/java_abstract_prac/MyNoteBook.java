package com.example.practice.java_abstract_prac;

public class MyNoteBook extends NoteBook {

    @Override
    public void typing() {      // 상위 클래스 에서 구현하지 않은 메서드를 구현한다.
        System.out.println("MyNoteBook typing");
    }
}
