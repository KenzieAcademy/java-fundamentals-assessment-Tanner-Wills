package com.kenzie.library;

import java.util.Arrays;

public class TestScript {

    public static void main(String[] args) {
        String [] myContents = { "I", "Love", "Reading" };
        Library library = new Library();
        Book myBook = new Book("Sorcerer's Stone","J.K. Rowling",Genre.SCIENCE_FICTION, myContents);
        System.out.println("Title: " + myBook.getTitle());
        System.out.println("Author: " + myBook.getAuthor());
        System.out.println("Genre: " + myBook.getGenre());
        System.out.println("Number of pages: " + myBook.getNumPages());
        System.out.println("Current Page: " + myBook.getCurrentPageNumber());
        System.out.println(library.addBook(myBook));
        System.out.println(Arrays.toString(library.listBooks()));


    }

}
