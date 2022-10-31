package com.example.practice.java_interface_prac.inherit_multiple_interface;

public interface Buy {

    void buy();

    default void order() {
        System.out.println("buy order");
    }


}
