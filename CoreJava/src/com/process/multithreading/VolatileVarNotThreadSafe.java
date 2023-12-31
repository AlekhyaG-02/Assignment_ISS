package com.process.multithreading;

public class VolatileVarNotThreadSafe {

	// Volatile variable to ensure visibility across threads
	private static volatile int count = 0;

	// Maximum limit for the counter
	private static final int MAX_LIMIT = 1000;

	// Method to increment the counter variable
	public static void increment() {
		count++;
	}

	// Method to get the current value of the counter variable
	public static int getCount() {
		return count;
	}

	public static void main(String[] args) throws InterruptedException {
		// Thread 1 incrementing the counter
		Thread t1 = new Thread(new Runnable() {
			@Override
			public void run() {
				for (int index = 0; index < MAX_LIMIT; index++) {
					increment();
				}
			}
		});

		// Thread 2 incrementing the counter
		Thread t2 = new Thread(new Runnable() {
			@Override
			public void run() {
				for (int index = 0; index < MAX_LIMIT; index++) {
					increment();
				}
			}
		});

		// Starting both threads
		t1.start();
		t2.start();

		// Waiting for both threads to complete
		t1.join();
		t2.join();

		// Displaying the final value of the counter variable
		System.out.println("Value of counter variable: " + count);
	}
}
