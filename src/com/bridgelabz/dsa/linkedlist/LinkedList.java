package com.bridgelabz.dsa.linkedlist;

import java.util.NoSuchElementException;

public class LinkedList {

    private class Node{
        private int value;
        private Node next;

        public Node(int value){
            this.value = value;
        }
    }

    private Node head;
    private Node tail;

    public void addLast(int item){
        var node = new Node(item);
        node.value = item;

        if(isEmpty())
            head = tail = node;
        else {
            tail.next = node;
            tail = node;
        }
    }

    public void show(){
        Node currNode = head;
        System.out.print("LinkedList: ");
        // Traverse through the LinkedList
        while (currNode != null) {
            // Print the data at current node
            System.out.print(currNode.value + " ");
            // Go to next node
            currNode = currNode.next;
        }
    }

    private boolean isEmpty(){
        return head == null;
    }
}
