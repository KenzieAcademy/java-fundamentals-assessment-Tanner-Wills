package com.kenzie.library;

import java.util.Arrays;

public class TestScript {

    public static void main(String[] args) {
        String[] myContents = {"I", "Love", "Reading"};

        Book myBook = new Book("Sorcerer's Stone", "J.K. Rowling", Genre.SCIENCE_FICTION, myContents);


        Library library = new Library();
        library.addBook(myBook);

        library.checkoutBook("Sorcerer's Stone");
        library.checkoutBook("Sorcerer's Stone");



        //library.listBooks();

        }
    }

