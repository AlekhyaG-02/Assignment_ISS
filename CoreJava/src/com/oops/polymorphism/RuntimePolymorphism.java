package com.oops.polymorphism;

// Base class: Animal
class Animal1 {
	// Method to make a generic sound
	void makeSound() {
		System.out.println("General sounds");
	}
}

// Subclass: Dog (extends Animal)
class Dog1 extends Animal1 {
	// Method overriding: Overrides the makeSound method in the base class
	@Override
	void makeSound() {
		System.out.println("Woof! Woof!");
	}
}

// Subclass: Cat (extends Animal)
class Cat1 extends Animal1 {
	// Method overriding: Overrides the makeSound method in the base class
	@Override
	void makeSound() {
		System.out.println("Meow! Meow!");
	}
}

// Main class: RuntimePolymorphismExample
public class RuntimePolymorphism {
	public static void main(String[] args) {
		// Creating instances of Animal, Dog, and Cat
		Animal1 genericAnimal = new Animal1();
		Dog1 myDog = new Dog1();
		Cat1 myCat = new Cat1();

		// Polymorphism: Using a base class reference to refer to different objects
		Animal1 polymorphicAnimal;

		// Assigning a Dog object to the base class reference
		polymorphicAnimal = myDog;
		System.out.println("Calling makeSound on polymorphicAnimal (Dog):");
		polymorphicAnimal.makeSound(); // Calls the overridden method in the Dog class

		// Assigning a Cat object to the base class reference
		polymorphicAnimal = myCat;
		System.out.println("\nCalling makeSound on polymorphicAnimal (Cat):");
		polymorphicAnimal.makeSound(); // Calls the overridden method in the Cat class

		// Assigning a generic Animal object to the base class reference
		polymorphicAnimal = genericAnimal;
		System.out.println("\nCalling makeSound on polymorphicAnimal (Generic Animal):");
		polymorphicAnimal.makeSound(); // Calls the base class method
	}
}
