package com.company.behavioral.visitor;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Client> clients = new ArrayList<>();
        clients.add(new PeopleClient());
        clients.add(new CompanyClient());

        Agent agent = new ConcreteAgent();

        for (Client client : clients){
            client.execute(agent);
        }
    }

}
