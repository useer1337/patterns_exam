package com.company.behavioral.template;

public class Chess implements Game {
    @Override
    public void initGame() {
        System.out.println("Начинаем играть в шахматы");
    }

    @Override
    public void playGame() {
        System.out.println("Играем в шахматы");

    }

    @Override
    public void endGame() {
        System.out.println("Конец игры в шахматы");

    }
}
