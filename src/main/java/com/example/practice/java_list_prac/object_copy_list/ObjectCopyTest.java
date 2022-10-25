package com.example.practice.java_list_prac.object_copy_list;

import com.example.practice.java_list_prac.basic_using_list.Book;

public class ObjectCopyTest {

    public static void main(String[] args) {

        Book[] library = new Book[5];
        Book[] copylibrary = new Book[5];

        library[0] = new Book("성공1", "최명순");    // 배열의 자리마다 객체를 직접 생성
        library[1] = new Book("성공2", "최명순");
        library[2] = new Book("성공3", "최명순");
        library[3] = new Book("성공4", "최명순");
        library[4] = new Book("성공5", "최명순");

        System.arraycopy(library, 0, copylibrary, 0, 5);    // 파라미터 (복사할 배열, 의 인덱스, 복사될 배열, 의 인덱스, 복사할 배열길이)

        System.out.println("**** library ****");
        for (Book book : library) {
            System.out.println(book);
            book.showInfo();
        }

        System.out.println("**** copy library ****");       // library 배열 의 객체들을 복사 했지만 주소값만 복사 됐기 때문에
        for (Book book : copylibrary) {                     // 한쪽의 객체에 변화가 생기면 둘다 영향을 받는다. (얕은 복사)
            System.out.println(book);
            book.showInfo();                                // 만약 복사를 해도 각자 다른 객체를 가지고 싶으면
                                                            // copylibrary 배열에 객체를 따로 생성 해야 한다. (깊은 복사)
        }
    }
}
