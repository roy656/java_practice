package com.example.practice.java_list_prac.arraylist;

import com.example.practice.java_list_prac.basic_using_list.Book;

import java.util.ArrayList;

public class ArrayListTest {

    public static void main(String[] args) {

        ArrayList<Book> library = new ArrayList<>();        // 비어있는 배열을 생성

        library.add(new Book("성공1", "최명순"));        // 객체를 생성해서 배열에 추가
        library.add(new Book("성공2", "최명순"));
        library.add(new Book("성공3", "최명순"));
        library.add(new Book("성공4", "최명순"));
        library.add(new Book("성공5", "최명순"));

        for (int i = 0; i < library.size(); i++) {          // 배열의 객체 요소를 하나씩 꺼내와서 출력
            library.get(i).showInfo();

        }

    }
}