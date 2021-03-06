package com.kenzie.library;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;


public class Library {

    private ArrayList<Book> libraryContents;
    private ArrayList<String> booksCheckedOut;
    private Object Book;

    //Constructor
    public Library(){
        this.libraryContents = new ArrayList<>();
        this.booksCheckedOut = new ArrayList<>();
    }

    //Add Library methods
    public void addBook(Book book){
        libraryContents.add(book);
        Collections.sort(libraryContents);
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
            if(genre.equals(bookG.getGenre())){
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
            if(book.getTitle().equals(bookTitle)){
                return true;
            }
        }
        return false;
    }

    public Book checkoutBook(String bookTitle){
        //Loop through libraryContents to see if bookTitle is in there
        for (Book currentBook : libraryContents){
            String currentTitle = currentBook.getTitle();

            if (bookTitle.equals(currentTitle) && booksCheckedOut.contains(bookTitle)) {
                throw new BookNotAvailableException(bookTitle);
            }

            if (bookTitle.equals(currentTitle) && !booksCheckedOut.contains(bookTitle)){
                booksCheckedOut.add(bookTitle);
                return currentBook;
                }
            }
        throw new BookNotFoundException(bookTitle);
        }

    public void returnBook(Book book){
        booksCheckedOut.remove(book.getTitle());
    }

    }


