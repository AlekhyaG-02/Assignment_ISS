package com.loop.decision_making;

public class BreakContinue {
	
	public static void main(String[] args) {
		// Break statement
		System.out.println("Break Statement");
		for (int i = 1; i <= 10; i++) {
			if (i == 5) {
				break; // Exit the loop when i is 5
			}
			System.out.println("Iteration " + i);
		}

		// Continue statement
		System.out.println("\nContinue Statement");
		for (int i = 1; i <= 5; i++) {
			if (i == 3) {
				continue; // Skip iteration when i is 3
			}
			System.out.println("Iteration " + i);
		}
	}
}