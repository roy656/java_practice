package com.example.practice.inner_class.anonymous_inner_class;


class Outer2 {               // 외부 클래스

    int outNum = 100;
    static int sNum = 200;

    Runnable getRunnable(int i) {        // 내부 클래스를 사용하는 메서드

        int num = 10;

        class MyRunnable implements Runnable {          // 지역 내부 클래스 (지역변수와 같이 메서드 내부에 정의하여 사용하는 클래스)

            int localNum = 1000;        // 로컬 변수는 stack 메모리에 쌓이므로 메서드 호출이 끝나면 사라지지만 밑의 run 메서드는
                                        // 나중에 또 호출될수 있는 여지가 있기때문에 final 로 선언해 상수화 해야 한다.
                                        // 때문에 값을 바꿀수가 없다.
            @Override
            public void run() {

                System.out.println("i = " + i);
                System.out.println("num = " + num);
                System.out.println("localNum = " + localNum);

                System.out.println("outNum = " + outNum + "(외부 클래스 인스턴스 변수)");
                System.out.println("Outer2.sNum = " + Outer2.sNum + "(외부 클래스 정적 변수)");
            }
        }
        return new MyRunnable();        // 내부 클래스 객체를 반환
    }
}


public class LocalInnerClassTest {

    public static void main(String[] args) {

        Outer2 outer2 = new Outer2();
        Runnable runner = outer2.getRunnable(100);

        runner.run();
    }
}
