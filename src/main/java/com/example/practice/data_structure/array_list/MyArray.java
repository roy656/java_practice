package com.example.practice.data_structure.array_list;

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
    public void inserElement(int position, int num) {       // 매개변수는 넣을 위치, 데이터 값
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
        count++;

    }

    public void removeElement(int position) {
    }


}
