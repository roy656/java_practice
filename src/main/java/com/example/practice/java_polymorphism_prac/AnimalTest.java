package com.example.practice.java_polymorphism_prac;

class Animal {
    public void move() {
        System.out.println("동물이 움직인다.");
    }
}

class Human extends Animal {

    @Override
    public void move() {
        System.out.println("사람이 직립 보행을 한다.");
    }

    public void readBook() {
        System.out.println("사람이 책을 읽는다.");
    }
}

class Tioger extends Animal {

    @Override
    public void move() {
        System.out.println("호랑이가 네 발로 뛴다.");
    }

    public void hunting() {
        System.out.println("호랑이가 사냥을 한다.");
    }
}

class Eagle extends Animal {

    public void move() {
        System.out.println("독수리가 하늘을 난다.");
    }

    public void flying() {
        System.out.println("독수리가 날개를 펴고 난다.");
    }
}

public class AnimalTest {

    public static void main(String[] args) {

        Animal human = new Animal();
        Animal tiger = new Animal();
        Animal eagle = new Animal();

        AnimalTest test = new AnimalTest();
        test.moveAnimal(human);
        test.moveAnimal(tiger);
        test.moveAnimal(eagle);
    }

    public void moveAnimal(Animal animal) {
        animal.move();
    }
}
