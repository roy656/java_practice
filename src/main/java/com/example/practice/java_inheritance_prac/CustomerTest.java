package com.example.practice.java_inheritance_prac;

import java.util.ArrayList;

public class CustomerTest {

    public static void main(String[] args) {

//        Customer customerChoi = new Customer(10001, "Roy");
//        customerChoi.bonusPoint = 3000;
//        int price = customerChoi.calPrice(50000);
//        System.out.println(customerChoi.showCustomerInfo() + " 구매 상품 가격은 " + price + " 원 입니다.");
//
//        VIPCustomer customerPark = new VIPCustomer(10002, "Olivia");
//        customerPark.bonusPoint = 8000;
//        price = customerPark.calPrice(50000);
//        System.out.println(customerPark.showCustomerInfo() + " 구매 상품 가격은 " + price + " 원 입니다.");
//
//
//        // 가상 메서드 확인을 위한 타입 변경
//        Customer vipc = new VIPCustomer(10003, "mari");  // 상위 클래스 타입으로 형변환 된 경우
//        System.out.println(vipc.calPrice(50000));       // VIPCustomer 클래스 에서 calPrice 메서드를 재정의 했기 때문에
//                                        // 형변환을 한 뒤 메서드를 호출한 경우에도 가상메서드 테이블 에 매핑된 calPrice 메서드의 주소는
//                                        // 재정의 된 VIPCustomer 의 calPrice 메서드주소이기 때문에 해당 메서드가 호출되게 된다.
//   }


        // ArrayList 사용 해보기
        ArrayList<Customer> customerList = new ArrayList<>();

        Customer Colin = new Customer(10004, "Colin");
        Customer Elly = new Customer(10005, "Elly");
        Customer Kwan = new GoldCustomer(10006, "Kwan");
        Customer Lila = new GoldCustomer(10007, "Lila");
        Customer Martin = new VIPCustomer(10008, "Martin");

        customerList.add(Colin);
        customerList.add(Elly);
        customerList.add(Kwan);
        customerList.add(Lila);
        customerList.add(Martin);

        for (Customer customer: customerList) {
            System.out.println(customer.showCustomerInfo());
        }
                                                        // 다형성을 사용한 예제.
        int price = 10000;
        for (Customer customer: customerList) {

            int cost = customer.calPrice(price);
            System.out.println(customer.getCustomerName() + " 님의 사용 금액은 " + cost + " 원 입니다." );
            System.out.println(customer.getCustomerName() + " 님의 보너스 포인트는 " + customer.bonusPoint + " 입니다.");
        }

        }
}
