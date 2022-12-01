package com.example.practice.java_io_stream_prac.decorator_pattern;

public abstract class Decorator extends Coffee{

    Coffee coffee;

    public Decorator(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public void brewing() {
        coffee.brewing();
    }
}
