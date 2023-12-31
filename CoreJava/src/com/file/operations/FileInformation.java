package com.file.operations;

import java.io.File;

public class FileInformation {

	public static void main(String[] args) {
		// Specify the file path
		String filePath = "example.txt";

		// Create a File object
		File file = new File(filePath);

		// Get file information
		System.out.println("File Name: " + file.getName());
		System.out.println("Absolute Path: " + file.getAbsolutePath());
		System.out.println("Size (in bytes): " + file.length());
		System.out.println("Is Directory? " + file.isDirectory());
		System.out.println("Is File? " + file.isFile());
	}
}
