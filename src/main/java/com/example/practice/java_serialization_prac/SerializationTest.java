package com.example.practice.java_serialization_prac;


import java.io.*;

class Person implements Serializable{

    String name;
    String job;

    public Person() {
    }
    public Person(String name, String job) {
        this.name = name;
        this.job = job;
    }

    public String toString() {
        return name + " , " + job;
    }
}

public class SerializationTest {

    public static void main(String[] args) {

        Person roy = new Person("Roy", "Programmer");
        Person olivia = new Person("Olivia", "Boss");

        try(FileOutputStream fos = new FileOutputStream("serial.txt")) {
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(roy);
            oos.writeObject(olivia);

        } catch(IOException e) {
            e.printStackTrace();
        }

        try(FileInputStream fis = new FileInputStream("serial.txt")) {
            ObjectInputStream ois = new ObjectInputStream(fis);

            Person personRoy = (Person)ois.readObject();
            Person personOlivia = (Person)ois.readObject();

            System.out.println(personRoy);
            System.out.println(personOlivia);

        } catch(IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
