package com.example.practice.java_collection_framework.tree_set;

import java.util.Iterator;
import java.util.TreeSet;

public class MemberTreeSet {

    private TreeSet<Member> treeSet;        // TreeSet 에 Member 객체를 사용 하려면 Comparable 혹은 Comparator 를 implements 해야 한다.

    public MemberTreeSet(){
        treeSet = new TreeSet<Member>();
    }

    public void addMember(Member member){
        treeSet.add(member);
    }

    public boolean removeMember(int memberId){

        Iterator<Member> ir = treeSet.iterator();

        while( ir.hasNext()){
            Member member = ir.next();
            int tempId = member.getMemberId();
            if( tempId == memberId){
                treeSet.remove(member);
                return true;
            }
        }

        System.out.println(memberId + "가 존재하지 않습니다");
        return false;
    }

    public void showAllMember(){
        for(Member member : treeSet){
            System.out.println(member);
        }
        System.out.println();
    }
}
