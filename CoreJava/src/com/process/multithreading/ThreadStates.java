package com.process.multithreading;

class ABC implements Runnable {
    public void run() {
        // Try-catch block for handling InterruptedException
        try {
            // Moving thread t2 to the state timed waiting
            Thread.sleep(100);
        } catch (InterruptedException ie) {
            ie.printStackTrace();
        }

        // Output the state of thread t1 while it invoked the method join() on thread t2
        System.out.println("The state of thread t1 while it invoked the method join() on thread t2 - " + ThreadStates.t1.getState());

        // Try-catch block for handling InterruptedException
        try {
            Thread.sleep(200);
        } catch (InterruptedException ie) {
            ie.printStackTrace();
        }
    }
}

public class ThreadStates implements Runnable {
    public static Thread t1;
    public static ThreadStates obj;

    // Main method
    public static void main(String argvs[]) {
        // Creating an object of the class ThreadStates
        obj = new ThreadStates();
        t1 = new Thread(obj);

        // The thread t1 is currently in the NEW state.
        System.out.println("The state of thread t1 after spawning it - " + t1.getState());

        // Invoking the start() method on the thread t1
        t1.start();

        // Thread t1 is moved to the Runnable state
        System.out.println("The state of thread t1 after invoking the method start() on it - " + t1.getState());
    }

    public void run() {
        ABC myObj = new ABC();
        Thread t2 = new Thread(myObj);

        // Thread t2 is created and is currently in the NEW state.
        System.out.println("The state of thread t2 after spawning it - " + t2.getState());
        t2.start();

        // Thread t2 is moved to the runnable state
        System.out.println("The state of thread t2 after calling the method start() on it - " + t2.getState());

        // Try-catch block for the smooth flow of the program
        try {
            // Moving the thread t1 to the state timed waiting
            Thread.sleep(200);
        } catch (InterruptedException ie) {
            ie.printStackTrace();
        }

        // Output the state of thread t2 after invoking the method sleep() on it
        System.out.println("The state of thread t2 after invoking the method sleep() on it - " + t2.getState());

        // Try-catch block for the smooth flow of the program
        try {
            // Waiting for thread t2 to complete its execution
            t2.join();
        } catch (InterruptedException ie) {
            ie.printStackTrace();
        }

        // Output the state of thread t2 when it has completed its execution
        System.out.println("The state of thread t2 when it has completed its execution - " + t2.getState());
    }
}
