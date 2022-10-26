package com.example.practice.java_inheritance_prac;

public class CustomerTest {

    public static void main(String[] args) {

        Customer customerChoi = new Customer(10001, "Roy");
        customerChoi.bonusPoint = 3000;
        int price = customerChoi.calPrice(50000);
        System.out.println(customerChoi.showCustomerInfo() + " 구매 상품 가격은 " + price + " 원 입니다.");

        VIPCustomer customerPark = new VIPCustomer(10002, "Olivia");
        customerPark.bonusPoint = 8000;
        price = customerPark.calPrice(50000);
        System.out.println(customerPark.showCustomerInfo() + " 구매 상품 가격은 " + price + " 원 입니다.");

        Customer vipc = new VIPCustomer(10003, "mari");  // 상위 클래스 타입으로 형변환 된 경우
        System.out.println(vipc.calPrice(50000));       // VIPCustomer 클래스 에서 calPrice 메서드를 재정의 했기 때문에
                                        // 형변환을 한 뒤 메서드를 호출한 경우에도 가상메서드 테이블 에 매핑된 calPrice 메서드의 주소는
                                        // 재정의 된 VIPCustomer 의 calPrice 메서드주소이기 때문에 해당 메서드가 호출되게 된다.
   }
}
