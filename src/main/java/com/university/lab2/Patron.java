package com.university.lab2;

import java.util.ArrayList;
import java.util.List;

public class Patron {
    private String _name;
    private String _ID;
    private List <Item> _borrowedItems;

    public Patron (String name, String ID) {
        this._name=name;
        this._ID=ID;
        this._borrowedItems= new ArrayList<>();
    }
    public List<Item> getBorrowedItems() {
        return this._borrowedItems;
    }
    public void setBorrowedItems(List <Item> borrowedItems) {
        this._borrowedItems=borrowedItems;
    }


    public void borrow(Item item) {
        this._borrowedItems.add(item);
    }
    public void returnItem(Item item) {
        this._borrowedItems.remove(item);
    }
}
