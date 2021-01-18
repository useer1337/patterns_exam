package com.company.creational.abstractfactory.products.entities;

import com.company.creational.abstractfactory.products.Table;

public class TableB implements Table {
    @Override
    public void put(String obj) {
        System.out.println("Вы полжили на стол \"B\" предмет с названием " + obj);
    }
}
