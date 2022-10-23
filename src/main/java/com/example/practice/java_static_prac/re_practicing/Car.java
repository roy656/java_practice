package com.example.practice.java_static_prac.re_practicing;

public class Car {

    private static int serialNum = 10000;

    private int carId;

    private String carName;


    public Car() {

        serialNum++;
        carId = serialNum;
    }


    public int getCarId() {
        return carId;
    }
    public void setCarId(int carId) {
        this.carId = carId;
    }
    public String getCarName() {
        return carName;
    }
    public void setCarName(String carName) {
        this.carName = carName;
    }
}
