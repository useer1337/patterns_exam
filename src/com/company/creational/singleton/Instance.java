package com.company.creational.singleton;

public class Instance {

    private static Instance instance;

    private Instance() {
    }

    public Instance getInstance() {
        return instance == null ? new Instance() : instance;
    }

}
