package com.company.behavioral.mediator;

/**
 * @author koval
 */
public class ConcreteCollege2 extends Colleague {
    public ConcreteCollege2(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void notify(String message) {
        System.out.println("ConcreteCollege2 gets message " + message);
    }
}
