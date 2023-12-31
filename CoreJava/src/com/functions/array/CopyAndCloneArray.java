package com.functions.array;

public class CopyAndCloneArray {
	public static void main(String[] args) {
		// Original array
		int[] originalArray = { 1, 2, 3, 4, 5 };

		// Copying the array using System.arraycopy()
		int[] copiedArray = copyArray(originalArray);

		// Cloning the array using clone()
		int[] clonedArray = originalArray.clone();

		// Modifying the original array
		originalArray[0] = 10;

		// Displaying the original, copied, and cloned arrays
		System.out.println("Original Array:");
		displayArray(originalArray);

		System.out.println("\nCopied Array:");
		displayArray(copiedArray);

		System.out.println("\nCloned Array:");
		displayArray(clonedArray);
	}

	// Method to copy an array using System.arraycopy()
	static int[] copyArray(int[] source) {
		int[] destination = new int[source.length];
		System.arraycopy(source, 0, destination, 0, source.length);
		return destination;
	}

	// Method to display the elements of an array
	static void displayArray(int[] arr) {
		for (int num : arr) {
			System.out.print(num + " ");
		}
		System.out.println();
	}
}
