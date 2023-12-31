package com.loop.decision_making;

public class NestedIfStatement {
	public static void main(String[] args) {
		int age = 25;
		char gender = 'M';

		// Nested if statements
		if (age >= 18) {
			System.out.println("Person is an adult.");

			if (gender == 'M') {
				System.out.println("Person is a male adult.");
			} else if (gender == 'F') {
				System.out.println("Person is a female adult.");
			} else {
				System.out.println("Unknown gender.");
			}

		} else {
			System.out.println("Person is a minor.");
		}
	}
}
