package com.example.practice.java_thread_prac;


// ---------- Thread 를 상속하여 만드는 경우 ----------
//// Thread 를 extends 하면 구현해야 되는 메서드는 없으나 Thread 가 수행이 시작되면 run 이라는 메서드가 호출이 되기 때문에 구현을 해야 한다. ****
//class MyThread extends Thread {
//
//    public void run() {
//
//        for (int i = 0; i <= 200; i++) {
//            System.out.print(i+ "\t");
//
//        }
//    }
//}
//
//
//public class ThreadTest {
//
//    public static void main(String[] args) {
//
//        System.out.println( Thread.currentThread() + " start" );
//        MyThread myThread1 = new MyThread();
//        MyThread myThread2 = new MyThread();
//
//        myThread1.start();
//        myThread2.start();
//        System.out.println( Thread.currentThread() + " end");
//
//    }
//}


// ---------- Thread 를 상속 하지 않고 Runnable 을 implements 하여 만드는 경우 ----------
class MyThread implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i <= 200; i++) {
            System.out.print(i + "\t");
        }
    }
}


public class ThreadTest {

    public static void main(String[] args) {

        System.out.println( Thread.currentThread() + " start" );
        MyThread runnableTh = new MyThread();

        Thread thread1 = new Thread(runnableTh);    // Thread 생성시 Runnable 한 객체를 주입 하여 사용해 run 메서드를 호출한다.
        Thread thread2 = new Thread(runnableTh);

        thread1.start();
        thread2.start();
        System.out.println( Thread.currentThread() + " end");
    }
}

