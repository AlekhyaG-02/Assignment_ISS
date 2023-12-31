package com.process.multithreading;

class Counter1 {
	private int count = 0;

	// Synchronized block to ensure thread safety
	public void increment() {
		synchronized (this) {
			count++;
		}
	}

	public int getCount() {
		return count;
	}
}

public class BlockSynchronization {
	public static void main(String[] args) throws InterruptedException {
		Counter1 Counter1 = new Counter1();

		// Creating multiple threads to increment the Counter1 using synchronized block
		Thread t1 = new Thread(() -> {
			for (int i = 0; i < 1000; i++) {
				Counter1.increment();
			}
		});

		Thread t2 = new Thread(() -> {
			for (int i = 0; i < 1000; i++) {
				Counter1.increment();
			}
		});

		t1.start();
		t2.start();

		t1.join();
		t2.join();

		// Displaying the final count value
		System.out.println("Count (Block Synchronization): " + Counter1.getCount());
	}
}
