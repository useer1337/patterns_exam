package com.company.behavioral.strategy;

/**
 * @author koval
 */
public class Navigator {

    private Algorithm algorithm;

    public Navigator(Algorithm algorithm) {
        this.algorithm = algorithm;
    }

    public void setAlgorithm(Algorithm algorithm) {
        this.algorithm = algorithm;
    }

    public void createRoad() {
        algorithm.makeRoad();
    }
}
