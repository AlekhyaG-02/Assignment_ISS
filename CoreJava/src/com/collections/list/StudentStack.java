package com.collections.list;

import java.util.Stack;

public class StudentStack {
    public static void main(String[] args) {
        // Creating a Stack of Students
        Stack<Student> studentStack = new Stack<>();

        // Pushing students onto the Stack
        studentStack.push(new Student(401, "Jack"));
        studentStack.push(new Student(402, "Katie"));
        studentStack.push(new Student(403, "Leo"));

        // Displaying the elements of the Stack (in reverse order)
        System.out.println("Stack of Students:");
        while (!studentStack.isEmpty()) {
            System.out.println(studentStack.pop());
        }
    }
}
