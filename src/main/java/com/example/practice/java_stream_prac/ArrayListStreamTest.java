package com.example.practice.java_stream_prac;

import java.util.ArrayList;
import java.util.stream.Stream;

public class ArrayListStreamTest {

    public static void main(String[] args) {

        ArrayList<String> sList = new ArrayList<>();
        sList.add("Roy");
        sList.add("Olivia");
        sList.add("Mari");

        Stream<String> stream = sList.stream();     // Collection 이하 는 다 stream 을 호출할 수 있다.
        stream.forEach(s-> System.out.println(s));
        System.out.println();

        sList.stream().sorted().forEach(s-> System.out.print(s + "\t"));
        System.out.println();

        sList.stream().map(s->s.length()).forEach(s-> System.out.print(s + "\t"));
        System.out.println();

        sList.stream().filter(s-> s.length() >=4 ).forEach(s-> System.out.println(s));
    }
}
