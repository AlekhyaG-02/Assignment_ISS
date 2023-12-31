package com.functions.array;

public class SingleArray {
	public static void main(String[] args) {
		// Declaring and initializing an array of integers
		int numbers[] = { 5, 10, 15, 20, 25 };

		// Accessing elements of the array using index
		System.out.println("Element at index 2: " + numbers[2]);

		// Modifying an element of the array
		numbers[3] = 30;

		// Displaying all elements using a for each loop
		System.out.println("\nAll elements in the array:");
		for (int i: numbers) {
			System.out.println(i);
		}

		// Calculating the sum of all elements
		int sum = 0;
		for (int num : numbers) {
			sum += num;
		}
		System.out.println("\nSum of all elements: " + sum);
	}
}
