package com.example.practice.java_interface_methods_prac;

public class CalculatorTest {

    public static void main(String[] args) {

        int num1 = 10;
        int num2 = 2;

        CompleteCalc comp = new CompleteCalc();
        System.out.println(comp.add(num1,num2));
        System.out.println(comp.substract(num1,num2));
        System.out.println(comp.times(num1,num2));
        System.out.println(comp.divide(num1,num2));

        comp.description();                         // description 은 default 메서드 이기에 바로 호출 가능.
                                                    // default 메서드는 재정의 하여 사용 가능.
        int[] arr = {1,2,3,4,5};
        System.out.println(Cal.total(arr));         // total 은 static 메서드 이기에 인스턴스의 생성과는 상관없이 클래스,인터페이스 명으로 호출 가능.
    }
}
