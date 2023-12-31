package com.oops.inheritance;

//Address class representing a student's address
class Address {
 private String street;
 private String city;
 private String state;
 private String zipCode;

 // Constructor for Address
 public Address(String street, String city, String state, String zipCode) {
     this.street = street;
     this.city = city;
     this.state = state;
     this.zipCode = zipCode;
 }

 // Method to display the address
 public void displayAddress() {
     System.out.println("Address: " + street + ", " + city + ", " + state + "-" + zipCode);
 }
}

//Student class representing a student with an address
class Student {
 private int studentId;
 private String studentName;
 private Address studentAddress; // Aggregation: Student "has-a" Address

 // Constructor for Student
 public Student(int studentId, String studentName, Address studentAddress) {
     this.studentId = studentId;
     this.studentName = studentName;
     this.studentAddress = studentAddress;
 }

 // Method to display student information, including address
 public void displayStudentDetails() {
     System.out.println("Student ID: " + studentId);
     System.out.println("Student Name: " + studentName);
     System.out.print("Student ");
     studentAddress.displayAddress(); // Delegating displayAddress to the Address object
 }
}

public class Aggregation {
 public static void main(String[] args) {
     // Creating an Address object for a student
     Address studentAddress = new Address("B312 XYZ Apartments", "ABC Lane", "City P", "54321");

     // Creating a Student object with the Address object
     Student student = new Student(101, "Abc Pqr", studentAddress);

     // Displaying student details, including address
     student.displayStudentDetails();
 }
}
