package com.file.operations;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileRead {
    public static void main(String[] args) {
        try {
            // Specify the file path
            String filePath = "example.txt";

            // Create a FileReader and BufferedReader
            FileReader reader = new FileReader(filePath);
            BufferedReader bufferedReader = new BufferedReader(reader);

            // Read and print each line from the file
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }

            // Close the readers
            bufferedReader.close();
            reader.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
