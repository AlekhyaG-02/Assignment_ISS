package com.collections.map;

import java.util.LinkedHashMap;
import java.util.Map;

public class StudentLinkedHashMap {
    public static void main(String[] args) {
        // Creating a LinkedHashMap of Students (maintains insertion order)
        Map<Integer, Student> linkedHashMap = new LinkedHashMap<>();

        // Adding students to the LinkedHashMap
        linkedHashMap.put(301, new Student(301, "Grace"));
        linkedHashMap.put(302, new Student(302, "Henry"));
        linkedHashMap.put(303, new Student(303, "Ivy"));

        // Displaying the elements of the LinkedHashMap (maintains insertion order)
        System.out.println("LinkedHashMap of Students:");
        for (Map.Entry<Integer, Student> entry : linkedHashMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
