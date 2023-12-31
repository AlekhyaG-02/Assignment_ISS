package com.oops.encapsulation;

public class TestPackage {
	public static void main(String[] args) {
		// Creating an instance of Person
		Person person = new Person("Abc", 20);

		// Accessing encapsulated data using getter methods
		System.out.println("Name: " + person.getName());
		System.out.println("Age: " + person.getAge());

		// Modifying encapsulated data using setter methods
		person.setName("Test");
		person.setAge(28);

		// Displaying the updated details
		person.display();
	}
}