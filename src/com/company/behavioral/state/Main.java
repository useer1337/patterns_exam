package com.company.behavioral.state;

public class Main {

    public static void main(String[] args) {
        GoodState goodState = new GoodState();
        BadMarkState badMarkState = new BadMarkState();
        Person person = new Person(badMarkState);
        person.doSomething();
        person.doSomething();
    }


}
