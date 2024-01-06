package com.university.lab1;

import java.util.ArrayList;
import java.util.List;



class Library {
    private List<Book> books;

    public Library() {
        this.books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public List<Book> getAllBooks() {
        return books;
    }

    public Book findBookByTitle(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                return book;
            }
        }
        return null;
    }

    public boolean removeBookByISBN(String isbn) {
        for (Book book : books) {
            if (book.getIsbn().equals(isbn)) {
                books.remove(book);
                return true;
            }
        }
        return false;
    }
}

public class LibraryMain {
    public static void main(String[] args) {
        Library library = new Library();

        library.addBook(new Book("Книга 1", "Автор 1", "1234567890", 2020));
        library.addBook(new Book("Книга 2", "Автор 2", "0987654321", 2019));
        library.addBook(new Book("Книга 3", "Автор 3", "1112223334", 2021));

        Book foundBook = library.findBookByTitle("Книга 2");
        if (foundBook != null) {
            System.out.println("Знайдена книга: " + foundBook.getTitle() + " (" + foundBook.getIsbn() + ")");
        } else {
            System.out.println("Книга не знайдена.");
        }

        String isbnToDelete = "0987654321";
        boolean removed = library.removeBookByISBN(isbnToDelete);
        if (removed) {
            System.out.println("Книга з ISBN " + isbnToDelete + " видалена з бібліотеки.");
        } else {
            System.out.println("Книгу не видалено. Книга з ISBN " + isbnToDelete + " не знайдена.");
        }

        List<Book> allBooks = library.getAllBooks();
        System.out.println("Усі книги в бібліотеці:");
        for (Book book : allBooks) {
            System.out.println(book.getTitle() + " (" + book.getAuthor() + ")");
        }
    }
}
