package com.bridgelabz.dsa.queue;

public class Main {
    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.enqueue(56);
        queue.enqueue(30);
        queue.enqueue(70);
        queue.printQueue();
        System.out.println();
        queue.dequeue();
        queue.printQueue();
    }
}
