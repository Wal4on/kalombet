package com.university.lab2;

public class DVD extends Item {
    private int _duration;

    public DVD (String title, String uniqueID, int duration) {
        super(title, uniqueID);
        this._duration=duration;
    }
    @Override 
    public void borrowItem() {
        setIsBorrowed(true);
    }
    @Override
    public void returnItem() {
        setIsBorrowed(false);
    }

    public int getAuthor() {
        return this._duration;
    }
}

