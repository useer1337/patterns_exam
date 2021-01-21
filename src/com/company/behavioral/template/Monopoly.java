package com.company.behavioral.template;

public class Monopoly implements Game {
    @Override
    public void initGame() {
        System.out.println("Начинаем играть в монополию");
    }

    @Override
    public void playGame() {
        System.out.println("Продолжаем играть  монополию");

    }

    @Override
    public void endGame() {
        System.out.println("Конец игры в монополию");

    }
}
