package com.example.practice.java_io_stream_prac.decorator_pattern;

public class Cinnamon extends Decorator {

    public Cinnamon(Coffee coffee) {
        super(coffee);
    }

    public void brewing() {
        super.brewing();
        System.out.print("Adding cinnamon Powder ");
    }
}
