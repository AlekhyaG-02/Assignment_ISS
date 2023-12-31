package com.collections.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Book implements Comparable<Book> {
    private String title;
    private int pageCount;

    public Book(String title, int pageCount) {
        this.title = title;
        this.pageCount = pageCount;
    }

    @Override
    public int compareTo(Book otherBook) {
        // Compare based on pageCount for natural ordering
        return Integer.compare(this.pageCount, otherBook.pageCount);
    }

    @Override
    public String toString() {
        return "Book{title='" + title + "', pageCount=" + pageCount + "}";
    }
}

public class ComparableEg {
    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();

        books.add(new Book("Java Programming", 400));
        books.add(new Book("Data Structures", 300));
        books.add(new Book("Algorithms", 500));

        // Sorting using Comparable (natural ordering)
        Collections.sort(books);

        // Displaying the sorted list
        System.out.println("Sorted List of Books (Natural Ordering by Page Count):");
        for (Book book : books) {
            System.out.println(book);
        }
    }
}
