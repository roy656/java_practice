package com.example.practice.java_list_prac;

public class ObjectCopyTest {

    public static void main(String[] args) {

        Book[] library = new Book[5];

        library[0] = new Book("성공1", "최명순");    // 배열의 자리마다 객체를 직접 생성
        library[1] = new Book("성공2", "최명순");
        library[2] = new Book("성공3", "최명순");
        library[3] = new Book("성공4", "최명순");
        library[4] = new Book("성공5", "최명순");

        for (Book book : library) {
            System.out.println(book);
            book.showInfo();
        }
    }
}
