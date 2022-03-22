package com.bridgelabz.dsa.linkedlist;

public class Main {
    public static void main(String[] args) {
        var list = new LinkedList();
        list.addLast(70);
        list.addLast(30);
        list.addLast(56);
        list.addLast(80);
        list.addLast(43);
        list.addLast(66);
        list.insertAfter(80,90);
        list.pop();
        list.show();
    }
}
