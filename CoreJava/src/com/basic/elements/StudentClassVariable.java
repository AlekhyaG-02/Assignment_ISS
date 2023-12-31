package com.basic.elements;

public class StudentClassVariable {
	// Class Variable (Static variable)
	static int totalStudents = 0;

	// Instance Variables
	String name;
	int age;

	// Constructor to initialize instance variables
	public StudentClassVariable(String name, int age) {
	        this.name = name;
	        this.age = age;
	        // Incrementing class variable on each instance creation
	        totalStudents++;
	    }

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// Creating instances of the class
		StudentClassVariable student1 = new StudentClassVariable("abc", 20);
		StudentClassVariable student2 = new StudentClassVariable("test", 22);

		// Accessing class variable directly (using class name)
		System.out.println("Total Students: " + StudentClassVariable.totalStudents);
	}
}
