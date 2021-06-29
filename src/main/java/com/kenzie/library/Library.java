package com.kenzie.library;
import java.util.ArrayList;
import java.util.Arrays;


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

    public String[] listBooks(){
        String[] titleList = new String[libraryContents.size()];
        for (int bookT = 0; bookT < libraryContents.size(); bookT++){
            String  bookTitle = libraryContents.get(bookT).getTitle();
            titleList[bookT] = bookTitle;
        }
        return titleList;
    }

    public String[] listBooks(Genre genre){
        //Loop through library contents to count how many times the genre occurs
        int genreCount = 0;
        for(Book book : libraryContents){
            if(genre == book.getGenre()){
                genreCount ++;
            }
        }
        //Create list of size genreCount and populate the list
        String[] genreList = new String[genreCount];
        int indexCount = 0;
        for (Book bookG : libraryContents){
            if(genre == bookG.getGenre()){
                genreList[indexCount] = bookG.getTitle();
                indexCount ++;
            }
        }
        return genreList;
    }

    public String[] listAvailableBooks(){
        int availableSize = 0;
        for(Book available : libraryContents){
            if(!booksCheckedOut.contains(available.getTitle())){
                availableSize ++;
            }
        }
        String[] availableBooks = new String[availableSize];
        int availableCount = 0;
        for(Book book : libraryContents){
            if(!booksCheckedOut.contains(book.getTitle())){
                availableBooks[availableCount] = book.getTitle();
                availableCount ++;
            }
        }
        return availableBooks;
    }

    public String[] listAvailableBooks(Genre genre){
        int availableSizeGenre = 0;
        for(Book availableGenre : libraryContents){
            if(!booksCheckedOut.contains(availableGenre.getTitle()) && genre == availableGenre.getGenre()){
                availableSizeGenre ++;
            }
        }
        String[] availableBooksGenre = new String[availableSizeGenre];
        int availableCountGenre = 0;
        for(Book book : libraryContents){
            if(!booksCheckedOut.contains(book.getTitle()) && genre == book.getGenre()){
                availableBooksGenre[availableCountGenre] = book.getTitle();
                availableCountGenre ++;
            }
        }
        return availableBooksGenre;
    }

    public boolean hasBook(String bookTitle){
        for(Book book: libraryContents){
            if(book.getTitle() == bookTitle){
                return true;
            }
        }
        return false;
    }

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

    public void returnBook(Book book){
        libraryContents.remove(book);
    }

    }


