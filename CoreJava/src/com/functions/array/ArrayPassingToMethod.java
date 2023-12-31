package com.functions.array;

public class ArrayPassingToMethod {
	public static void main(String[] args) {
		// Creating an array
		int[] numbers = { 5, 10, 15, 20, 25 };

		// Displaying the original array
		System.out.println("Original Array:");
		displayArray(numbers);

		// Modifying the array inside the method
		modifyArray(numbers);

		// Displaying the modified array
		System.out.println("\nModified Array:");
		displayArray(numbers);
		
		// Can pass anonymous arrays as well
		System.out.println("\nAnonymous Array:");
		displayArray(new int[] {1, 2, 3, 4, 5});
	}

	// Method to display the elements of an array
	static void displayArray(int[] arr) {
		for (int num : arr) {
			System.out.print(num + " ");
		}
		System.out.println();
	}

	// Method to modify the elements of an array
	static void modifyArray(int[] arr) {
		// Doubling each element in the array
		for (int i = 0; i < arr.length; i++) {
			arr[i] *= 2;
		}
	}
}
