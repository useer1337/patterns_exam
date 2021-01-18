package com.company.creational.abstractfactory.factory;

import com.company.creational.abstractfactory.products.Chair;
import com.company.creational.abstractfactory.products.Table;

public interface Factory {

    Chair createChair();

    Table createTable();

}
