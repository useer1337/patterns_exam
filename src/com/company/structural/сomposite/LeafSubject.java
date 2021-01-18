package com.company.structural.сomposite;

public class LeafSubject implements Subject{

    private final int price;

    public LeafSubject(int price) {
        this.price = price;
    }

    @Override
    public double getPrice() {
        return price;
    }
}
