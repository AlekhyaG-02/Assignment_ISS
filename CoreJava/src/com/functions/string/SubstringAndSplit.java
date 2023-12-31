package com.functions.string;

public class SubstringAndSplit {
	public static void main(String[] args) {
		// Original string
		String originalString = "Java Programming is Fun";

		// Using substring(int beginIndex)
		String substring1 = originalString.substring(5);
		System.out.println("Using substring(int beginIndex): " + substring1);

		// Using substring(int beginIndex, int endIndex)
		String substring2 = originalString.substring(5, 16);
		System.out.println("Using substring(int beginIndex, int endIndex): " + substring2);

		// Using split() method
		String[] words = originalString.split(" ");
		System.out.println("Using split() method:");
		for (String word : words) {
			System.out.println(word);
		}

		// Using split() with limit
		String[] limitedWords = originalString.split(" ", 3);
		System.out.println("Using split() with limit (3):");
		for (String word : limitedWords) {
			System.out.println(word);
		}

		// Using split() with regex pattern
		String[] regexWords = originalString.split("\\s+");
		System.out.println("Using split() with regex pattern (\\s+):");
		for (String word : regexWords) {
			System.out.println(word);
		}
	}
}
