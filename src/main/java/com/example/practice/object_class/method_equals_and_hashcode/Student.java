package com.example.practice.object_class.method_equals_and_hashcode;

public class Student {

    private int studentNum;
    private String studentName;

    public Student(int studentNum, String studentName) {
        this.studentNum = studentNum;
        this.studentName = studentName;
    }

    public String toString() {
        return studentNum + "," + studentName;
    }

    @Override
    public boolean equals(Object object) {          // 인스턴스들의 메모리 주소값이 달라도 논리적으로 같은 인스턴스로 만들기 위해 메서드를 이용.
        if (object instanceof Student) {

            Student student = (Student)object;      // Student 클래스로 다운 캐스팅.
            if (this.studentNum == student.studentNum) {
                return true;
            } else {
                return false;
            }
        }
        return false;
    }

    @Override
    public int hashCode() {
        return studentNum;
    }


}
