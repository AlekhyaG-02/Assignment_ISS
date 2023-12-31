package com.process.multithreading;

class MyDaemonThread extends Thread {
    public void run() {
        try {
            // Naming the thread
            System.out.println("Thread Name: " + Thread.currentThread().getName());

            // Performing some task in the thread
            for (int i = 1; i <= 5; i++) {
                System.out.println(Thread.currentThread().getName() + ": Count " + i);

                // Introducing sleep to simulate some work
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class ThreadWithFeatures {
    public static void main(String[] args) {
        // Creating a daemon thread
        MyDaemonThread daemonThread = new MyDaemonThread();
        daemonThread.setDaemon(true); // Setting the thread as daemon
        daemonThread.setName("DaemonThread");

        // Creating a regular thread
        Thread regularThread = new Thread(new MyDaemonThread(), "RegularThread");

        // Starting the daemon thread
        daemonThread.start();

        // Starting the regular thread
        regularThread.start();

        // Using join to wait for the regular thread to complete before proceeding
        try {
            regularThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Main thread exits.");
    }
}
