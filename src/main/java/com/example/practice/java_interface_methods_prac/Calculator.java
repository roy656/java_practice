package com.example.practice.java_interface_methods_prac;

public abstract class Calculator implements Cal {

    @Override
    public int add(int num1, int num2) {
        return num1 + num2;
    }

    @Override
    public int substract(int num1, int num2) {
        return num1 - num2;
    }
}
