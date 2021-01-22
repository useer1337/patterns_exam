package com.company.behavioral.mediator;

/**
 * @author koval
 */
public class ConcreteCollege1 extends Colleague {

    public ConcreteCollege1(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void notify(String message) {
        System.out.println("ConcreteCollege1 gets message " + message);
    }


}
