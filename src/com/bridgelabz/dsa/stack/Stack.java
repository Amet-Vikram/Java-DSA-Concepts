package com.bridgelabz.dsa.stack;

public class Stack<K extends Comparable<K>> {
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

    public <K> K peek(){
        if (!isEmpty()) {
            return (K) top.value;
        }
        else {
            System.out.println("Stack is empty");
            return null;
        }
    }

    public void pop(){ // remove at the beginning
        if (top == null) {
            System.out.print("\nStack Underflow");
            return;
        }
        top = (top).next;
    }

    public void display(){
        if (top == null) {
            System.out.printf("\nStack Underflow");
            System.exit(1);
        }
        else {
            Node<K> temp = top;
            while (temp != null) {
                // print node data
                System.out.printf("%s->", temp.value);
                // assign temp link to temp
                temp = temp.next;
            }
        }
    }
}
