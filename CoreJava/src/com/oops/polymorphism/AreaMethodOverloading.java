package com.oops.polymorphism;

public class AreaMethodOverloading {
	// Method to calculate the area of a square
	public static double calculateArea(double side) {
		return side * side;
	}

	// Method overloading: Calculate the area of a rectangle
	public static double calculateArea(double length, double width) {
		return length * width;
	}

	// Method overloading: Calculate the area of a circle
	public static double calculateArea(double radius, String shape) {
		if ("circle".equalsIgnoreCase(shape)) {
			return Math.PI * radius * radius;
		} else {
			System.out.println("Unsupported shape for the given radius");
			return -1;
		}
	}

	// Method overloading: Calculate the area of a triangle
	public static double calculateArea(double base, double height, boolean isTriangle) {
		if (isTriangle) {
			return 0.5 * base * height;
		} else {
			System.out.println("Invalid parameters for triangle calculation");
			return -1;
		}
	}

	public static void main(String[] args) {
		// Calculate the area of a square
		System.out.println("Area of Square: " + calculateArea(5.0));

		// Calculate the area of a rectangle
		System.out.println("Area of Rectangle: " + calculateArea(4.0, 6.0));

		// Calculate the area of a circle
		System.out.println("Area of Circle: " + calculateArea(3.0, "circle"));

		// Calculate the area of a triangle
		System.out.println("Area of Triangle: " + calculateArea(4.0, 3.0, true));
	}
}
