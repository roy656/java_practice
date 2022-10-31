package com.example.practice.java_interface_prac.inherit_multiple_interface;

public class CustomerTest {

    public static void main(String[] args) {

        Customer customer = new Customer();

        customer.buy();
        customer.sell();
        customer.order();
        customer.hello();

        Buy buyer = customer;       // 업캐스팅. 타입을 내포하고 있으며 상위 클래스 타입으로 묵시적 형변환.
        buyer.buy();
        buyer.order();              // 이 경우 구현 가능한 메서드는 Buy 에 선언된 이 두가지 메서드 밖에 없다. (Buy 에서 재정의 된 경우 재정의 된 내용으로)

        Sell seller = customer;     // 당연히 Sell 로 업캐스팅 경우도 마찬가지.
        seller.sell();
        seller.order();

    }
}
