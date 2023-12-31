package com.collections.list;

import java.util.Vector;

public class StudentVector {
    public static void main(String[] args) {
        // Creating a Vector of Students
        Vector<Student> studentVector = new Vector<>();

        // Adding students to the Vector
        studentVector.add(new Student(301, "Grace"));
        studentVector.add(new Student(302, "Henry"));
        studentVector.add(new Student(303, "Ivy"));

        // Displaying the elements of the Vector
        System.out.println("Vector of Students:");
        for (Student student : studentVector) {
            System.out.println(student);
        }
    }
}
