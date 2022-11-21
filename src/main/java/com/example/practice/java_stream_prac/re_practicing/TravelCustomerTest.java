package com.example.practice.java_stream_prac.re_practicing;

import java.util.ArrayList;
import java.util.List;

public class TravelCustomerTest {

    public static void main(String[] args) {

        TravelCustomer customerRoy = new TravelCustomer("Roy", 34, 100);
        TravelCustomer customerOli = new TravelCustomer("Olivia", 32, 100);
        TravelCustomer customerMari = new TravelCustomer("Mari", 3, 50);

        ArrayList<TravelCustomer> cusTomerList = new ArrayList<>();
        cusTomerList.add(customerRoy);
        cusTomerList.add(customerOli);
        cusTomerList.add(customerMari);

        System.out.println("고객 명단 출력");
        cusTomerList.stream().map(c->c.getName()).forEach(s-> System.out.println(s));

        System.out.println("여행비용");
        System.out.println(cusTomerList.stream().mapToInt(c->c.getPrice()).sum());

        System.out.println("성인 고객 명단 정렬");
        cusTomerList.stream().filter(c->c.getAge() >= 20).map(c->c.getName()).sorted().forEach(c-> System.out.println(c));

    }
}
