package com.example.practice.java_thread_prac;

import java.io.IOException;

public class TerminateThreadTest extends Thread {

    private boolean flag = false;       // flag 라는 boolean 변수를 false 로 놓고 트리거로 사용.
    int i;

    public TerminateThreadTest(String name){
        super(name);
    }

    public void run(){

        // flag 가 기본적으로 false 이므로 무한 루프로 계속 돌아가는 쓰레드 구현
        while(!flag){
            try {
                sleep(100);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }

        System.out.println( getName() + " end" );

    }

    public void setFlag(boolean flag){      // Thead 를 멈추기 위해 true 로 바꾸게 할 수 있는 set 메서드
        this.flag = flag;
    }


    public static void main(String[] args) throws IOException {

        TerminateThreadTest threadA = new TerminateThreadTest("A");
        TerminateThreadTest threadB = new TerminateThreadTest("B");
        TerminateThreadTest threadC = new TerminateThreadTest("C");

        threadA.start();
        threadB.start();
        threadC.start();

        int in;
        while(true){
            in = System.in.read();      // 각 문자를 입력시 flag 를 true 로 set 하여 해당 쓰레드가 멈추도록 구현
            if ( in == 'A'){
                threadA.setFlag(true);
            }else if(in == 'B'){
                threadB.setFlag(true);
            }else if( in == 'C'){
                threadC.setFlag(true);
            }else if( in == 'M'){
                threadA.setFlag(true);
                threadB.setFlag(true);
                threadC.setFlag(true);
                break;
            }else{
                System.out.println("type again");
            }
        }

        System.out.println("main end");

    }

}
