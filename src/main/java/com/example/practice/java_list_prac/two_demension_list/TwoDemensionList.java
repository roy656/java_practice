package com.example.practice.java_list_prac.two_demension_list;

public class TwoDemensionList {

    public static void main(String[] args) {

        int[][] arr = {{1,2,3}, {1,2,3,4}};


        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + ",");
            }
            System.out.println("\t" + arr[i].length);

        }
    }
}
