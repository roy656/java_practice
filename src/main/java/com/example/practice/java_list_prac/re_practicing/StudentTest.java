package com.example.practice.java_list_prac.re_practicing;

public class StudentTest {

    public static void main(String[] args) {

        Student studentChoi = new Student("Roy",1001);

        studentChoi.addSubject("국어", 100);
        studentChoi.addSubject("수학", 80);
        studentChoi.addSubject("영어", 90);

        Student studentPark = new Student("Olivia", 1002);

        studentPark.addSubject("국어", 70);
        studentPark.addSubject("수학", 90);

        studentChoi.showInfo();
        System.out.println("--------------------");
        studentPark.showInfo();

    }
}
