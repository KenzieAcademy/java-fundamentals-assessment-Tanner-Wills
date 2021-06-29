package com.kenzie.library;

import java.util.ArrayList;
import java.util.Arrays;
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
        return currentPageNumber;
    }

    public String nextPage(){
        if (currentPageNumber < pages.length - 1){
            currentPageNumber ++;
            return pages[currentPageNumber];
        }
        return null;
    }

    public String prevPage(){
        if (currentPageNumber > 0){
            currentPageNumber --;
            return pages[currentPageNumber];
        }
        return null;
    }

    public String openPage(int pageNumber){
        currentPageNumber = pageNumber;
        return pages[currentPageNumber];
        }



    public String tearOutCurrentPage(){
        //Conditional if there are no more pages to tear out
        if (pages.length < 1){
            return null;
        }

        //Save contents of page before being torn out
        String tornPage = pages[currentPageNumber];

        //Remove the current page
        ArrayList<String> newBook = new ArrayList<>();
        for (int page = 0; page < pages.length - 1; page++){
            if (page != currentPageNumber){
                newBook.add(pages[page]);
            }
        }

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

    public int getPercentComplete(){
        int x = currentPageNumber + 1;
        int y = pages.length;
        return (x/y)*100;

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