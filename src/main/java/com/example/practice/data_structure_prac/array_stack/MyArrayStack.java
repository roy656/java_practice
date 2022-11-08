package com.example.practice.data_structure_prac.array_stack;

import com.example.practice.data_structure_prac.array_list.MyArray;

public class MyArrayStack {

    MyArray arrayStack;
    int top;

    public MyArrayStack() {
        top = 0;
        arrayStack = new MyArray();
    }

    public MyArrayStack(int size) {
        top = 0;
        arrayStack = new MyArray(size);
    }

    // 자료를 넣는다 top 으로
    public void push(int data) {            // 배열 일때는 배열이 꽉 찼는지 확인 해야한다(더 넣을수 없기 때문에). linked list 는 상관없음.
        if( isFull() ) {
            System.out.println("stack is full");
            return;
        }
        arrayStack.addElement(data);
        top++;                              // count 가 아니라 stack 이니까 top.
    }

    // 자료를 꺼내온다 (stack 에선 삭제됨)
    public int pop() {
        if( isEmpty() ) {
            System.out.println("stack is empty");
            return MyArray.ERROR_NUM;
        }
        return arrayStack.removeElement(--top);
    }

    // 자료를 꺼내서 확인만 한다 (삭제X)
    public int peek() {
        if( isEmpty() ) {
            System.out.println("stack is empty");
            return MyArray.ERROR_NUM;
        }
        return arrayStack.getElement(--top);
    }

    public boolean isEmpty() {
        if(top == 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isFull() {
        if(top == arrayStack.ARRAY_SIZE) {
            return true;
        } else {
            return false;
        }
    }

    public void printAll() {
        arrayStack.printAll();
    }
}
