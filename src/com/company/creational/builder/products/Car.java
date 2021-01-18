package com.company.creational.builder.products;

public class Car {

    private int engine;
    private int seats;
    private String gps;

    public int getEngine() {
        return engine;
    }

    public void setEngine(int engine) {
        this.engine = engine;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public String getGps() {
        return gps;
    }

    public void setGps(String gps) {
        this.gps = gps;
    }

    @Override
    public String toString() {
        return "Car{" +
                "engine=" + engine +
                ", seats=" + seats +
                ", gps='" + gps + '\'' +
                '}';
    }
}
