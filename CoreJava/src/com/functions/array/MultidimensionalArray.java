package com.functions.array;

public class MultidimensionalArray {
	public static void main(String[] args) {
		// Declaration and Initialization of a 2D array (matrix)
		int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		// Displaying the 2D array
		System.out.println("Original 2D Array:");
		displayMatrix(matrix);

		// Accessing and modifying elements of the 2D array
		int element = matrix[1][2]; // Accessing element at row 1, column 2
		System.out.println("\nValue at matrix[1][2]: " + element);

		matrix[0][1] = 10; // Modifying element at row 0, column 1

		// Displaying the modified 2D array
		System.out.println("\nModified 2D Array:");
		displayMatrix(matrix);
	}

	// Method to display a 2D array
	static void displayMatrix(int[][] mat) {
		for (int[] row : mat) {
			for (int num : row) {
				System.out.print(num + " ");
			}
			System.out.println();
		}
	}
}
