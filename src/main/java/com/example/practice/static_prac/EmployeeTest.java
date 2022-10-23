package com.example.practice.static_prac;

public class EmployeeTest {

    public static void main(String[] args) {

        Employee employeeChoi = new Employee();
        employeeChoi.setEmployeeName("Roy Choi");
        System.out.println(employeeChoi.serialNum);

        Employee employeePark = new Employee();
        employeePark.setEmployeeName("Jin Park");
        employeePark.serialNum++;

        System.out.println(employeeChoi.serialNum);
        System.out.println(employeePark.serialNum);
    }
}
