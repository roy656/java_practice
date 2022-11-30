package com.example.practice.java_serialization_prac;

import java.io.*;

/*

인스턴스의 상태를 그대로 파일 저장하거나 네트웍으로 전송하고 (serialization) 이를 다시 복원(deserialization) 하는 방식
자바에서는 보조 스트림을 활용하여 직렬화를 제공함
ObjectInputStream 과 ObjectOutputStream

 */

class Person implements Serializable{

    String name;
    String job;

    transient String address;       // 직렬화가 불가능하거나, 직렬화를 원치 않는 멤버에
                                    // transient 를 적용하면 직렬화가 안되어 null 로 들어간다.
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

        // 직렬화 할 객체 생성
        Person roy = new Person("Roy", "Programmer");
        Person olivia = new Person("Olivia", "Boss");

        // 객체 자체를 사용 하기 때문에 ObjectOutputStream 로 감싼 후 writeObject 메서드로 쓰기
        try(FileOutputStream fos = new FileOutputStream("serial.txt")) {
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            // Serialize 를 하려면 해당 객체에 대한 직렬화 의도를 명시적으로 표시해야하기 때문에
            // 해당 객체 클래스는 Serializable 를 implements 해야 한다.
            oos.writeObject(roy);
            oos.writeObject(olivia);

        } catch(IOException e) {
            e.printStackTrace();
        }

        // 마찬가지로 ObjectInputStream 이용 하여 읽기
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

/*
프로그래머가 직접 객체를 읽고 쓰는 코드를 구현하기 원하면 Externalizable 를 implements 하면 된다.
writerExternal()과 readExternal()메서드를 구현해야 함

Ex) @Override
	public void writeExternal(ObjectOutput out) throws IOException {
		out.writeUTF(name);
		//out.writeUTF(job);
	}

	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		name = in.readUTF();
		//job = in.readUTF();
	}

 */