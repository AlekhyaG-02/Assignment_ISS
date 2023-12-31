package com.oops.abstraction;

interface Shape1 {

	// Subclasses must provide their implementation of the area method
	double area();

	// Subclasses must provide their implementation of the perimeter method
	double perimeter();

	// This method is common for all implementing classes but can be overridden if needed
	default void display() {
		System.out.println("This is a shape.");
	}
}

//Concrete class: Circle
class Circle1 implements Shape1 {
	// Field specific to Circle
	private double radius;

	// Constructor for Circle
	Circle1(double radius) {
		this.radius = radius;
	}

	// Implementation of the area method
	@Override
	public double area() {
		return Math.PI * radius * radius;
	}

	// Implementation of the perimeter method
	@Override
	public double perimeter() {
		return 2 * Math.PI * radius;
	}

	// Overriding the default display method if needed
	@Override
	public void display() {
		System.out.println("This is a circle.");
	}
}

//Main class: InterfaceExample
public class AreaInterface {
	public static void main(String[] args) {
		// Creating instances of Circle and Rectangle
		Circle1 circle = new Circle1(5.0);

		// Calling methods on instances
		circle.display();
		System.out.println("Area of Circle: " + circle.area());
		System.out.println("Perimeter of Circle: " + circle.perimeter());
	}
}
