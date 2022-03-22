package com.bridgelabz.dsa.linkedlist;

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
        // Traverse through the LinkedList
        System.out.print("[ ");
        while (currNode != null) {
            // Print the data at current node
            System.out.print(currNode.value + " ");
            // Go to next node
            currNode = currNode.next;
        }
        System.out.println("]");
    }

    private boolean isEmpty(){
        return head == null;
    }

    public void addFirst(int item){
        var node = new Node(item);

        if (isEmpty())
            head = tail = node;
        else{
            node.next = head;
            head = node;
        }
    }
}
