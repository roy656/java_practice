package com.example.practice.java_inheritance_prac;

public class GoldCustomer extends Customer {        // 골드 회원 추가.

    double discountRatio;




    public GoldCustomer(int customerId, String customerName) {      // 기본 생성자 생성
        super(customerId, customerName);

        customerLevel = "Gold";
        discountRatio = 0.1;
        bonusRatio = 0.02;
    }

    @Override
    public int calPrice(int price) {        // 상위 클래스에서 메소드 오버라이드.
        bonusPoint += price * bonusRatio;
        return price - (int) (price * discountRatio);
    }



}
