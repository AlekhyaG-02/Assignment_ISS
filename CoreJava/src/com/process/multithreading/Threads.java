package com.process.multithreading;

//Example 1: Extending Thread class
class MyThread1 extends Thread {
 public void run() {
     System.out.println("Thread 1 is running.");
 }
}

//Example 2: Implementing Runnable interface
class MyRunnable implements Runnable {
 public void run() {
     System.out.println("Thread 2 is running.");
 }
}

public class Threads {
 public static void main(String[] args) {
     // Example 1: Extending Thread class
     MyThread1 thread1 = new MyThread1();
     thread1.start(); // Start the thread

     // Implementing Runnable interface
     MyRunnable myRunnable = new MyRunnable();
     Thread thread2 = new Thread(myRunnable);
     thread2.start(); // Start the thread

     // Using the Thread class constructor with a name
     Thread thread3 = new Thread("Thread 3");
     thread3.start(); // Start the thread
     System.out.println("Thread 3 is running.");

     // Using the Thread class constructor with a Runnable and a name
     Thread thread4 = new Thread(new MyRunnable(), "Thread 4");
     thread4.start(); // Start the thread
     System.out.println("Thread 4 is running.");
 }
}

