package com.exceptions;

//Custom exception class
class CustomException extends Exception {
	private static final long serialVersionUID = 1L;

// Constructor with a custom error message
	public CustomException(String message) {
		super(message);
	}
}

public class ThrowException {
	public static void main(String[] args) {
		try {
			// Simulating a condition that warrants throwing a custom exception
			@SuppressWarnings("unused")
			int userAge = getUserAge(-5);
		} catch (CustomException e) {
			// Catching the custom exception and printing the error message
			System.out.println("Exception caught: " + e.getMessage());
		}
	}

	// Method that throws a custom exception based on a condition
	private static int getUserAge(int age) throws CustomException {
		// Checking if the age is non-negative
		if (age < 0) {
			// Throwing a custom exception with a descriptive error message
			throw new CustomException("Age cannot be negative.");
		}
		return age;
	}
}
