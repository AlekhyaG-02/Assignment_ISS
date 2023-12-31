package com.collections.map;

import java.util.HashMap;
import java.util.Map;

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

    // Overriding equals and hashCode for HashMap uniqueness
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Student student = (Student) obj;
        return studentId == student.studentId;
    }

    @Override
    public int hashCode() {
        return Integer.hashCode(studentId);
    }
}

public class StudentHashMap {
    public static void main(String[] args) {
        // Creating a HashMap of Students
        Map<Integer, Student> studentMap = new HashMap<>();

        // Adding students to the HashMap
        studentMap.put(101, new Student(101, "Alice"));
        studentMap.put(102, new Student(102, "Bob"));
        studentMap.put(103, new Student(103, "Charlie"));

        // Displaying the elements of the HashMap
        System.out.println("HashMap of Students:");
        for (Map.Entry<Integer, Student> entry : studentMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
