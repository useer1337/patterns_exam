package com.company.structural.adapter;

public class Client {

    public static void main(String[] args) {
        Sensor sensor = new Adapter(new FahrenheitSensor());
        System.out.println(sensor.getTemperature() + " - температура в цельсиях");
    }

}
