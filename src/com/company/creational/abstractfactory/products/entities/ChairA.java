package com.company.creational.abstractfactory.products.entities;

import com.company.creational.abstractfactory.products.Chair;

public class ChairA implements Chair {
    @Override
    public void sit() {
        System.out.println("Вы сели на стул A");
    }
}
