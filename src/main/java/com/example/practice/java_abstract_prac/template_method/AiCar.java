package com.example.practice.java_abstract_prac.template_method;

public class AiCar extends Car {


    @Override
    public void drive() {
        System.out.println("자율 주행을 합니다");
        System.out.println("자동차가 자율적으로 방향을 바꿉니다.");
    }

    @Override
    public void stop() {
        System.out.println("장애물로 인해 스스로 정지 합니다");
    }
}
