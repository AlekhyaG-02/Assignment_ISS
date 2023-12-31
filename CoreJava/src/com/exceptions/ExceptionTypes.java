package com.exceptions;

import java.util.Scanner;

public class ExceptionTypes {
	@SuppressWarnings("null")
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		try {
			// ArithmeticException
			System.out.print("Enter a number: ");
			int number = scanner.nextInt();
			int result = 10 / number;
			System.out.println("Result: " + result);

			// ArrayIndexOutOfBoundsException
			int[] array = { 1, 2, 3 };
			System.out.println("Array element at index 3: " + array[3]);

			// NullPointerException
			String str = null;
			System.out.println("Length of the string: " + str.length());
		} catch (ArithmeticException e) {
			System.out.println("ArithmeticException: " + e.getMessage());
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException: " + e.getMessage());
		} catch (NullPointerException e) {
			System.out.println("NullPointerException: " + e.getMessage());
		} catch (Exception e) {
			// Generic catch block for other exceptions
			System.out.println("Exception occurred: " + e.getMessage());
		} finally {
			// Finally block 
			System.out.println("Finally block: This code will always execute.");
			scanner.close();
		}
	}
}
