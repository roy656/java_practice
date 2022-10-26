package com.example.practice.java_inheritance_prac;

public class VIPCustomer extends Customer {

    private String agentId;

    double discountRatio;


    public VIPCustomer(int customerId, String customerName) {
        super(customerId, customerName);
                                        // 하위 클래스의 생성자가 호출될때 상위 클래스의 생성자가 먼저 호출된다.
        customerLevel = "VIP";          // 상위클래스를 호출하는 코드가 없으면 컴파일러가 자동으로 super(); 를 자동으로 넣어준다
        bonusRatio = 0.05;              // super(); 로 상위 클래스의 참조값을 가지게 한다.
        discountRatio = 0.01;
    }

    @Override
    public int calPrice(int price) {
        bonusPoint += price * bonusRatio;
        price -= (int) price * discountRatio;
        return price;
    }


    public String getAgentId() {
        return agentId;
    }
    public void setAgentId(String agentId) {
        this.agentId = agentId;
    }

}
