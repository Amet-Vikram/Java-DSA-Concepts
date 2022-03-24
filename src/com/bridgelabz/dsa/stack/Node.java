package com.bridgelabz.dsa.stack;

public class Node<K> {
    K value;
    Node<K> next;

    public Node(K value){
        this.value = value;
    }
}