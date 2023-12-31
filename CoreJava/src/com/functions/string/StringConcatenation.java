package com.functions.string;

import java.util.StringJoiner;

public class StringConcatenation {
	public static void main(String[] args) {
		// Using + operator for concatenation
		String str1 = "Hello";
		String str2 = " World";
		String result1 = str1 + str2;
		System.out.println("Using + operator: " + result1);

		// Using concat() method
		String str3 = "Java";
		String str4 = "Script";
		String result2 = str3.concat(str4);
		System.out.println("Using concat() method: " + result2);

		// Using StringBuilder
		StringBuilder stringBuilder = new StringBuilder("Hello");
		stringBuilder.append(" Java");
		String result3 = stringBuilder.toString();
		System.out.println("Using StringBuilder: " + result3);

		// Using StringBuffer
		StringBuffer stringBuffer = new StringBuffer("Hello");
		stringBuffer.append(" Java");
		String result4 = stringBuffer.toString();
		System.out.println("Using StringBuffer: " + result4);
		
        // Using String.format()
		String name = "abc";
        int age = 20;
        String result5 = String.format("My name is %s and I am %d years old.", name, age);
        System.out.println("Using String.format(): " + result5);
        
     // Using StringJoiner
        StringJoiner stringJoiner = new StringJoiner(", ");
        stringJoiner.add("Java").add("Python").add("JavaScript");
        String result6 = stringJoiner.toString();
        System.out.println("Using StringJoiner: " + result6);
	}
}
