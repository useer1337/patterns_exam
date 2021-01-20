package com.company.behavioral.strategy;

/**
 * @author koval
 */
public class Main {

    public static void main(String[] args) {
        Algorithm algorithm = new CarRoad();
        Navigator navigator = new Navigator(algorithm);
        navigator.createRoad();

        navigator.setAlgorithm(new PeopleAlgorithm());
        navigator.createRoad();
    }

}
