package com.example.practice.java_abstract_prac.re_practicing;

public class SilverLevel extends PlayerLevel {
    @Override
    public void run() {
        System.out.println("조금 빠른 달리기");
    }

    @Override
    public void jump() {
        System.out.println("점프를 한다");
    }

    @Override
    public void turn() {
        System.out.println("뒤로 돈다");
    }

    @Override
    public void showLevelMessege() {
        System.out.println("Level 은 Silver 입니다.");
    }
}
