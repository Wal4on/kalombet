package com.university.lab2;

public class Book extends Item {
    private String _author;

    public Book (String title, String uniqueID, String author) {
        super(title, uniqueID);
        this._author=author;
    }
    @Override 
    public void borrowItem() {
        setIsBorrowed(true);
    }
    @Override
    public void returnItem() {
        setIsBorrowed(false);
    }

    public String getAuthor() {
        return this._author;
    }
}
