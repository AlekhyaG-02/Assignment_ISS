package com.functions.string;

public class StringComparision {
	public static void main(String[] args) {
		// Using equals() method for content comparison
		String str1 = "Java";
		String str2 = "Java";
		String str3 = new String("Java");
		String str4 = "Python";

		System.out.println("equals() Method:");
		System.out.println(str1.equals(str2)); 
		System.out.println(str1.equals(str3)); 
		System.out.println(str1.equals(str4));
		System.out.println();

		// Using == operator for reference comparison
		String str5 = "Java";
		String str6 = "Java";
		String str7 = new String("Java");

		System.out.println("== Operator:");
		System.out.println(str5 == str6);
		System.out.println(str5 == str7);
		System.out.println();

		// Using compareTo() method for lexicographical comparison
		String str8 = "Java";
		String str9 = "Java";
		String str10 = "Python";

		System.out.println("compareTo() Method:");
		System.out.println(str8.compareTo(str9)); 
		System.out.println(str8.compareTo(str10));
		System.out.println(str10.compareTo(str8)); 
	}
}
