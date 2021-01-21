package com.company.behavioral.template;

public class Main {

    public static void main(String[] args) {
        Game game = new Chess();
        game.playOnGame();
        System.out.println("-------------------------------------");
        game = new Monopoly();
        game.playOnGame();
    }

}
