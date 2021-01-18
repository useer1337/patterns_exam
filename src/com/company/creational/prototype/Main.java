package com.company.creational.prototype;

public class Main {

    public static void main(String[] args) {
        Ghost ghost = new Ghost(100, 50);
        Ghost ghost1 = (Ghost) ghost.clone();
        Ghost ghost2 = (Ghost) ghost.clone();
        Ghost ghost3 = (Ghost) ghost.clone();

        System.out.println(ghost.getAttack() + ", " + ghost.getHealth());
        System.out.println(ghost1.getAttack() + ", " + ghost1.getHealth());
        System.out.println(ghost2.getAttack() + ", " + ghost2.getHealth());
        System.out.println(ghost3.getAttack() + ", " + ghost3.getHealth());
    }
}
