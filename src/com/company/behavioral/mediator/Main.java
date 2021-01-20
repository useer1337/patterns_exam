package com.company.behavioral.mediator;

/**
 * @author koval
 */
public class Main {

    public static void main(String[] args) {
        ConcreteMediator mediator = new ConcreteMediator();

        ConcreteCollege1 concreteCollege1 = new ConcreteCollege1(mediator);
        ConcreteCollege2 concreteCollege2 = new ConcreteCollege2(mediator);

        mediator.setConcreteCollege1(concreteCollege1);
        mediator.setConcreteCollege2(concreteCollege2);

        concreteCollege1.send("How are you?");
        concreteCollege2.send("Fine, thanks");
    }

}
