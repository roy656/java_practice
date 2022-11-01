package com.example.practice.java_abstract_prac.re_practicing;

public class BronzeLevel extends PlayerLevel {


    @Override
    public void run() {
        System.out.println("평범한 달리기");
    }

    @Override
    public void jump() {
        System.out.println("점프를 할 수 없다");
    }

    @Override
    public void turn() {
        System.out.println("뒤로 돌 수 없다");
    }

    public void showLevelMessege() {
        System.out.println("Level 은 Bronze 입니다.");
    }
}
