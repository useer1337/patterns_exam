package com.company.creational.builder.builders;

import com.company.creational.builder.products.Car;

public class CarBuilder implements Builder {

    private Car car;

    @Override
    public void reset() {
        car = new Car();
    }

    @Override
    public void setEngine(int value) {
        car.setEngine(value);
    }

    @Override
    public void setSeats(int count) {
        car.setSeats(count);
    }

    @Override
    public void setGPS(String type) {
        car.setGps(type);
    }

    public Car getCar() {
        return car;
    }
}
