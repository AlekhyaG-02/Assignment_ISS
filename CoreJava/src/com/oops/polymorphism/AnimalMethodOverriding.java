package com.oops.polymorphism;

// Base class: Animal
class Animal {
	String category = "Animal";
    // General Method
    void makeSound() {
        System.out.println("General sounds");
    }
}

// Subclass: Dog (extends Animal)
class Dog extends Animal {
	String category = "Dog";
    // Method overriding: Overrides the makeSound method in the base class
    @Override
    void makeSound() {
    	super.makeSound();
        System.out.println("Woof! Woof!");
    }
}

// Subclass: Cat (extends Animal)
class Cat extends Animal {
	String category = "Cat";
    // Method overriding: Overrides the makeSound method in the base class
    @Override
    void makeSound() {
        System.out.println("Meow! Meow!");
        System.out.println(super.category);
    }

}

public class AnimalMethodOverriding {
    public static void main(String[] args) {
        // Creating instances of Animal, Dog, and Cat
        Animal genericAnimal = new Animal();
        Dog myDog = new Dog();
        Cat myCat = new Cat();

        // Calling makeSound on each object
        genericAnimal.makeSound(); // Calls the base class method
        myDog.makeSound(); // Calls the overridden method in the Dog class
        myCat.makeSound(); // Calls the overridden method in the Cat class
        
        System.out.println("\n");
        // Polymorphism: Using a base class reference 
        Animal polymorphicAnimal = new Dog();
        polymorphicAnimal.makeSound(); // Calls the overridden method in the Dog class

        polymorphicAnimal = new Cat();
        polymorphicAnimal.makeSound(); // Calls the overridden method in the Cat class
    }
}
