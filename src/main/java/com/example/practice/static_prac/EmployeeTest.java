package com.example.practice.static_prac;

public class EmployeeTest {

    public static void main(String[] args) {

        Employee employeeChoi = new Employee();
        employeeChoi.setEmployeeName("Roy Choi");

        System.out.println(Employee.serialNum);

        Employee employeePark = new Employee();
        employeePark.setEmployeeName("Jin Park");

        System.out.println(employeeChoi.getEmployeeName() + " 님의 사번은" + employeeChoi.getEmployeeId() + " 입니다.");
        System.out.println(employeePark.getEmployeeName() + " 님의 사번은" + employeePark.getEmployeeId() + " 입니다.");
    }
}
