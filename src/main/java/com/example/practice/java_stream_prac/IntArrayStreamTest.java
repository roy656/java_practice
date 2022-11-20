package com.example.practice.java_stream_prac;

import java.util.Arrays;
import java.util.stream.IntStream;

public class IntArrayStreamTest {

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5};

        for (int num : arr) {
            System.out.println(num);
        }

        // Arrays.stream(arr) 은 IntStream 을 반환하며 IntStream 인터페이스 안에 많은 메서드들이 있다.
        Arrays.stream(arr).forEach(num-> System.out.println(num));  // Arrays 의 stream 활용
        // 위와 동일 하며 IntStream 을 반환한다는 증명.
        // IntStream ints = Arrays.stream(arr);
        // ints.forEach(...)

        int sum = Arrays.stream(arr).sum();     // stream 은 연산이 끝난후 소멸되어 재사용이 불가능하기때문에 다시 생성하여 사용해야함.
        System.out.println(sum);
    }
}

/*
    - 자료의 대상과 관계없이 동일한 연산을 수행.
        배열,컬렉을 대상으로 연산 수행.
        일관성있는 연산으로 자료의 처리를 쉽고 간단하게 함.
        자료의 처리에 대한 추상화가 구현되었다고 함.

    - 한번 생성하고 사용한 스트림은 재사용이 불가.

    - 스트림 연산은 기존 자료를 변경하지 않음.
        자료에 대한 스트림을 생성하면 스트림이 사용하는 메모리공간은 별도로 생성되므로 연산이 수행되도 자료에 대한 변경이 발생하지 않음.

    - 스트림 연산은 중간 연산과 최종연산으로 구분 됨.
        중간연산은 여러개의 연산이 적용될수 있지만 최종연산은 마지막에 한번만 적용됨.
        최종연산이 수행되어져야지만 중간연산에 대한 수행이 이루어 지고 결과가 만들어짐.
        따라서 중간연산에 대한 결과를 연산중에 알수 없음.
        이를 '지연연산' 이라고 함.
 */