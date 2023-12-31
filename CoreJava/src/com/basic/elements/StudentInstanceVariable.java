package com.basic.elements;

public class StudentInstanceVariable {
	//Class Variable(Static Variable)
	static int totalStudents = 0;
	
	//Instance Variables
	String name;
	int age;
	
	// Constructor to initialize instance variables
	public StudentInstanceVariable(String name, int age){
		this.name = name;
		this.age = age;
		// Incrementing class variable on each instance creation
        totalStudents++;
	}
	
    // Displaying student information
    public void displayStudentInfo() {
        System.out.println("Student Name: " + this.name);
        System.out.println("Student Age: " + this.age);
    }
	
	public static void main(String[] args) {
		// Creating instances of the class
        StudentInstanceVariable student1 = new StudentInstanceVariable("abc", 20);
        StudentInstanceVariable student2 = new StudentInstanceVariable("test", 22);

        // Displaying student information
        System.out.println("Student 1 Info:");
        student1.displayStudentInfo();

        System.out.println("\nStudent 2 Info:");
        student2.displayStudentInfo();

        // Accessing class variable directly (using class name)
        System.out.println("\nTotal Students: " + StudentInstanceVariable.totalStudents);
	}
}
