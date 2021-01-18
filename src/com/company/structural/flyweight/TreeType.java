package com.company.structural.flyweight;

public class TreeType {

    private final String name;
    private final String color;

    public TreeType(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public void draw(int x, int y) {
        System.out.println("Tree name: " + name + " , color: " + color + ", x: " + x + ", y: " + y);
        System.out.println(this);
    }
}
