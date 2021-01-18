package com.company.creational.factorymethod;

public class Main {

    public static void main(String[] args) {
        client(new BoatCreator());
    }

    public static void client(Creator creator) {
        Transport transport = creator.createTransport();
        transport.move();
    }

}
