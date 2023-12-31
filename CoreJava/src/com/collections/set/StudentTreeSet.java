package com.collections.set;

import java.util.TreeSet;

import java.util.*;

class Student1 implements Comparable<Student1> {
    private int Student1Id;
    private String Student1Name;

    public Student1(int Student1Id, String Student1Name) {
        this.Student1Id = Student1Id;
        this.Student1Name = Student1Name;
    }

    @Override
    public String toString() {
        return "Student1{id=" + Student1Id + ", name='" + Student1Name + "'}";
    }

    // Overriding compareTo for natural ordering based on ID
    @Override
    public int compareTo(Student1 otherStudent1) {
        return Integer.compare(this.Student1Id, otherStudent1.Student1Id);
    }

    // Overriding equals and hashCode for HashSet uniqueness
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Student1 Student1 = (Student1) obj;
        return Student1Id == Student1.Student1Id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(Student1Id);
    }
}

public class StudentTreeSet {
    public static void main(String[] args) {
        // Creating a TreeSet of Student1s (natural ordering based on ID)
        TreeSet<Student1> Student1TreeSet = new TreeSet<>();

        // Adding Student1s to the TreeSet
        Student1TreeSet.add(new Student1(201, "David"));
        Student1TreeSet.add(new Student1(202, "Eva"));
        Student1TreeSet.add(new Student1(203, "Frank"));

        // Displaying the elements of the TreeSet (sorted by ID)
        System.out.println("TreeSet of Students:");
        for (Student1 Student1 : Student1TreeSet) {
            System.out.println(Student1);
        }
    }
}
