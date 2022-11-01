package com.example.practice.java_interface_prac.re_practicing;

public class LeastJob implements Scheduler {
    @Override
    public void getNextCall() {
        System.out.println("상담 전화를 순서대로 대기 리스트에서 가져옵니다.");
    }

    @Override
    public void senCallToAgent() {
        System.out.println("대기중인 고객이 가장 적은 상담원에게 연결 합니다.");
    }
}
