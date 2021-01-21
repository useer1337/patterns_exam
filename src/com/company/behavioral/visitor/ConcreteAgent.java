package com.company.behavioral.visitor;

public class ConcreteAgent implements Agent{
    @Override
    public void peopleInsurance(PeopleClient client) {
        System.out.println("Новая страховка для человека.");
    }

    @Override
    public void companyInsurance(CompanyClient client) {
        System.out.println("Новая страховка для комапнии.");

    }
}
