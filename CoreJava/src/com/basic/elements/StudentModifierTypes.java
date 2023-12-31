package com.basic.elements;

//Class with default (package-private) access modifier
class Student {

	// Instance variables with private access modifier
	private String name;
	private int age;

	// Constructor with default access modifier
	Student(String name, int age) {
		this.name = name;
		this.age = age;
	}

	// Method with public access modifier
	public void displayInfo() {
		System.out.println("Student Name: " + name);
		System.out.println("Student Age: " + age);
	}

	// Method with protected access modifier
	protected void study() {
		System.out.println(name + " is studying.");
	}
}

// Another class with public access modifier
public class StudentModifierTypes {
	//Making studentCount private and providing a public method to access it
    private static int studentCount = 0;

    public static void incrementStudentCount() {
        studentCount++;
    }

	public static void main(String[] args) {
		// Creating instances of the Student class
		Student student1 = new Student("abc", 20);
		
		//Incrementing studentCount when creating a new student
        incrementStudentCount();
		
		Student student2 = new Student("test", 22);
		
		//Incrementing studentCount when creating a new student
        incrementStudentCount();

		// Accessing public variable directly
		System.out.println("Total Students: " + studentCount);

		// Accessing public method
		student1.displayInfo();

		// Accessing protected method (within the same package)
		student2.study();
	}
}
