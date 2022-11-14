package com.example.practice.java_collection_framework.tree_set;

public class MemberTreeSetTest {

    public static void main(String[] args) {

/*
        TreeSet<String> set = new TreeSet<String>();

        set.add("Roy");
        set.add("Olivia");
        set.add("Mari");

        System.out.println(set);
*/


        MemberTreeSet memberTreeSet = new MemberTreeSet();

        com.example.practice.java_collection_framework.tree_set.Member memberOli = new com.example.practice.java_collection_framework.tree_set.Member(10005, "Olivia");
        com.example.practice.java_collection_framework.tree_set.Member memberCol = new com.example.practice.java_collection_framework.tree_set.Member(10001, "Colin");
        com.example.practice.java_collection_framework.tree_set.Member memberRoy = new com.example.practice.java_collection_framework.tree_set.Member(10002, "Roy");
        com.example.practice.java_collection_framework.tree_set.Member memberKwan = new com.example.practice.java_collection_framework.tree_set.Member(10003, "Kwan");
        com.example.practice.java_collection_framework.tree_set.Member memberMartin = new com.example.practice.java_collection_framework.tree_set.Member(10004, "Martin");

        memberTreeSet.addMember(memberOli);
        memberTreeSet.addMember(memberCol);
        memberTreeSet.addMember(memberRoy);
        memberTreeSet.addMember(memberKwan);
        memberTreeSet.addMember(memberMartin);

        memberTreeSet.showAllMember();

    }
}
