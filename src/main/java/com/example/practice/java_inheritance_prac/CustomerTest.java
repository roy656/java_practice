package com.example.practice.java_inheritance_prac;

public class CustomerTest {

    public static void main(String[] args) {

        Customer customerChoi = new Customer(10001, "Roy");
        customerChoi.bonusPoint = 3000;
        System.out.println(customerChoi.showCustomerInfo());

        VIPCustomer customerPark = new VIPCustomer(10002, "Olivia");
        customerPark.bonusPoint = 8000;
        System.out.println(customerPark.showCustomerInfo());
   }

}
