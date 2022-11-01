package com.example.practice.java_interface_prac.extends_and_implements;

public class BookShelfTest {

    public static void main(String[] args) {

        Queue bookQueue = new BookShelf();

        bookQueue.enQueue("자바의정석1");
        bookQueue.enQueue("자바의정석2");
        bookQueue.enQueue("자바의정석3");
        bookQueue.enQueue("자바의정석4");
        bookQueue.enQueue("자바의정석5");

        System.out.println(bookQueue.getSize());
        System.out.println(bookQueue.deQueue());
        System.out.println(bookQueue.deQueue());
        System.out.println(bookQueue.deQueue());
        System.out.println(bookQueue.deQueue());
        System.out.println(bookQueue.deQueue());
    }
}
