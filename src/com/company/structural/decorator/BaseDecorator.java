package com.company.structural.decorator;

public class BaseDecorator implements Component {

    private Component component;

    public BaseDecorator(Component component) {
        this.component = component;
    }

    @Override
    public void send(String message) {
        component.send(message);
    }
}
