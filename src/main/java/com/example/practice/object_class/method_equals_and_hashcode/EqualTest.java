package com.example.practice.object_class.method_equals_and_hashcode;

public class EqualTest {

    public static void main(String[] args) {

        Student student = new Student(1001, "Roy");
        Student student2 = new Student(1001, "Roy");
        Student student3 = student;

        System.out.println(student == student2);            // == 는 인스턴스의 메모리 주소값을 비교한다.
        System.out.println(student.equals(student2));       // equals 는 주소는 달라고 논리적으로 같으면 true 를 반환하게 할 수 있다.
        System.out.println(student == student3);

        System.out.println(student.hashCode());             // 원래는 메모리 주소값이 반환이 되지만 Override 하여 학번을 반환하도록
        System.out.println(student2.hashCode());            // 재정의 해서 같은 값을 반환하게 한다. 즉 같은 인스턴스로 인식하게 한다.

        System.out.println(System.identityHashCode(student));   // 재정의 했어도 System.identityHashCode 를 사용하면 원래 메모리 주소값을 알수 있다.
        System.out.println(System.identityHashCode(student2));
    }
}
