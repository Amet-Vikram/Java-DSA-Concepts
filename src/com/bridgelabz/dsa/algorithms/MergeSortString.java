package com.bridgelabz.dsa.algorithms;

public class MergeSortString {

    public static void sort(String[] inputArray){
        int inputLength = inputArray.length;
        int midIndex = inputLength / 2; //Dividing the input array
        String[] leftHalf = new String[midIndex]; //Left Half of divide and conquer
        String[] rightHalf = new String[inputLength - midIndex]; //Right Half

        if (inputLength < 2){ //Base Case for Recursion
            return;
        }

        for (int i = 0; i < midIndex; i++){
            leftHalf[i] = inputArray[i];
        }

        for (int i = midIndex; i < inputLength; i++){
            rightHalf[i - midIndex] = inputArray[i];
        }

        sort(leftHalf); //Recursion call for respective halves
        sort(rightHalf);

        merge(inputArray, leftHalf, rightHalf); //Compare and merge Till Final Array
    }

    private static void merge(String[] inputArray, String[] leftHalf, String[] rightHalf){
        int leftSize = leftHalf.length;
        int rightSize = rightHalf.length;

        int i = 0, j = 0 , k = 0;

        while (i < leftSize && j < rightSize){ //Comparing elements in Left side with Right Side
            if (leftHalf[i].compareTo(rightHalf[j]) < 0) {
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

    public static void printArray(String[] arr){
        for (String i : arr) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        String[] strArray = new String[]{"Amet", "Raj", "Sreshtha", "Payal", "Jake", "Amy", "Terry", "Gina"};
        //"ABC", "ZXY", "DEF", "HELLO", "BYE", "AMET", "ATEM", "ETAM"

        System.out.println("Before:");
        printArray(strArray);

        sort(strArray); //Arranges the elements in Alphabetical Order

        System.out.println("\nAfter: \n");
        printArray(strArray);
    }
}

