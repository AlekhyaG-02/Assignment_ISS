package com.process.multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Task implements Runnable {
	private int taskId;

	public Task(int taskId) {
		this.taskId = taskId;
	}

	public void run() {
		System.out.println("Task " + taskId + " is processing in thread: " + Thread.currentThread().getName());
		// Simulating some work
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Task " + taskId + " is completed.");
	}
}

public class ThreadPool {
	public static void main(String[] args) {
		// Creating a fixed-size thread pool with 3 threads
		ExecutorService executorService = Executors.newFixedThreadPool(3);

		// Submitting tasks to the thread pool
		for (int i = 1; i <= 5; i++) {
			Runnable task = new Task(i);
			executorService.submit(task);
		}

		// Shutting down the thread pool after tasks are completed
		executorService.shutdown();
	}
}
