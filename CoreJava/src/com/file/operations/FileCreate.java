package com.file.operations;

import java.io.File;
import java.io.IOException;

public class FileCreate {
    public static void main(String[] args) {
        try {
            // Specify the file path
            String filePath = "example.txt";

            // Create a new file
            File newFile = new File(filePath);

            if (newFile.createNewFile()) {
                System.out.println("File created: " + newFile.getAbsolutePath());
            } else {
                System.out.println("File already exists.");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
