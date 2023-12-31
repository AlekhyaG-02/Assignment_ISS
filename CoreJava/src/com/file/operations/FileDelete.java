package com.file.operations;

import java.io.File;

public class FileDelete {
    public static void main(String[] args) {
        // Specify the file path
        String filePath = "example.txt";

        // Create a File object
        File file = new File(filePath);

        // Delete the file
        if (file.delete()) {
            System.out.println("File deleted: " + file.getAbsolutePath());
        } else {
            System.out.println("File not found or unable to delete.");
        }
    }
}

