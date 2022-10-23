package com.example.practice.java_static_prac.basic_using_static;

public class EmployeeTest {

    public static void main(String[] args) {

        Employee employeeChoi = new Employee();
        employeeChoi.setEmployeeName("Roy Choi");

        System.out.println(Employee.getSerialNum());        // static 변수,메서드 는 클래스명으로 참조 가능

        Employee employeePark = new Employee();
        employeePark.setEmployeeName("Jin Park");

        System.out.println(employeeChoi.getEmployeeName() + " 님의 사번은" + employeeChoi.getEmployeeId() + " 입니다.");
        System.out.println(employeePark.getEmployeeName() + " 님의 사번은" + employeePark.getEmployeeId() + " 입니다.");
    }
}
