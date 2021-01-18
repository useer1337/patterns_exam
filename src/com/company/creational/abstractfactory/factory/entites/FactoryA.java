package com.company.creational.abstractfactory.factory.entites;

import com.company.creational.abstractfactory.factory.Factory;
import com.company.creational.abstractfactory.products.Chair;
import com.company.creational.abstractfactory.products.Table;
import com.company.creational.abstractfactory.products.entities.ChairA;
import com.company.creational.abstractfactory.products.entities.TableA;

public class FactoryA implements Factory {
    @Override
    public Chair createChair() {
        return new ChairA();
    }

    @Override
    public Table createTable() {
        return new TableA();
    }
}
