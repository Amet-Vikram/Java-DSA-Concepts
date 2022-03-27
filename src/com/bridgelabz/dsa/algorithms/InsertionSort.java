package com.bridgelabz.dsa.algorithms;

import java.util.Arrays;

public class InsertionSort {

    public static void sort(String[] arr){
        int arrSize = arr.length;
        int i, j;
        String temp;

        for(i = 1; i < arrSize; i++){ //Key Element
            for (j = 0; j <= i; j++){ //Elements before key element
                if(arr[i].compareTo(arr[j]) < 0){
                    temp = arr[i]; //Swap
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        String[] strArray = new String[]{"B", "D", "Z", "P", "H", "L", "F", "A"};

        System.out.println("Before Sorting: ");
        System.out.println(Arrays.toString(strArray));

        sort(strArray);

        System.out.println("After Sorting: ");
        System.out.println(Arrays.toString(strArray));
    }
}
