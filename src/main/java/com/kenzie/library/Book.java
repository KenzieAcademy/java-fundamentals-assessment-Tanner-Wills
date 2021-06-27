package com.kenzie.library;

import java.util.ArrayList; // import the ArrayList class

public class Book {

    // Instance Variables
    private String title;
    private String author;
    private String genre;
    private String[] pages;
    private int currentPageNumber;

    // Constructor Method
    public Book(String title, String author, String genre, String[] pages) {

        // Initial instance variable values
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.pages = pages;
        this.currentPageNumber = 0;
    }
    // Add methods to Book Class

    public int getCurrentPageNumber(){
        return currentPageNumber;
    }

    public String nextPage(){
        if (currentPageNumber < pages.length - 1){
            currentPageNumber ++;
            return pages[currentPageNumber];
        }
        return "You have reached the end of the book!";
    }

    public String prevPage(){
        if (currentPageNumber > 0){
            currentPageNumber --;
            return pages[currentPageNumber];
        }
        return "You are on the first page of the book!";
    }

    public String openPage(int pageNumber){
        if (pageNumber < 1){
            return pages[0];
        }
        return pages[pageNumber - 1];
    }

    public String tearOutCurrentPage(){
        //save contents of page before being torn out
        String tornPage = pages[currentPageNumber];

        //remove the current page
        if (pages.length < 1){
            return "There are no more pages to tear out!";
        }

        String[] newBook = new String[pages.length - 1];
        for (int page = 0; page < pages.length; page++){
            if (page != currentPageNumber){
                newBook[page] = pages[page];
            }
        }
        pages = newBook;


        //current page should now point to the next one, if there is one
        //if (currentPageNumber = pages.length){
           // currentPageNumber --;
        //}

        //return the text of the current page
        return tornPage;
    }

    public int getNumPages() {
        return pages.length;
    }




    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getGenre() {
        return genre;
    }



}