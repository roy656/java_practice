package com.example.practice.collection_framework.set;

public class MemberHashSetTest {

    public static void main(String[] args) {

        MemberHashSet memberHashSet = new MemberHashSet();

        Member memberCol = new Member(10001, "Colin");
        Member memberRoy = new Member(10002, "Roy");
        Member memberKwan = new Member(10003, "Kwan");
        Member memberMartin = new Member(10004, "Martin");

        memberHashSet.addMember(memberCol);
        memberHashSet.addMember(memberRoy);
        memberHashSet.addMember(memberKwan);
        memberHashSet.addMember(memberMartin);

        Member memberOli = new Member(10002, "Olivia");     // HashSet 에는 동일한 값을 가지는 객체가 들어갈 수 없다
        memberHashSet.addMember(memberOli);

        memberHashSet.showAllMember();

    }
}
