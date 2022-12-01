package com.example.practice.java_io_stream_prac.decorator_pattern;

public class Hazelnut extends Decorator {

    public Hazelnut(Coffee coffee) {
        super(coffee);
    }

    public void brewing() {
        super.brewing();
        System.out.print("Adding Hazelnut syrup ");
    }
}
