package com.company.structural.bridge;

public class Client {

    public static void main(String[] args) {
        TV tv = new TV();
        Remote remote = new Remote(tv);

        remote.togglePower();
        remote.togglePower();
    }

}
