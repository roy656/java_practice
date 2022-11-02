package com.example.practice.object_class.stringbuilder_and_stringbuffer;

public class StringBuilderTest {

    public static void main(String[] args) {

        String java = new String("java");
        String spring = new String("spring");

        StringBuilder buffer = new StringBuilder(java);
        System.out.println(System.identityHashCode(buffer));    // 같은 StringBuilder 안에 추가되기 때문에 계속 같은 주소값을 가진다.

        buffer.append(spring);
        System.out.println(System.identityHashCode(buffer));

        String test = buffer.toString();

        System.out.println(test);
    }
}
