package com.example.practice.java_list_prac.basic_using_list;

public class BookTest {     // 객체 배열의 선언과 구현

    public static void main(String[] args) {

        Book[] library = new Book[5];       // 이렇게 new 를 해도 Book 객체가 5개 생성되는것이 아니라
                                            // 5개의 Book 이 들어갈 참조 변수, 객체의 주소가 들어갈 메모리만 할당 된다.

//        for (int i = 0; i < library.length; i++ ) {
//            System.out.println(library[i]);       // 확인 할 경우 객체가 생성된것이 아니기 때문에 null 로 출력됨.
//        }

        library[0] = new Book("성공1", "Roy");    // 배열의 자리마다 객체를 직접 생성
        library[1] = new Book("성공2", "Roy");
        library[2] = new Book("성공3", "Roy");
        library[3] = new Book("성공4", "Roy");
        library[4] = new Book("성공5", "Roy");

        for (Book book : library) {     // Book 객체를 배열에서 하나씩 꺼내와서 출력 확인
            System.out.println(book);
            book.showInfo();
        }

    }
}
