package com.collections.set;

import java.util.HashSet;
import java.util.Set;

class Student {
    private int studentId;
    private String studentName;

    public Student(int studentId, String studentName) {
        this.studentId = studentId;
        this.studentName = studentName;
    }

    @Override
    public String toString() {
        return "Student{id=" + studentId + ", name='" + studentName + "'}";
    }

    // Overriding hashCode and equals for HashSet uniqueness
    @Override
    public int hashCode() {
        return studentId;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Student student = (Student) obj;
        return studentId == student.studentId;
    }
}

public class StudentHashSet {
    public static void main(String[] args) {
        // Creating a HashSet of Students
        Set<Student> studentSet = new HashSet<>();

        // Adding students to the HashSet
        studentSet.add(new Student(101, "Alice"));
        studentSet.add(new Student(102, "Bob"));
        studentSet.add(new Student(103, "Charlie"));

        // Displaying the elements of the HashSet
        System.out.println("HashSet of Students:");
        for (Student student : studentSet) {
            System.out.println(student);
        }
    }
}
