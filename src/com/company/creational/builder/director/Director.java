package com.company.creational.builder.director;

import com.company.creational.builder.builders.Builder;

public class Director {

    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public void setBuilder(Builder builder) {
        this.builder = builder;
    }

    public void create(String type){

        builder.reset();
        if (type.equals("Tayota")){
            builder.setGPS("Sumsung Maps");
            builder.setSeats(3);
        }else{
            builder.setEngine(123);
            builder.setGPS("Google Maps");
            builder.setSeats(5);
        }
    }
}
