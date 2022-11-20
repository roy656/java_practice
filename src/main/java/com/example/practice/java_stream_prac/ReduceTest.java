package com.example.practice.java_stream_prac;

import java.util.Arrays;
import java.util.function.BinaryOperator;


// BinaryOperator 사용 예제를 위해 생성한 클래스
class CompareString implements BinaryOperator<String> {

    @Override
    public String apply(String s1, String s2) {
        if (s1.getBytes().length >= s2.getBytes().length) {
            return s1;
        } else return s2;
    }
}

public class ReduceTest {

    public static void main(String[] args) {

        // reduce 연산에 람다식 직접 구현하는 방법.
        String greetings[] = {"안녕하세요~~~", "Hello", "Good morning", "반갑습니다!!"};

        System.out.println(Arrays.stream(greetings).reduce("", (s1,s2)-> {
            if (s1.getBytes().length >= s2.getBytes().length) {
                return s1;
            } else return s2;
        }));


        // BinaryOperator 를 implements 한 클래스를 사용하는 방법.

        String str = Arrays.stream(greetings).reduce(new CompareString()).get();
        System.out.println(str);

        // System.out.println(Arrays.stream(greetings).reduce(new CompareString()).get());
    }
}
