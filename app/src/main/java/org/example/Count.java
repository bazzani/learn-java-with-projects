package org.example;

public class Count {
    static int counter = 0;

    static void incrementCounter() {
        int current = counter;
        System.out.println("Before: " + counter +
                ", Current thread: " + Thread.currentThread().threadId());
        counter = current + 1;
        System.out.println("After: " + counter);
    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            Count.incrementCounter();
        }
    }
}
