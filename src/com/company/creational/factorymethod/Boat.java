package com.company.creational.factorymethod;

public class Boat implements Transport {
    @Override
    public void move() {
        System.err.println("Ладка плывет по влонам!");
    }
}
