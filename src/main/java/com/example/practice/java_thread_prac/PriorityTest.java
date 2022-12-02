package com.example.practice.java_thread_prac;


class PriorityThread extends Thread {

    public void run() {

        int sum = 0;
        Thread thread = Thread.currentThread();
        System.out.println(thread + " start");

        for (int i = 0; i <= 1000000; i++) {
            sum += i;
        }

        System.out.println(thread.getPriority() + " end");
    }
}


public class PriorityTest {

    public static void main(String[] args) {

        int i;
//        for(i=Thread.MIN_PRIORITY; i<=Thread.MAX_PRIORITY; i++) {

        PriorityThread pth1 = new PriorityThread();
        PriorityThread pth2 = new PriorityThread();
        PriorityThread pth3 = new PriorityThread();
        pth1.setPriority(Thread.MIN_PRIORITY);
        pth2.setPriority(Thread.NORM_PRIORITY);
        pth3.setPriority(Thread.MAX_PRIORITY);

        pth1.start();
        pth2.start();
        pth3.start();

    }
}
