package com.functions.string;

import java.util.Arrays;

public class StringMethods {
	public static void main(String[] args) {
		// String charAt()
		// Returns the character at the specified index (indexing starts from 0)
		char charAtIndex = "Hello".charAt(2);
		System.out.println("charAt(2): " + charAtIndex);

		// String compareTo()
		// Compares two strings lexicographically
		int compareResult = "Hello".compareTo("World");
		System.out.println("compareTo('World'): " + compareResult);

		// String concat()
		// Concatenates two strings
		String concatenated = "Hello".concat(" World");
		System.out.println("concat(' World'): " + concatenated);

		// String contains()
		// Checks if a substring is present in the original string
		boolean containsResult = "Hello World".contains("lo");
		System.out.println("contains('lo'): " + containsResult);

		// String endsWith()
		// Checks if the string ends with a specified suffix
		boolean endsWithResult = "Hello World".endsWith("World");
		System.out.println("endsWith('World'): " + endsWithResult);

		// String equals() and equalsIgnoreCase()
		// Compares strings for equality, ignoring case in equalsIgnoreCase
		boolean equalsResult = "Hello".equals("Hello");
		System.out.println("equals('Hello'): " + equalsResult);

		boolean equalsIgnoreCaseResult = "hello".equalsIgnoreCase("Hello");
		System.out.println("equalsIgnoreCase('Hello'): " + equalsIgnoreCaseResult);

		// String format()
		// Formats a string using a format specifier
		String formattedString = String.format("Value: %d, Text: %s", 42, "Java");
		System.out.println("format(): " + formattedString);

		// String getBytes()
		// Converts the string to a byte array
		byte[] byteArray = "Hello".getBytes();
		System.out.println("getBytes(): " + Arrays.toString(byteArray));

		// String getChars()
		// Copies characters from the string to a destination character array
		char[] charArray = new char[5];
		"Hello".getChars(0, 5, charArray, 0);
		System.out.println("getChars(): " + Arrays.toString(charArray));

		// String indexOf()
		// Returns the index of the first occurrence of a substring
		int indexOfResult = "Hello World".indexOf("World");
		System.out.println("indexOf('World'): " + indexOfResult);

		// String intern()
		// Returns an interned string, allowing for efficient string comparison
		String internedString = new String("Hello").intern();
		System.out.println("intern(): " + internedString);

		// String isEmpty()
		// Checks if the string is empty
		boolean isEmptyResult = "".isEmpty();
		System.out.println("isEmpty(): " + isEmptyResult);

		// String join()
		// Joins multiple strings with a delimiter
		String joinedString = String.join(", ", "Java", "Python", "JavaScript");
		System.out.println("join(): " + joinedString);

		// String lastIndexOf()
		// Returns the index of the last occurrence of a substring
		int lastIndexOfResult = "Hello World".lastIndexOf("o");
		System.out.println("lastIndexOf('o'): " + lastIndexOfResult);

		// String length()
		// Returns the length (number of characters) of the string
		int length = "Hello".length();
		System.out.println("length(): " + length);

		// String replace()
		// Replaces occurrences of a specified character with another character
		String replacedString = "Hello World".replace('o', '0');
		System.out.println("replace('o', '0'): " + replacedString);

		// String replaceAll()
		// Replaces all occurrences of a specified regular expression with another
		// string
		String regexReplaced = "Hello123".replaceAll("\\d", "X");
		System.out.println("replaceAll('\\d', 'X'): " + regexReplaced);

		// String split()
		// Splits the string into an array of substrings based on a delimiter
		String[] splitArray = "Java,Python,JavaScript".split(",");
		System.out.println("split(','): " + Arrays.toString(splitArray));

		// String startsWith()
		// Checks if the string starts with a specified prefix
		boolean startsWithResult = "Hello World".startsWith("Hello");
		System.out.println("startsWith('Hello'): " + startsWithResult);

		// String substring()
		// Returns a substring of the original string
		String substring = "Hello World".substring(6);
		System.out.println("substring(6): " + substring);

		// String toCharArray()
		// Converts the string to a character array
		char[] charArrayFromString = "Hello".toCharArray();
		System.out.println("toCharArray(): " + Arrays.toString(charArrayFromString));

		// String toLowerCase()
		// Converts the string to lowercase
		String lowerCaseString = "Hello".toLowerCase();
		System.out.println("toLowerCase(): " + lowerCaseString);

		// String toUpperCase()
		// Converts the string to uppercase
		String upperCaseString = "Hello".toUpperCase();
		System.out.println("toUpperCase(): " + upperCaseString);

		// String trim()
		// Removes leading and trailing whitespaces from the string
		String trimmedString = "   Hello   ".trim();
		System.out.println("trim(): " + trimmedString);

		// String valueOf()
		// Converts different types to a string representation
		String valueOfString = String.valueOf(42);
		System.out.println("valueOf(42): " + valueOfString);
	}
}
