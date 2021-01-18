package com.company.creational.prototype;

public class Ghost implements Monster {

    private final int health;
    private final int attack;
    private final String type;

    public Ghost(int health, int attack) {
        this.health = health;
        this.attack = attack;
        type = "Призрак";
    }

    public int getHealth() {
        return health;
    }

    public int getAttack() {
        return attack;
    }

    @Override
    public Monster clone() {
        return new Ghost(health, attack);
    }
}
