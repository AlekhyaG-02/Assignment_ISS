package com.functions.string;

public class ImmutableString {

    public static void main(String args[]) {
        // Original string
        String s = "Hello";

        // Using concat() method to append the string at the end
        // Strings in Java are immutable, so the original string 's' is not modified
        s.concat(" World");
        System.out.println(s);

        // Reassigning the reference to a new string by concatenating " World"
        // The updated string is assigned to variable 's'
        s = s.concat(" World");
        System.out.println(s);
    }
}
