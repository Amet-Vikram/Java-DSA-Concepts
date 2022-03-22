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
        System.out.println(list.size());
        list.deleteNode(30);
        System.out.println(list.size());
        list.show();
    }
}
