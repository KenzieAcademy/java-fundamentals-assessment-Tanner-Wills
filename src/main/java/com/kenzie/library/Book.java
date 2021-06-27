package com.kenzie.library;

//import java.util.ArrayList; // import the ArrayList class

import java.math.BigDecimal;
import java.text.DecimalFormat;

public class Book {

    // Instance Variables
    private String title;
    private String author;
    private Genre genre;
    private String[] pages;
    private int currentPageNumber;

    // Constructor Method
    public Book(String title, String author, Genre genre, String[] pages) {

        // Initial instance variable values
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.pages = pages;
        this.currentPageNumber = 0;
    }
    // Add methods to Book Class

    public int getCurrentPageNumber(){
        return currentPageNumber + 1;
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
        //Conditional if there are no more pages to tear out
        if (pages.length < 1){
            return "There are no more pages to tear out!";
        }

        //Save contents of page before being torn out
        String tornPage = pages[currentPageNumber];

        //Remove the current page
        String[] newBook = new String[pages.length - 1];
        for (int page = 0; page < pages.length - 1; page++){
            if (page != currentPageNumber){
                newBook[page] = pages[page];
            }
        }
        pages = newBook;

        //Current page should now point to the next one.
        //If last page in the book is torn out, currentPageNumber --
        if (currentPageNumber == pages.length){
            currentPageNumber --;
        }

        //return the text of the current page
        return tornPage;
    }

    public int getNumPages() {
        return pages.length;
    }

    public double getPercentageComplete(){
        float x = currentPageNumber + 1;
        float y = pages.length;
        double percentage = (x/y)*100.0;
        return Math.round(percentage*10.0)/10.0;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public Genre getGenre() {
        return genre;
    }


}