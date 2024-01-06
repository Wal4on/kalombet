package com.university.lab1;
import static org.junit.Assert.assertTrue;
import org.junit.Test;
import org.junit.Before;
import java.util.List;
import static org.junit.Assert.*;

public class LibraryTest {
    private Library library;

    @Before
    public void setUp() {
        library = new Library();
        library.addBook(new Book("Книга 1", "Автор 1", "1234567890", 2020));
        library.addBook(new Book("Книга 2", "Автор 2", "0987654321", 2019));
        library.addBook(new Book("Книга 3", "Автор 3", "1112223334", 2021));
    }

    @Test
    public void testFindBookByTitle() {
        Book foundBook = library.findBookByTitle("Книга 2");
        assertNotNull(foundBook);
        assertEquals("Книга 2", foundBook.getTitle());
    }

    @Test
    public void testRemoveBookByISBN() {
        boolean removed = library.removeBookByISBN("0987654321");
        assertTrue(removed);
        assertNull(library.findBookByTitle("Книга 2"));
    }

    @Test
    public void testRemoveBookByISBN_NotFound() {
        boolean removed = library.removeBookByISBN("123456789");
        assertFalse(removed);
    }

    @Test
    public void testGetAllBooks() {
        List<Book> allBooks = library.getAllBooks();
        assertNotNull(allBooks);
        assertEquals(3, allBooks.size());
    }
}

