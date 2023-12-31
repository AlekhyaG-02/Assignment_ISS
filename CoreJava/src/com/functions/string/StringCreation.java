package com.functions.string;

public class StringCreation {
	public static void main(String[] args) {
		// Creating a string using Java string literal
		String s1 = "Java";

		// Converting a char array to a string
		char[] charArray = { 's', 't', 'r', 'i', 'n', 'g', 's' };
		String s2 = new String(charArray);

		// Creating a string using the new keyword
		String s3 = new String("abc123");

		// Displaying the strings
		System.out.println("s1: " + s1);
		System.out.println("s2: " + s2);
		System.out.println("s3: " + s3);
	}
}
