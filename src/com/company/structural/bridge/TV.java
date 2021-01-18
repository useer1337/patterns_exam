package com.company.structural.bridge;

public class TV implements Device {

    private boolean enable;


    @Override
    public boolean isEnabled() {
        return enable;
    }

    @Override
    public void enabled() {
        enable = true;
        System.out.println("Вы включили телевизор");
    }

    @Override
    public void disabled() {
        enable = false;
        System.out.println("Вы выключили телевизор");
    }
}
