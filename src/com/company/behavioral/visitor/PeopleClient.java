package com.company.behavioral.visitor;

public class PeopleClient implements Client {
    @Override
    public void execute(Agent agent) {
        agent.peopleInsurance(this);
    }
}
