package com.functions.string;

public class StringBuilderMethods {
    public static void main(String[] args) {
        // Creating a StringBuilder with an initial capacity
        StringBuilder stringBuilder = new StringBuilder(20);

        // Appending content to the StringBuilder
        stringBuilder.append("Hello");
        System.out.println("After append(): " + stringBuilder);

        // Inserting content at a specified position
        stringBuilder.insert(5, " World");
        System.out.println("After insert(): " + stringBuilder);

        // Deleting characters from a specified range
        stringBuilder.delete(6, 11);
        System.out.println("After delete(): " + stringBuilder);

        // Reversing the characters in the StringBuilder
        stringBuilder.reverse();
        System.out.println("After reverse(): " + stringBuilder);

        // Getting the current length of the StringBuilder
        int length = stringBuilder.length();
        System.out.println("Length of StringBuilder: " + length);

        // Getting the current capacity of the StringBuilder
        int capacity = stringBuilder.capacity();
        System.out.println("Capacity of StringBuilder: " + capacity);

        // Ensuring a minimum capacity for the StringBuilder
        stringBuilder.ensureCapacity(30);
        System.out.println("After ensureCapacity(): " + stringBuilder);

        // Converting the StringBuilder to a String
        String resultString = stringBuilder.toString();
        System.out.println("Converted to String: " + resultString);
    }
}
