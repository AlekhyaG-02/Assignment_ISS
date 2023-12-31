package com.basic.elements;

public class FinalVariable {

	// Declaring a final variable
	final int constantValue = 100;

	public static void main(String[] args) {
		FinalVariable check = new FinalVariable();

		// Trying to modify the final variable will result in a compilation error
		// check.constantValue = 200; // Uncommenting this line will cause an error

		// Accessing and displaying the final variable
		System.out.println("Constant Value: " + check.constantValue);
	}
}
