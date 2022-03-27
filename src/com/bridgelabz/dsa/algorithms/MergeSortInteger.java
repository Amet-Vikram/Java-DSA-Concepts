package com.bridgelabz.dsa.algorithms;

import java.util.Random;

public class MergeSortInteger {

    public static void sort(int[] inputArray){
        int inputLength = inputArray.length;
        int midIndex = inputLength / 2; //Dividing the input array
        int[] leftHalf = new int[midIndex]; //Left Half of divide and conquer
        int[] rightHalf = new int[inputLength - midIndex]; //Right Half

        if (inputLength < 2){ //Base Case for Recursion
            return;
        }

        System.arraycopy(inputArray, 0, leftHalf, 0, midIndex);

        if (inputLength - midIndex >= 0)
            System.arraycopy(inputArray, midIndex, rightHalf, 0, inputLength - midIndex);

        sort(leftHalf); //Recursion call for respective halves
        sort(rightHalf);

        merge(inputArray, leftHalf, rightHalf); //Compare and merge Till Final Array
    }

    private static void merge(int[] inputArray, int[] leftHalf, int[] rightHalf){
        int leftSize = leftHalf.length;
        int rightSize = rightHalf.length;

        int i = 0, j = 0 , k = 0;

        while (i < leftSize && j < rightSize){ //Comparing elements in Left side with Right Side
            if (leftHalf[i] <= rightHalf[j]) {
                inputArray[k] = leftHalf[i]; //Constructing New Sorted Array
                i++;
            }
            else {
                inputArray[k] = rightHalf[j];
                j++;
            }
            k++;
        }

        while (i < leftSize){ //For left over elements in Left Array
            inputArray[k] = leftHalf[i];
            i++;
            k++;
        }

        while (j < rightSize){ //For left over elements in Right Array
            inputArray[k] = rightHalf[j];
            j++;
            k++;
        }
    }

    public static void printArray(int[] arr){
        for (int i : arr) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        Random random = new Random();
        int[] numbers = new int[10];

        for (int i = 0; i < numbers.length; i ++){
            numbers[i] = random.nextInt(10000);
        }

        System.out.println("Before:");
        printArray(numbers);

        sort(numbers);

        System.out.println("\nAfter:i");
        printArray(numbers);
    }
}
