package com.example.practice.java_list_prac.re_practicing;

import java.util.ArrayList;
import java.util.List;

public class Student {

    private int studentId;
    private String studentName;

    private ArrayList<Subject> subjectList;

    public Student() {
    }

    public Student(String studentName, int studentId) {     // 학생 객체를 생성시에 과목 배열을 생성하도록 설계
        this.studentName = studentName;
        this.studentId = studentId;

        subjectList = new ArrayList<Subject>();
    }

    public void addSubject(String name, int score) {        // 과목의 이름과 점수를 추가 할수 있게 메소드 생성
        Subject subject = new Subject();
        subject.setSubjectName(name);
        subject.setScore(score);

        subjectList.add(subject);
    }

    public void showInfo() {

        int total = 0;

        for (Subject subject : subjectList) {

            total += subject.getScore();

            System.out.println(studentName + " 학생의 " + subject.getSubjectName() + " 과목 점수는 " + subject.getScore() + " 점 입니다.");
        }
        System.out.println(studentName + " 학생의 총점 은 " + total + " 점 입니다.");
    }


    public int getStudentId() {
        return studentId;
    }
    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }
    public String getStudentName() {
        return studentName;
    }
    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }
}
