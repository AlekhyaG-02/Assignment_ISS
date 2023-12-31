package com.basic.elements;

public class StudentConstructors {

	// Declare variables
	private String name;
	private int age;

	// Default constructor (having no-arguments)
	public StudentConstructors() {
		// Default values for variables
		name = "Unknown";
		age = 0;
	}

	// Parameterized constructor
	public StudentConstructors(String name, int age) {
		// Initializing variables with provided values
		this.name = name;
		this.age = age;
	}

	// Method to display information
	public void displayInfo() {
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
	}

	public static void main(String[] args) {
		// Creating objects using different constructors
		StudentConstructors defaultConstructor = new StudentConstructors();
		StudentConstructors parameterizedConstructor = new StudentConstructors("abc", 20);

		// Displaying information using the displayInfo method
		System.out.println("Default Constructor:");
		defaultConstructor.displayInfo();

		System.out.println("\nParameterized Constructor:");
		parameterizedConstructor.displayInfo();
	}
}
