package com.example.practice.java_interface_prac.re_practicing;

import java.io.IOException;

public class SchedulerTest {

    public static void main(String[] args) throws IOException {

        System.out.println("전화 상담원 할당 방식을 선택하세요");
        System.out.println("R : 한명씩 차례대로");
        System.out.println("L : 대기가 적은 상담원 우선");
        System.out.println("P : 우선순위가 높은 고객우선 숙련도 높은 상담원");



        Scheduler scheduler = null;
        int ch = System.in.read();

        if ( ch == 'R' || ch == 'r') {

            scheduler = new RoundRobin();

        } else if ( ch == 'L' || ch == 'l') {

            scheduler = new LeastJob();

        } else if (ch == 'P' || ch == 'p') {

            scheduler = new PriorityAllocation();

        } else {

                System.out.println("지원하지 않는 기능 입니다. 다시한번 눌러 주십시오.");

            return;
            }




        scheduler.getNextCall();
        scheduler.senCallToAgent();
        }
    }
