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
        var node = new Node(item); //Temporary node to store
        node.value = item; //Adding value to new node
        if(isEmpty())
            head = tail = node;
        else {
            tail.next = node; //Connecting new node to tail
            tail = node; //Updating new tail
        }
    }

    public void show(){
        Node currNode = head;
        System.out.print("[ ");
        while (currNode != null) { // Traverse through the LinkedList
            System.out.print(currNode.value + " "); // Print the data at current node
            currNode = currNode.next; // Go to next node
        }
        System.out.println("]");
    }

    private boolean isEmpty(){ // Check if the list has no nodes
        return head == null;
    }

    public void addFirst(int item){
        var node = new Node(item); // Temporary node to store
        if (isEmpty()) // Check if the list is empty
            head = tail = node;
        else{
            node.next = head; // New node connection to head
            head = node; // Update new head
        }
    }

    private Node getPrevious(Node node){
        var current = head;
        while (current != null){
            if (current == node) return current;
            current =current.next;
        }
        return null;
    }

    private Node getPrevious(int value){
        var current = head;
        while (current != null){
            if (current.value == value) return current;
            current =current.next;
        }
        return null;
    }

    public void insertAfter(int element, int value){
        var target = getPrevious(element); // List before the new node locus
        var newHead = target.next; // List after the new node locus
        var newNode = new Node(value); // New Node
        if(isEmpty())
            head = tail = newNode;
        else{
            target.next = newNode; //Connecting newNode to previous list
            target = newNode; //Adding new node
            newNode.next = newHead; //Connecting remaining list
        }
    }
}
