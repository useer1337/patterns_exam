package com.company.behavioral.memento;

/**
 * @author koval
 */
public class Main {

    public static void main(String[] args) {
        TextRedactor redactor = new TextRedactor();
        CareTaker careTaker = new CareTaker(redactor);

        careTaker.doSomething("Hello world!");


        careTaker.doSomething("How are you!");

        System.out.println(redactor.getState());

        careTaker.undo();
        System.out.println(redactor.getState());

        careTaker.undo();
        System.out.println(redactor.getState());

    }

}
