package com.example.practice.java_generic_prac.generic_extends;

import com.example.practice.java_generic_prac.basic_using_generic.GenericPrinter;
import com.example.practice.java_generic_prac.basic_using_generic.Plastic;
import com.example.practice.java_generic_prac.basic_using_generic.Powder;

public class GenericPrinterTest {

    public static void main(String[] args) {

        Powder powder = new Powder();
        GenericPrinter<Powder> powderPrinter = new GenericPrinter<>();  // new 뒤의 <> 안에는 타입을 안넣어도 상관없다. 컴파일러가 넣어줌.
        powderPrinter.setMaterial(powder);
        System.out.println(powderPrinter.toString());                   // 만약 <> 안에 타입을 지정하지 않으면 Object 로 인식함.


        Plastic plastic = new Plastic();
        GenericPrinter<Plastic> plasticPrinter = new GenericPrinter<>();
        plasticPrinter.setMaterial(plastic);
        System.out.println(plasticPrinter.toString());

    }
}
