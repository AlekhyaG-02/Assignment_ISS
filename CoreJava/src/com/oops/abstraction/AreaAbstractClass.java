package com.oops.abstraction;

//Abstract class: Shape
abstract class Shape {

	// Subclasses must provide their implementation of the area method
	abstract double area();

	// This method is common for all subclasses
	void display() {
		System.out.println("This is a shape.");
	}
}

//Concrete subclass: Circle
class Circle extends Shape {
	// Fields specific to Circle
	private double radius;

	// Constructor for Circle
	Circle(double radius) {
		this.radius = radius;
	}

	// Implementation of the abstract method: area
	@Override
	double area() {
		return Math.PI * radius * radius;
	}
}

//Main class: AbstractClassExample
public class AreaAbstractClass {
	public static void main(String[] args) {
		// Creating instances of Circle and Rectangle
		Circle circle = new Circle(5.0);

		// Calling methods on instances
		circle.display();
		System.out.println("Area of Circle: " + circle.area());
	}
}
