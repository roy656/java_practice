package com.example.practice.java_inheritance_prac;

public class VIPCustomer extends Customer {

    private String agentId;

    double discountRatio;


    public VIPCustomer(int customerId, String customerName) {
        super(customerId, customerName);
                                        // 하위 클래스의 생성자가 호출될때 상위 클래스의 생성자가 먼저 호출된다.
        customerLevel = "VIP";          // 상위클래스를 호출하는 코드가 없으면 컴파일러가 자동으로 super(); 를 자동으로 넣어준다
        bonusRatio = 0.05;              // 만약 매개변수가 있는 생성자 라면 super(); 로 명시적으로 호출하여 상위 클래스의 참조값을 가지게 한다.
        discountRatio = 0.01;
    }

    @Override                           // 상위 클래스로부터 재정의 된 메소드, 메소드명,매개변수의 개수, 반환타입 은 변경 될 수 없다.
    public int calPrice(int price) {
        bonusPoint += price * bonusRatio;
        return price - (int) (price * discountRatio);
    }


    public String getAgentId() {
        return agentId;
    }
    public void setAgentId(String agentId) {
        this.agentId = agentId;
    }

}
