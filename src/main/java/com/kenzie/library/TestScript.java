package com.kenzie.library;

public class TestScript {

    public static void main(String[] args) {
        String [] myContents = { "I", "Love", "Reading" };
        Book myBook = new Book("Sorcerer's Stone","J.K. Rowling","SciFi", myContents);
        System.out.println("Title: " + myBook.getTitle());
        System.out.println("Genre: " + myBook.getAuthor());
        System.out.println(myBook.getGenre());
        System.out.println("Number of pages: " + myBook.getNumPages());
        System.out.println(myBook.openPage(1));
        System.out.println(myBook.tearOutCurrentPage());
    }

}
