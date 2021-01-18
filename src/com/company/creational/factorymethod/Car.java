package com.company.creational.factorymethod;

public class Car implements Transport {
    @Override
    public void move() {
        System.err.println("Машина едит вперед!");
    }
}
