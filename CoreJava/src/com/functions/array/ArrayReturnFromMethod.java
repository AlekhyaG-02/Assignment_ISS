package com.functions.array;

public class ArrayReturnFromMethod {
	public static void main(String[] args) {
		// Calling the method to get an array
		int[] newArray = createArray(5);

		// Displaying the returned array
		System.out.println("Returned Array:");
		displayArray(newArray);
	}

	// Method to create and return an array
	static int[] createArray(int size) {
		int[] newArray = new int[size];

		// Initializing the elements of the array
		for (int i = 0; i < newArray.length; i++) {
			newArray[i] = i * 3; // Set each element to a multiple of 3
		}

		// Returning the created array
		return newArray;
	}

	// Method to display the elements of an array
	static void displayArray(int[] arr) {
		for (int num : arr) {
			System.out.print(num + " ");
		}
		System.out.println();
	}
}
