package com.company.behavioral.visitor;

public class ConcreteAgent implements Agent{
    @Override
    public void peopleInsurance(Client client) {
        System.out.println("Новая страховка для человека.");
    }

    @Override
    public void companyInsurance(Client client) {
        System.out.println("Новая страховка для комапнии.");

    }
}
