package com.collections.example;

import java.util.*;

//Custom Student class with properties ID and Name
class Student implements Comparable<Student> {
 private int id;
 private String name;

 public Student(int id, String name) {
     this.id = id;
     this.name = name;
 }

 // Getters for ID and Name
 public int getId() {
     return id;
 }

 public String getName() {
     return name;
 }

 // Implementing Comparable for natural ordering based on ID
 @Override
 public int compareTo(Student otherStudent) {
     return Integer.compare(this.id, otherStudent.id);
 }

 // Overriding toString for better representation
 @Override
 public String toString() {
     return "Student{id=" + id + ", name='" + name + "'}";
 }
}

public class CollectionOperations {
 public static void main(String[] args) {
     // Creating a List of Student objects
     List<Student> studentList = new ArrayList<>();
     studentList.add(new Student(101, "John"));
     studentList.add(new Student(102, "Alice"));
     studentList.add(new Student(103, "Bob"));

     // Displaying the original list
     System.out.println("Original List:");
     studentList.forEach(System.out::println);

     // Sorting the list using Comparable (natural ordering based on ID)
     Collections.sort(studentList);
     System.out.println("\nList sorted by ID (Comparable):");
     studentList.forEach(System.out::println);

     // Sorting the list using Comparator (custom ordering based on Name)
     Comparator<Student> nameComparator = Comparator.comparing(Student::getName);
     Collections.sort(studentList, nameComparator);
     System.out.println("\nList sorted by Name (Comparator):");
     studentList.forEach(System.out::println);

     // Creating a Set of Student objects
     Set<Student> studentSet = new TreeSet<>(nameComparator);
     studentSet.addAll(studentList);

     // Displaying the Set (automatically sorted by Name)
     System.out.println("\nSet sorted by Name (TreeSet):");
     studentSet.forEach(System.out::println);

     // Creating a Map with Student objects as keys and values
     Map<Student, Student> studentMap = new TreeMap<>(nameComparator);
     for (Student student : studentList) {
         studentMap.put(student, student);
     }

     // Displaying the Map (automatically sorted by Name)
     System.out.println("\nMap sorted by Name (TreeMap):");
     studentMap.forEach((key, value) -> System.out.println(key + " -> " + value));
 }
}
