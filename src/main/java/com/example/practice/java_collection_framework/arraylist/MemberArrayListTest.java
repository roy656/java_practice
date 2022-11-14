package com.example.practice.java_collection_framework.arraylist;

public class MemberArrayListTest {

    public static void main(String[] args) {

        MemberArrayList memberArrayList = new MemberArrayList();

        Member memberCol = new Member(10001, "Colin");
        Member memberRoy = new Member(10002, "Roy");
        Member memberKwan = new Member(10003, "Kwan");
        Member memberMartin = new Member(10004, "Martin");

        memberArrayList.addMember(memberCol);
        memberArrayList.addMember(memberRoy);
        memberArrayList.addMember(memberKwan);
        memberArrayList.addMember(memberMartin);

        memberArrayList.showAllMember();

        memberArrayList.removeMember(memberMartin.getMemberId());

        memberArrayList.showAllMember();
    }
}
