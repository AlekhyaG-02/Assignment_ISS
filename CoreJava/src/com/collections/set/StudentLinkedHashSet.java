package com.collections.set;

import java.util.LinkedHashSet;
import java.util.Set;

public class StudentLinkedHashSet {
	public static void main(String[] args) {
		// Creating a LinkedHashSet of Students (maintains insertion order)
		Set<Student> linkedHashSet = new LinkedHashSet<>();

		// Adding students to the LinkedHashSet
		linkedHashSet.add(new Student(301, "Grace"));
		linkedHashSet.add(new Student(302, "Henry"));
		linkedHashSet.add(new Student(303, "Ivy"));

		// Displaying the elements of the LinkedHashSet (maintains insertion order)
		System.out.println("LinkedHashSet of Students:");
		for (Student student : linkedHashSet) {
			System.out.println(student);
		}
	}
}
