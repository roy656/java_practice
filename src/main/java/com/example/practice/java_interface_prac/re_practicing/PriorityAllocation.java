package com.example.practice.java_interface_prac.re_practicing;

public class PriorityAllocation implements Scheduler {
    @Override
    public void getNextCall() {
        System.out.println("등급이 높은 고객의 Call 을 먼저 가져옵니다.");
    }

    @Override
    public void senCallToAgent() {
        System.out.println("중요 고객을 숙련 상담원에게 배분 합니다.");
    }
}
