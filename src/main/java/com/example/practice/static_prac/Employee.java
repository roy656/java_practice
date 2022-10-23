package com.example.practice.static_prac;

public class Employee {

    private static int serialNum = 1000;    // static 변수 , 인스턴스를 생성하지 않더라도 클래스명으로 호출 가능
                                            // 사번은 중복되면 안되고 변경되면 안되는 중요 정보이기 때문에 private 선언

    private int employeeId;

    private String employeeName;

    private String department;


    public Employee() {

        serialNum++;                // Employee 객체가 생성될 때 마다 시리얼넘버 증가
        employeeId = serialNum;     // 모든 Employee 가 같은 시리얼 넘버를 가지면 안되기에 employeeId 에 복사 적
    }


    public static int getSerialNum() {      // static 메서드 (클래스 메서드 라고도 함)
        return serialNum;
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
