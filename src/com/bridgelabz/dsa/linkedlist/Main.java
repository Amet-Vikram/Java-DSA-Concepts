package com.bridgelabz.dsa.linkedlist;

public class Main {
    public static void main(String[] args) {
        var list = new OrderedLinkedList<Integer>();
        list.addLast(56);
        list.addLast(30);
        list.addLast(40);
        list.addLast(70);
        list.addFirst(20);
        list.deleteNode(70);
        list.popLast();
        list.pop();
        list.insertAfter(56,2);
        list.show();
    }
}
