package com.collections.map;

import java.util.TreeMap;

public class StudentTreeMap {
    public static void main(String[] args) {
        // Creating a TreeMap of Students (natural ordering based on key)
        TreeMap<Integer, Student> studentTreeMap = new TreeMap<>();

        // Adding students to the TreeMap
        studentTreeMap.put(201, new Student(201, "David"));
        studentTreeMap.put(202, new Student(202, "Eva"));
        studentTreeMap.put(203, new Student(203, "Frank"));

        // Displaying the elements of the TreeMap (sorted by key)
        System.out.println("TreeMap of Students:");
        for (java.util.Map.Entry<Integer, Student> entry : studentTreeMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
