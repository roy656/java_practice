package com.example.practice.java_interface_prac.inherit_multiple_interface;

public interface Sell {

    void sell();

    default void order() {
        System.out.println("sell order");
    }
}
