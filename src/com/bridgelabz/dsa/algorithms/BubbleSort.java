package com.bridgelabz.dsa.algorithms;

import java.util.Arrays;

public class BubbleSort {

    public static void sort(String[] array){
        for(var i = 1; i < array.length; i++){
            var current = array[i];
            var j = i - 1;
            while (j >= 0 && array[j].compareTo(current) > 0){
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = current;
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
