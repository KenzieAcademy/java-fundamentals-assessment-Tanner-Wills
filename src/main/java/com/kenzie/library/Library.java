package com.kenzie.library;
import java.util.ArrayList;


public class Library {

    private ArrayList<Object> libraryContents;
    private ArrayList<String> booksCheckedOut;
    private Object Book;


    //Constructor
    public Library(){
        this.libraryContents = new ArrayList<Object>();
        this.booksCheckedOut = new ArrayList<String>();
    }

    //Add Library methods
    public void addBook(Book book){
        libraryContents.add(book);
    }
/*
    public String[] listBooks(){
        String[] bookList = new String[libraryContents.size()];
        if (libraryContents.size() > 0){
            for (int book = 0; book <= libraryContents.size(); book++){
                Book currentBook = (Book) libraryContents.get(book);
                String bookTitle = currentBook.getTitle();
                bookList[book] = bookTitle;

            }
            } else {
            System.out.println("There are no books in the library!");
        }
        return System.out.println(bookList);;
    }
*/

    public Book checkoutBook(String bookTitle){
        //Loop through libraryContents to see if bookTitle is in there
        for (int i = 0; i < libraryContents.size(); i++){
            Book currentBook = (Book) libraryContents.get(i);
            String currentTitle = currentBook.getTitle();

            if (bookTitle == currentTitle && !booksCheckedOut.contains(bookTitle)) {
                booksCheckedOut.add(bookTitle);
                System.out.println("book checked out");
                return currentBook;
            }

            else if (bookTitle == currentTitle && booksCheckedOut.contains(bookTitle)){
                System.out.println("test");
                throw new BookNotAvailableException(bookTitle);
                }
            }
        throw new BookNotFoundException(bookTitle);
        }

    }


