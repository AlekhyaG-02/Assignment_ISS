package com.oops.inheritance;

//Base class
class Animal {
 void eat() {
     System.out.println("Animal is eating");
 }

 void sleep() {
     System.out.println("Animal is sleeping");
 }
}

//Single Inheritance: Dog is a subclass of Animal
class Dog extends Animal {
 void bark() {
     System.out.println("Dog is barking");
 }
}

//Multiple Inheritance (through interfaces): Flying is an interface
interface Flying {
 void fly();
}

//Bird implements the Flying interface, achieving multiple inheritance
class Bird extends Animal implements Flying {
 void chirp() {
     System.out.println("Bird is chirping");
 }

 // Implementing the fly method from the Flying interface
 public void fly() {
     System.out.println("Bird is flying");
 }
}

//Hierarchical Inheritance: Cat is another subclass of Animal
class Cat extends Animal {
 void meow() {
     System.out.println("Cat is meowing");
 }
}

//Multilevel Inheritance: Kitten is a subclass of Cat, which is a subclass of Animal
class Kitten extends Cat {
 void purr() {
     System.out.println("Kitten is purring");
 }
}

public class InheritanceTypes {
 public static void main(String[] args) {
     // Single Inheritance Example
     Dog myDog = new Dog();
     myDog.eat();
     myDog.sleep();
     myDog.bark();
     System.out.println();

     // Multiple Inheritance Example
     Bird myBird = new Bird();
     myBird.eat();
     myBird.sleep();
     myBird.chirp();
     myBird.fly();
     System.out.println();

     // Hierarchical Inheritance Example
     Cat myCat = new Cat();
     myCat.eat();
     myCat.sleep();
     myCat.meow();
     System.out.println();

     // Multilevel Inheritance Example
     Kitten myKitten = new Kitten();
     myKitten.eat();
     myKitten.sleep();
     myKitten.meow();
     myKitten.purr();
 }
}
