package com.exceptions;

//Exception class
class CustomException1 extends Exception {
	private static final long serialVersionUID = 1L;

// Constructor with a custom error message
	public CustomException1(String message) {
		super(message);
	}
}

//Base class with a method that declares an exception
class BaseClass {
	// Method in the base class that declares a checked exception
	public void performOperation() throws CustomException1 {
		// Simulating some operation that may throw a custom exception
		throw new CustomException1("Exception in BaseClass");
	}
}

//Derived class that overrides the method with exception handling
class DerivedClass extends BaseClass {
	// Overriding the method with exception handling
	@Override
	public void performOperation() {
		try {
			// Calling the overridden method from the base class
			super.performOperation();
		} catch (CustomException1 e) {
			// Handling the exception in the derived class
			System.out.println("Exception caught in DerivedClass: " + e.getMessage());
		}
	}
}

public class ExceptionHandlingMethodOverride {
	public static void main(String[] args) {
		// Creating an instance of the derived class
		DerivedClass derivedObject = new DerivedClass();

		// Calling the overridden method that handles the exception
		derivedObject.performOperation();
	}
}
