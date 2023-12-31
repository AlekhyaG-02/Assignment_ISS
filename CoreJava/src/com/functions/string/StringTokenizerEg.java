package com.functions.string;
import java.util.StringTokenizer;

public class StringTokenizerEg {
    public static void main(String[] args) {
        // Original string with multiple words and spaces
        String originalString = "Java is a, powerful programming, language";

        // Creating a StringTokenizer with default delimiter (whitespace)
        StringTokenizer tokenizer = new StringTokenizer(originalString);

        // Displaying tokens and count
        System.out.println("Tokens using default delimiter:");
        displayTokens(tokenizer);

        // Creating a StringTokenizer with a custom delimiter (comma)
        tokenizer = new StringTokenizer(originalString, ",");

        // Displaying tokens and count
        System.out.println("\nTokens using custom delimiter (,):");
        displayTokens(tokenizer);
    }

    // Helper method to display tokens and count
    private static void displayTokens(StringTokenizer tokenizer) {
        int tokenCount = tokenizer.countTokens();
        System.out.println("Total Tokens: " + tokenCount);

        // Displaying each token
        while (tokenizer.hasMoreTokens()) {
            String token = tokenizer.nextToken();
            System.out.println("Token: " + token);
        }
    }
}
