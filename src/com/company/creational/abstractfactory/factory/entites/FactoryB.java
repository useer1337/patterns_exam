package com.company.creational.abstractfactory.factory.entites;

import com.company.creational.abstractfactory.factory.Factory;
import com.company.creational.abstractfactory.products.Chair;
import com.company.creational.abstractfactory.products.Table;
import com.company.creational.abstractfactory.products.entities.ChairB;
import com.company.creational.abstractfactory.products.entities.TableB;

public class FactoryB implements Factory {
    @Override
    public Chair createChair() {
        return new ChairB();
    }

    @Override
    public Table createTable() {
        return new TableB();
    }
}
