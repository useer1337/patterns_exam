package com.company.creational.builder.builders;

import com.company.creational.builder.products.Motorcycle;

public class MotorcycleBuilder implements Builder {

    private Motorcycle motorcycle;

    @Override
    public void reset() {
        motorcycle = new Motorcycle();
    }

    @Override
    public void setEngine(int value) {
        motorcycle.setEngine(value);
    }

    @Override
    public void setSeats(int count) {
        motorcycle.setSeats(count);
    }

    @Override
    public void setGPS(String type) {
        motorcycle.setGps(type);
    }

    public Motorcycle getMotorcycle() {
        return motorcycle;
    }
}
