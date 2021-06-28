package com.kenzie.library;
import java.util.*;

public class Library {

    private List<Object> libraryContents;
    private List<String> booksCheckedOut;
    private Object Book;

    public Library(){

        this.libraryContents = new ArrayList<Object>();
        this.booksCheckedOut = new ArrayList<String>();

    }

    public Object addBook(Book book){
        return libraryContents.add(Book);
    }
/*
    public String[] listBooks(){
        String[] bookList = new String[libraryContents.size()];
        if (libraryContents.size() > 0){
            for (int book = 0; book < libraryContents.size(); book++){
                Book currentBook = (Book) libraryContents.get(book);
                String bookTitle = currentBook.getTitle();
                bookList[book] = bookTitle;
                return bookList;
            }
        } else {
            System.out.println("There are no books in the library!");
        }
        return null;
    }
*/
}
