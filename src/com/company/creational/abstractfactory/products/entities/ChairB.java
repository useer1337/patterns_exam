package com.company.creational.abstractfactory.products.entities;

import com.company.creational.abstractfactory.products.Chair;

public class ChairB implements Chair {
    @Override
    public void sit() {
        System.out.println("Вы сидите на стуле B");
    }
}
