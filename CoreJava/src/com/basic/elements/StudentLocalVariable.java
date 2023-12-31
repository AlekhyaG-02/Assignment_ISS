package com.basic.elements;

public class StudentLocalVariable {
	// Class Variable (Static variable)
	static int totalStudents = 0;

	// Instance Variables
	String name;
	int age;

	// Constructor to initialize instance variables
	public StudentLocalVariable(String name, int age) {
        this.name = name;
        this.age = age;
        // Incrementing class variable on each instance creation
        totalStudents++;
    }

	// Method to display student information using local variables
	public void displayStudentInfo() {
		// Local variable within a method
		int yearOfBirth = 2023 - this.age;

		System.out.println("Student Name: " + this.name);
		System.out.println("Student Age: " + this.age);
		System.out.println("Year of Birth: " + yearOfBirth);
	}

	public static void main(String[] args) {
		// Creating instances of the class
		StudentLocalVariable student1 = new StudentLocalVariable("abc", 20);
		StudentLocalVariable student2 = new StudentLocalVariable("test", 22);

		// Displaying student information
		System.out.println("Student 1 Info:");
		student1.displayStudentInfo();

		System.out.println("\nStudent 2 Info:");
		student2.displayStudentInfo();

		// Accessing class variable directly (using class name)
		System.out.println("\nTotal Students: " + StudentLocalVariable.totalStudents);
	}
}
