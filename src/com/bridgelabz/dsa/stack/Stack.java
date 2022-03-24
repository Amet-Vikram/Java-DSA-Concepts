package com.bridgelabz.dsa.stack;

public class Stack<K> {
    Node<K> top;

    Stack(){
        this.top = null;
    }

    public void push(K data){
        Node<K> node = new Node<>(data);
        if (top == null)
            top = node;
        else {
            node.next = top;
            top = node;
        }
    }



}
