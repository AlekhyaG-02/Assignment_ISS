package com.exceptions;

import java.util.Scanner;

public class NestedExceptionHandling {
	@SuppressWarnings("null")
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		try {
			// Outer try block
			System.out.print("Enter a number: ");
			int divisor = scanner.nextInt();

			try {
				// Inner try block
				int result = 10 / divisor;
				System.out.println("Result: " + result);

				// Simulating an array index out of bounds exception
				int[] array = { 1, 2, 3 };
				System.out.println("Array element at index 3: " + array[3]);
			} catch (ArithmeticException innerArithmeticException) {
				// Inner catch block for ArithmeticException
				System.out.println("Inner ArithmeticException: " + innerArithmeticException.getMessage());
			} catch (ArrayIndexOutOfBoundsException innerArrayIndexException) {
				// Inner catch block for ArrayIndexOutOfBoundsException
				System.out.println("Inner ArrayIndexOutOfBoundsException: " + innerArrayIndexException.getMessage());
			}

			// Simulating a null pointer exception outside the inner try block
			String str = null;
			System.out.println("Length of the string: " + str.length());
		} catch (ArithmeticException outerArithmeticException) {
			// Outer catch block for ArithmeticException
			System.out.println("Outer ArithmeticException: " + outerArithmeticException.getMessage());
		} catch (Exception outerException) {
			// Outer catch block for other exceptions
			System.out.println("Outer Exception occurred: " + outerException.getMessage());
		} finally {
			// Finally block
			System.out.println("Finally block: This code will always execute.");
			scanner.close();
		}
	}
}
