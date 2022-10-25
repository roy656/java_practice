package com.example.practice.java_inheritance_prac;

public class Customer {

    protected int customerId;
    protected String customerName;
    protected String customerLevel;
    int bonusPoint;
    double bonusRatio;


    public Customer() {
        customerLevel = "bronze";
        bonusRatio = 0.01;
    }

    public int calPrice(int price) {
        bonusPoint += price * bonusRatio;
        return price;
    }

    public String showCustomerInfo() {
        return customerName + " 님의 등급은 " + customerLevel + " 이며, 보너스 포인트는 " + bonusPoint + " 포인트 입니다.";
    }


    public String getCustomerName() {
        return customerName;
    }
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
    public String getCustomerLevel() {
        return customerLevel;
    }
    public void setCustomerLevel(String customerLevel) {
        this.customerLevel = customerLevel;
    }
    public int customerId() {
        return customerId;
    }
    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

}
