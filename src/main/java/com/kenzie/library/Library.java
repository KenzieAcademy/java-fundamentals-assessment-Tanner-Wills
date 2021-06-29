package com.kenzie.library;
import java.util.ArrayList;


public class Library {

    private ArrayList<Book> libraryContents;
    private ArrayList<String> booksCheckedOut;
    private Object Book;



    //Constructor
    public Library(){
        this.libraryContents = new ArrayList<Book>();
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
        for (Book currentBook : libraryContents){
            String currentTitle = currentBook.getTitle();

            if (bookTitle == currentTitle && booksCheckedOut.contains(bookTitle)) {
                throw new BookNotAvailableException(bookTitle);
            }

            if (bookTitle == currentTitle && !booksCheckedOut.contains(bookTitle)){
                booksCheckedOut.add(bookTitle);
                System.out.println(bookTitle + " has been checked out!");
                return currentBook;
                }
            }
        throw new BookNotFoundException(bookTitle);
        }

    }


