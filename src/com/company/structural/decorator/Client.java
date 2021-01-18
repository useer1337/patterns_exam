package com.company.structural.decorator;

public class Client {

    public static void main(String[] args) {
        Component component = new Notifier();
        Component component1 = new SMSDecorator(component);
        Component component2 = new TwitterDecorator(component1);

        component2.send("Hello world!");

    }

}
