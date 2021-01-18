package com.company.creational.abstractfactory.products.entities;

import com.company.creational.abstractfactory.products.Table;

public class TableA implements Table {
    @Override
    public void put(String obj) {
        System.out.println("Вы полжили на стол \"A\" предмет с названием " + obj);
    }
}
