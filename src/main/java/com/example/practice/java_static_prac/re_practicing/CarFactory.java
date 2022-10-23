package com.example.practice.java_static_prac.re_practicing;

public class CarFactory {

    private static CarFactory carFactory = new CarFactory();

    private CarFactory() {
    }

    public static CarFactory getInstance() {
        if (carFactory == null) {
            carFactory = new CarFactory();
        }
        return carFactory;
    }

    public Car creatCar() {
        Car car = new Car();
        return car;
    }
}
