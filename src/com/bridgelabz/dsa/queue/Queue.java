package com.bridgelabz.dsa.queue;

import com.bridgelabz.dsa.linkedlist.LinkedList;

public class Queue extends LinkedList {
    LinkedList linkedList = new LinkedList();

    public void enqueue(int data) {
        linkedList.addLast(data);
    }

    public void printQueue(){
        linkedList.show();
    }

    public void dequeue(){
        linkedList.pop();
    }
}