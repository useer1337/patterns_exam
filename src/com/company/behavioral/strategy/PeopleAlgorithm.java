package com.company.behavioral.strategy;

/**
 * @author koval
 */
public class PeopleAlgorithm implements Algorithm{
    @Override
    public void makeRoad() {
        System.out.println("Алгоритм построенн для пешего хода!");
    }
}
