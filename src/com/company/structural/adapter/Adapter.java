package com.company.structural.adapter;

public class Adapter implements Sensor {

    private final FahrenheitSensor fahrenheitSensor;

    public Adapter(FahrenheitSensor fahrenheitSensor) {
        this.fahrenheitSensor = fahrenheitSensor;
    }

    @Override
    public double getTemperature() {
        return (fahrenheitSensor.getFahrenheitTemp() - 32.0) * 5.0 / 9.0;
    }
}
