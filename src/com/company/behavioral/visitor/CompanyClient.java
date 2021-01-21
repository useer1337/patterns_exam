package com.company.behavioral.visitor;

public class CompanyClient implements Client {
    @Override
    public void execute(Agent agent) {
        agent.companyInsurance(this);
    }
}
