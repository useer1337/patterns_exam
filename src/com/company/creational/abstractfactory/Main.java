package com.company.creational.abstractfactory;

import com.company.creational.abstractfactory.factory.Factory;
import com.company.creational.abstractfactory.factory.entites.FactoryA;

public class Main {

    public static void main(String[] args) {
        client(new FactoryA());
    }

    public static void client(Factory factory) {
        factory.createChair().sit();
        factory.createTable().put("Бумага");
    }

}
