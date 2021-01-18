package com.company.creational.factorymethod;

public class CarCreator implements Creator {
    @Override
    public Transport createTransport() {
        return new Car();
    }
}
