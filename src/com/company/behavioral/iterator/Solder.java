package com.company.behavioral.iterator;

public class Solder {

    private int healthPoints;
    private Solder next;

    public Solder(int healthPoints) {
        this.healthPoints = healthPoints;
    }

    public void addHealthPoints(int value) {
        healthPoints += value;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public void setHealthPoints(int healthPoints) {
        this.healthPoints = healthPoints;
    }

    public Solder getNext() {
        return next;
    }

    public void setNext(Solder next) {
        this.next = next;
    }
}
