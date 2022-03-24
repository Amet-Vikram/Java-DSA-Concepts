package com.bridgelabz.dsa.linkedlist;

public class OrderedLinkedList extends LinkedList {

    public void addLast(int value) {
        Node new_node = new Node(value);
        Node current;
        if (super.head == null || head.value >= new_node.value) {
            new_node.next = head;
            head = new_node;
        }
        else {
            current = head;
            while (current.next != null && current.next.value < new_node.value) {
                current = current.next;
            }
            new_node.next = current.next;
            current.next = new_node;
        }
    }
}
