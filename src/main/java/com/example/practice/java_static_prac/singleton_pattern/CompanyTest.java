package com.example.practice.java_static_prac.singleton_pattern;

import java.util.Calendar;

public class CompanyTest {

    public static void main(String[] args) {

        Company company1 = Company.getInstance();
        Company company2 = Company.getInstance();

        System.out.println(company1);
        System.out.println(company2);       // 결과는 두개 다 같은 주소를 갖게 됨.
                                            // Company 는 외부에서 생성할수도 없고 내부에만 private 으로 생성 되어 있는 상태이고
                                            // getInstance 메서드만 제공 되기 때문에 제공된것만 사용하게 하는 것이 Singleton pattern

        Calendar calendar = Calendar.getInstance();     // Calender 같은 경우도 마찬가지로 유일한 객체를 제공하는 Singleton pattern 을 사용.

    }
}
