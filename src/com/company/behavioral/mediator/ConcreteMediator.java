package com.company.behavioral.mediator;

/**
 * @author koval
 */
public class ConcreteMediator implements Mediator {

    private ConcreteCollege1 concreteCollege1;
    private ConcreteCollege2 concreteCollege2;

    public void setConcreteCollege1(ConcreteCollege1 concreteCollege1) {
        this.concreteCollege1 = concreteCollege1;
    }

    public void setConcreteCollege2(ConcreteCollege2 concreteCollege2) {
        this.concreteCollege2 = concreteCollege2;
    }

    @Override
    public void sendMessage(Colleague colleague, String message) {
        if (concreteCollege1.equals(colleague)) {
            concreteCollege2.notify(message);
        } else {
            concreteCollege1.notify(message);
        }
    }
}
