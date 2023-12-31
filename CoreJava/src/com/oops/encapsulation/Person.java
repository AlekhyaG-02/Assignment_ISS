package com.oops.encapsulation;


//Class: Person (Encapsulated class)
public class Person {
 // Private attributes (encapsulated data)
 private String name;
 private int age;

 // Public constructor to initialize the attributes
 public Person(String name, int age) {
     this.name = name;
     this.age = age;
 }

 // Public methods to access and modify the encapsulated data
 // Getter for name
 public String getName() {
     return name;
 }

 // Setter for name
 public void setName(String name) {
     this.name = name;
 }

 // Getter for age
 public int getAge() {
     return age;
 }

 // Setter for age
 public void setAge(int age) {
     if (age > 0) {
         this.age = age;
     } else {
         System.out.println("Invalid age. Age must be greater than 0.");
     }
 }

 // Display method to print the person's details
 public void display() {
     System.out.println("Person: [Name: " + name + ", Age: " + age + "]");
 }
}
