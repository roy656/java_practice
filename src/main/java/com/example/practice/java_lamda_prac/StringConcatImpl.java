package com.example.practice.java_lamda_prac;

public class StringConcatImpl implements StringConcat {


    @Override
    public void makeString(String s1, String s2) {
        System.out.println(s1 + "," + s2);
    }
}
