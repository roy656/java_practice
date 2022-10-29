package com.example.practice.java_abstract_prac.template_method;

public class CarTest {

    public static void main(String[] args) {

        Car aicar = new AiCar();
        aicar.run();
        System.out.println("==========================");

        Car manualCar = new ManualCar();
        manualCar.run();
    }
}
