package com.bridgelabz.dsa.stack;

public class Main {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        stack.push(10);
        stack.push(20);
        Integer a = stack.peek();
        System.out.println(a);

    }
}
