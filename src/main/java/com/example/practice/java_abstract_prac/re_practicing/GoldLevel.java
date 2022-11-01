package com.example.practice.java_abstract_prac.re_practicing;

public class GoldLevel extends PlayerLevel {
    @Override
    public void run() {
        System.out.println("매우 빠르게 달린다");
    }

    @Override
    public void jump() {
        System.out.println("높이 점프를 한다");
    }

    @Override
    public void turn() {
        System.out.println("재빠르게 뒤로 돈다");
    }

    @Override
    public void showLevelMessege() {
        System.out.println("Level 은 Gold 입니다.");
    }
}
