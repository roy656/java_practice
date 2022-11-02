package com.example.practice.object_class;


class Book {

    private String title;
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    @Override
    public String toString() {
        return title + "," + author;

    }
}

public class BookTest {

    public static void main(String[] args) {

        Book book = new Book("성공", "Roy");

        System.out.println(book);           // 변수의 주소값만 출력됨 (가상 메모리 값)
                                            // 위처럼 Object 클래스의 toSting 메서드를 재정의 해서 사용하면 책제목,저자 같은걸로 출력 가능

        String str = new String("Test");

        System.out.println(str);            // toString 메서드가 Override 가 되어 있어서 문자열이 출력 됨.
    }
}
