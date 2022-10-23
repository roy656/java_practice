package com.example.practice.static_prac;

public class Employee {

    public static int serialNum = 1000;

    private int employeeId;

    private String employeeName;

    private String department;

    public int getEmployeeId() {
        return employeeId;
    }
    public int setEmployeeId(int employeeId) {
        return employeeId;
    }
    public String getEmployeeName() {
        return employeeName;
    }
    public String setEmployeeName(String employeeName) {
        return employeeName;
    }
    public String getDepartment() {
        return department;
    }
    public String setDepartment(String department) {
        return department;
    }
}
