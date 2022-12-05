package com.example.practice.java_thread_prac;

public class JoinTest extends Thread {

    int start;
    int end;
    int total;

    public JoinTest(int start, int end) {
        this.start = start;
        this.end = end;
    }

    public void run() {
        int i;
        for(i = start; i <= end; i++) {
            total += i;
        }
    }

    public static void main(String[] args) {

        JoinTest j1 = new JoinTest(1,50);
        JoinTest j2 = new JoinTest(51,100);

        j1.start();
        j2.start();

        // main Thread 는 j1,j2 의 결과값이 필요 하기 때문에 join() 메서드를 사용해 nowRunnable 로 대기 시켜 놓는다.
        try {
            j1.join();
            j2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        int lastTotal = j1.total + j2.total;

        System.out.println("j1.total = " + j1.total);
        System.out.println("j2.total = " + j2.total);
        System.out.println("lastTotal = " + lastTotal); // 그냥 실행하면 j1,j2 가 끝나기 전에 수행이 되어 0 으로 찍히지만
                                                        // join() 메서드를 이용하면 앞의 Tread 들이 결과를 낼때까지 기다렸다가 수행 된다.
    }
}
