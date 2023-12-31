package com.functions.string;

public class StringBufferMethods {
    public static void main(String[] args) {
        // Creating a StringBuffer
        StringBuffer stringBuffer = new StringBuffer("Hello");

        // Appending content to the StringBuffer
        stringBuffer.append(" World");
        System.out.println("After append(): " + stringBuffer);

        // Inserting content at a specified position
        stringBuffer.insert(5, " Java");
        System.out.println("After insert(): " + stringBuffer);

        // Deleting characters from a specified range
        stringBuffer.delete(6, 11);
        System.out.println("After delete(): " + stringBuffer);

        // Reversing the characters in the StringBuffer
        stringBuffer.reverse();
        System.out.println("After reverse(): " + stringBuffer);

        // Getting the current length of the StringBuffer
        int length = stringBuffer.length();
        System.out.println("Length of StringBuffer: " + length);

        // Getting the current capacity of the StringBuffer
        int capacity = stringBuffer.capacity();
        System.out.println("Capacity of StringBuffer: " + capacity);

        // Ensuring a minimum capacity for the StringBuffer
        stringBuffer.ensureCapacity(30);
        System.out.println("After ensureCapacity(): " + stringBuffer);

        // Converting the StringBuffer to a String
        String resultString = stringBuffer.toString();
        System.out.println("Converted to String: " + resultString);
    }
}
