package com.company.behavioral.state;

public class BadSate implements State {

    private Person person;

    public void setPerson(Person person) {
        this.person = person;
    }

    @Override
    public void doSomething() {
        System.out.println("У меня плохое настроение");

    }
}
