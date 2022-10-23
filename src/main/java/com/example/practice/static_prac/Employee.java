package com.example.practice.static_prac;

public class Employee {

    public static int serialNum = 1000;

    private int employeeId;

    private String employeeName;

    private String department;


    public Employee() {

        serialNum++;                // Employee 객체가 생성될 때 마다 시리얼넘버 증가
        employeeId = serialNum;     // 모든 Employee 가 같은 시리얼 넘버를 가지면 안되기에 employeeId 에 복사 적용
    }


    public int getEmployeeId() {
        return employeeId;
    }
    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }
    public String getEmployeeName() {
        return employeeName;
    }
    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }
    public String getDepartment() {
        return department;
    }
    public void setDepartment(String department) {
        this.department = department;
    }
}
