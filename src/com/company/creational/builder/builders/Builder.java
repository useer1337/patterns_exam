package com.company.creational.builder.builders;

public interface Builder {

    void reset();

    void setEngine(int value);

    void setSeats(int count);

    void setGPS(String type);

}
