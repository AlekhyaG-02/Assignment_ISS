package com.collections.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Book1 {
    private String title;
    private int pageCount;

    public Book1(String title, int pageCount) {
        this.title = title;
        this.pageCount = pageCount;
    }

    @Override
    public String toString() {
        return "Book1{title='" + title + "', pageCount=" + pageCount + "}";
    }

    // Getter for pageCount
    public int getPageCount() {
        return pageCount;
    }
}

public class ComparatorEg{
    public static void main(String[] args) {
        List<Book1> books = new ArrayList<>();

        books.add(new Book1("Java Programming", 400));
        books.add(new Book1("Data Structures", 300));
        books.add(new Book1("Algorithms", 500));

        // Sorting using a custom comparator (based on pageCount)
        Collections.sort(books, Comparator.comparing(Book1::getPageCount));

        // Displaying the sorted list
        System.out.println("Sorted List of Books (Comparator by Page Count):");
        for (Book1 book : books) {
            System.out.println(book);
        }
    }
}
