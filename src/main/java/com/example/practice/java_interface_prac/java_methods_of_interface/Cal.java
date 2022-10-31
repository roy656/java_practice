package com.example.practice.java_interface_prac.java_methods_of_interface;

public interface Cal {

    double PI = 3.14;
    int ERROR = -999999;

    int add(int num1, int num2);
    int substract(int num1, int num2);
    int times(int num1, int num2);
    int divide(int num1, int num2);

    default void description() {                    // 인터페이스의 default 메서드
        System.out.println("정수의 사칙연산을 제공합니다.");
    }

    static int total(int[] arr) {                   // 인터페이스의 static 메서드
        int total = 0;
        for (int num : arr) {
            total += num;
        }

        return total;
    }
}
