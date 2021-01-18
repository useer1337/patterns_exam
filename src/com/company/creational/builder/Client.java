package com.company.creational.builder;

import com.company.creational.builder.builders.CarBuilder;
import com.company.creational.builder.director.Director;
import com.company.creational.builder.products.Car;

public class Client {

    public static void main(String[] args) {
        CarBuilder builder = new CarBuilder();
        Director director = new Director(builder);
        director.create("BMW");
        Car car = builder.getCar();
        System.out.println(car.toString());
    }

}
