package com.company.behavioral.state;

public class Person {

    private State state;

    public Person(State state) {
        this.state = state;
        state.setPerson(this);

    }

    public void changeState(State state) {
        this.state = state;
    }

    public void doSomething() {
        state.doSomething();
    }
}
