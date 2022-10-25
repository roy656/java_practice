package com.example.practice.java_inheritance_prac;

public class CustomerTest {

    public static void main(String[] args) {

        Customer customerChoi = new Customer();
        customerChoi.setCustomerName("Roy");
        customerChoi.setCustomerId(10001);
        customerChoi.bonusPoint = 3000;
        System.out.println(customerChoi.showCustomerInfo());

        VIPCustomer customerPark = new VIPCustomer();
        customerPark.setCustomerName("Olivia");
        customerPark.setCustomerId(10002);
        customerPark.bonusPoint = 8000;
        System.out.println(customerPark.showCustomerInfo());
   }

}
