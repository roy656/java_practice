package com.example.practice.data_structure.array_list;

import static org.apache.logging.log4j.ThreadContext.isEmpty;

public class MyArray {

    int[] intArr;
    int count;          // 요소 의 개수

    public int ARRAY_SIZE;
    public static final int ERROR_NUM = -999999999;

    public MyArray() {
        count = 0;
        ARRAY_SIZE = 10;
        intArr = new int[ARRAY_SIZE];
    }

    public MyArray(int size) {
        count = 0;
        ARRAY_SIZE = size;
        intArr = new int[size];
    }

    // 배열에 데이터 추가
    public void addElement(int num) {
        if(count >= ARRAY_SIZE) {
            System.out.println("not enough memory");
        }

        intArr[count++] = num;      // add 되면 count 가 1증가
    }

    // 배열 중간에 데이터 삽입 (그냥 넣으면 오버라이팅 되기 때문에 넣을 위치 뒤의 데이터들을 밀고 넣는다)
    public void insertElement(int position, int num) {       // 매개변수는 넣을 위치, 데이터 값
        int i;

        if(position<0 || position>count) {          // index 가 허용 범위 밖일때 에러
            System.out.println(" insert Error");
        }

        if(count >= ARRAY_SIZE) {                   // 배열 크기 가 다 찼을때 에러
            System.out.println("not enough memory");
        }

        for( i=count-1; i >= position; i--) {       // i 가 마지막 index 에서 부터 넣을 위치 보다 크거나 같을때 까지 하나씩 감소
            intArr[i+1] = intArr[i];                // 하나씩 뒤로 밀기
        }

        intArr[position] = num;
        count++;                                    // 메소드 실행때 마다 요소가 하나씩 늘어난거

    }

    public int removeElement(int position) {
        int ret = ERROR_NUM;

        if( isEmpty() ) {
            System.out.println("Array is Empty");
            return ret;
        }

        if( position<0 || position>=count-1) {
            return ret;
        }

        ret = intArr[position];

        for(int i=position; i<count-1; i++) {
            intArr[i] = intArr[i+1];                // 넣을 위치 뒤의 인덱스 부터 하나씩 땡기기
        }
        count--;                                    // 메소드 실행때 마다 요소가 하나씩 적어진다

        return ret;

    }

    public int getSize() {
        return count;
    }

    public boolean isEmpty() {
        if( count == 0) {
            return true;
        } else {
            return false;
        }
    }

    public int getElement(int position) {
        if( position < 0 || position > count-1) {
            System.out.println("인덱스가 허용 범위를 벗어났습니다.");
            return ERROR_NUM;
        }
        return intArr[position];
    }

    public void printAll() {
        if (count == 0) {
            System.out.println("출력할 내용이 없습니다.");
        }

        for (int i = 0; i < count; i++) {
            System.out.println(intArr[i]);
        }
    }

        public void removeAll() {

            for(int i=0; i<count; i++){
                intArr[i] = 0;
            }
            count = 0;
        }
    }