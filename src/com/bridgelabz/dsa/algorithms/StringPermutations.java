package com.bridgelabz.dsa.algorithms;

import java.util.*;

public class StringPermutations {

    public static ArrayList<String> recursive(String str) {
        ArrayList<String> permutations = new ArrayList<>();  // create a set to avoid duplicate permutation

        if (str == null) { // check if string is null
            return null;
        } else if (str.length() == 0) {
            permutations.add(""); // terminating condition for recursion
            return permutations;
        }

        char first = str.charAt(0); // get the first character
        String sub = str.substring(1); // get the remaining substring
        ArrayList<String> words = recursive(sub); // make recursive call to recursive()

        for (String strNew : words) {  // access each element from words
            for (int i = 0;i<=strNew.length();i++){
                permutations.add(strNew.substring(0, i) + first + strNew.substring(i)); // insert the permutation to the set
            }
        }
        return permutations;
    }

    public static int factorial(int number) {
        int result = 1;

        for (int factor = 2; factor <= number; factor++) {
            result *= factor;
        }
        return result;
    }

    public static ArrayList<String> iterative(String str){
        ArrayList<String> permutations = new ArrayList<>();
        int len = str.length();
        int f = factorial(len);

        for (int i = 0 ; i < f ; i++){

            StringBuilder sb = new StringBuilder(str);
            int temp = i;

            for (int div = len; div >= 1 ; div--){
                int q = temp / div;
                int r = temp % div;
                char letter = sb.charAt(r);
                sb.append(letter);
                sb.deleteCharAt(r);
                temp = q;
            }
            permutations.add(sb.toString());
        }
        return permutations;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String data = input.nextLine();
        System.out.println("Permutations of (Recursive) " + data + ": \n" + recursive(data));
        System.out.println("Permutations of (Iterative) " + data + ": \n" + iterative(data));
    }
}



