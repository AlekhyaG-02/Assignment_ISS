package com.file.operations;

import java.io.FileWriter;
import java.io.IOException;

public class FileWrite {
    public static void main(String[] args) {
        try {
            // Specify the file path
            String filePath = "example.txt";

            // Create a FileWriter object
            FileWriter writer = new FileWriter(filePath);

            // Write content to the file
            writer.write("Hello World, writing inside the file.");

            // Close the FileWriter
            writer.close();

            System.out.println("Content written to the file.");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
