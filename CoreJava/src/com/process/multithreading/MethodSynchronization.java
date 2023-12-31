package com.process.multithreading;

class Counter {
    private int count = 0;

    // Synchronized method to ensure thread safety
    public synchronized void increment() {
        count++;
    }

    public int getCount() {
        return count;
    }
}

public class MethodSynchronization {
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();

        // Creating multiple threads to increment the counter using synchronized method
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                counter.increment();
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                counter.increment();
            }
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        // Displaying the final count value
        System.out.println("Count (Method Synchronization): " + counter.getCount());
    }
}
