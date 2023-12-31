package com.loop.control;

public class ForEachLoop {

	public static void main(String[] args) {
		int[] numbers = { 1, 2, 3, 4, 5 };

		// Enhanced for loop to iterate through an array
		for (int num : numbers) {
			System.out.println("Number: " + num);
		}
	}
}
