package com.university.lab2;

public abstract class Item {
    private String _title;
    private String _uniqueID;
    private boolean _isBorrowed; 
    
    public Item (String title, String uniqueID) {
        this._title=title;
        this._uniqueID=uniqueID;
        this._isBorrowed=false;
    }
    public abstract void borrowItem();
    public abstract void returnItem(); 

    public boolean getIsBorrowed() {
        return this._isBorrowed;
    }
    public void setIsBorrowed(boolean borrowed) {
        this._isBorrowed=borrowed;
    }
}

