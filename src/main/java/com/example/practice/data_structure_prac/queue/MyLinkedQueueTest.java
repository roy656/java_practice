package com.example.practice.data_structure_prac.queue;

public class MyLinkedQueueTest {

    public static void main(String[] args) {

        MylinkedQueue linkedQueue = new MylinkedQueue();
        linkedQueue.enQueue("A");
        linkedQueue.enQueue("B");
        linkedQueue.enQueue("C");

        linkedQueue.printAll();

        System.out.println(linkedQueue.deQueue());
        System.out.println(linkedQueue.deQueue());
    }
}
