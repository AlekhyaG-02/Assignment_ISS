package com.collections.list;

import java.util.ArrayList;
import java.util.List;

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
}

public class StudentArrayList {
    public static void main(String[] args) {
        // Creating an ArrayList of Students
        List<Student> studentList = new ArrayList<>();

        // Adding students to the ArrayList
        studentList.add(new Student(101, "Alice"));
        studentList.add(new Student(102, "Bob"));
        studentList.add(new Student(103, "Charlie"));

        // Displaying the elements of the ArrayList
        System.out.println("ArrayList of Students:");
        for (Student student : studentList) {
            System.out.println(student);
        }
    }
}
