package com.example.practice.object_class.stringbuilder_and_stringbuffer;

public class StringTest {

    public static void main(String[] args) {

        String java = new String("java");
        String spring = new String("spring");

        System.out.println(System.identityHashCode(java));

        java = java.concat(spring);

        System.out.println(System.identityHashCode(java));      // String 클래스는 new 로 생성되면 불변 이기 때문에
                                                                // 두 String 을 잇는다 해도 기존의 String 은 남아있고 이어진 새로운 String 도 생성이 된다.
    }
}
