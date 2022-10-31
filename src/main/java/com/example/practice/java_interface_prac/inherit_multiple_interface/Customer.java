package com.example.practice.java_interface_prac.inherit_multiple_interface;

public class Customer implements Buy, Sell {        // 여러 인터페이스 구


    @Override
    public void buy() {
        System.out.println("customer buy");
    }

    @Override
    public void order() {
        //Sell.super.order();     // Buy 혹은 Sell 둘중에 하나를 선택을 하여 구현 하던지,
        System.out.println("customer order");       // 아니면 그냥 재정의 해서 구현해도 된다.
    }

    @Override
    public void sell() {
        System.out.println("customer sell");
    }

    public void hello() {
        System.out.println("hello");
    }
}
