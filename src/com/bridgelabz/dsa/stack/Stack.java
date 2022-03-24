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

    protected boolean isEmpty(){ // Check if the list has no nodes
        return top == null;
    }

    public <K extends Comparable<K>> K peek(){
        if (!isEmpty()) {
            return (K) top.value;
        }
        else {
            System.out.println("Stack is empty");
            return null;
        }
    }
}
