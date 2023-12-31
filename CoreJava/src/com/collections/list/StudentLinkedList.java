package com.collections.list;

import java.util.LinkedList;

public class StudentLinkedList{
    public static void main(String[] args) {
        // Creating a LinkedList of Students
        LinkedList<Student> studentLinkedList = new LinkedList<>();

        // Adding students to the LinkedList
        studentLinkedList.add(new Student(201, "David"));
        studentLinkedList.add(new Student(202, "Eva"));
        studentLinkedList.add(new Student(203, "Frank"));

        // Displaying the elements of the LinkedList
        System.out.println("LinkedList of Students:");
        for (Student student : studentLinkedList) {
            System.out.println(student);
        }
    }
}
