package com.company.creational.factorymethod;

public class BoatCreator implements Creator {
    @Override
    public Transport createTransport() {
        return new Boat();
    }
}
