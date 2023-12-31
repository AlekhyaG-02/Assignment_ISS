package com.functions.array;

public class JaggedArray {
	public static void main(String[] args) {
		// Declaration and Initialization of a jagged array
		int[][] jaggedArray = { { 1, 2, 3 }, { 4, 5 }, { 6, 7, 8, 9 } };

		// Displaying the jagged array
		System.out.println("Jagged Array:");
		displayJaggedArray(jaggedArray);

		// Accessing and modifying elements of the jagged array
		int element = jaggedArray[1][1]; // Accessing element at row 1, column 1
		System.out.println("\nValue at jaggedArray[1][1]: " + element);

		jaggedArray[0][1] = 10; // Modifying element at row 0, column 1

		// Displaying the modified jagged array
		System.out.println("\nModified Jagged Array:");
		displayJaggedArray(jaggedArray);
	}

	// Method to display a jagged array
	static void displayJaggedArray(int[][] jaggedArr) {
		for (int[] row : jaggedArr) {
			for (int num : row) {
				System.out.print(num + " ");
			}
			System.out.println();
		}
	}
}
