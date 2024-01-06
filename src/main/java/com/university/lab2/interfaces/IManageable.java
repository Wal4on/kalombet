package com.university.lab2.interfaces;

import java.util.List;

import com.university.lab2.Item;

public interface IManageable {
    void addItem(Item item);

    void removeItem(Item item);

    List<Item> listAvailable();

    List<Item> listBorrowed();
}