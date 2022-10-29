package com.example.practice.java_abstract_prac.template_method;

public abstract class Car {

    public abstract void drive();
    public abstract void stop();

    public void start() {
        System.out.println("시동을 켠다");
    }
    public void turnOff() {
        System.out.println("시동을 끈다");
    }

    public void washCar() {}        // 추상 클래스의 추상메서드는 하위 클래스에서 반드시 구현을 해야하지만 {} 를 이용하면 내용은 없지만 추상메서드가
                                    // 아니게 되기 때문에 하위 클래스에서 필요한 경우에만 재정의를 해서 사용할 수 있다.

    public final void run() {
        start();
        drive();
        stop();
        turnOff();
        washCar();
    }

}
