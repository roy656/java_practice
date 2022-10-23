package com.example.practice.java_static_prac.re_practicing;

public class CarFactoryTest {

    public static void main(String[] args) {

        CarFactory carFactory = CarFactory.getInstance();
        Car myIonic5 = carFactory.creatCar();
        myIonic5.setCarName("Ionic5");
        Car myEv6 = carFactory.creatCar();
        myEv6.setCarName("Ev6");

        System.out.println(myIonic5.getCarName() + " 의 차 번호는 " + myIonic5.getCarId() + " 입니다.");
        System.out.println(myEv6.getCarName() + " 의 차 번호는 " + myEv6.getCarId() + " 입니다.");
    }
}
