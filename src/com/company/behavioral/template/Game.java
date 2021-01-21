package com.company.behavioral.template;

public interface Game {

    void initGame();

    void playGame();

    void endGame();

    default void playOnGame(){
        initGame();
        playGame();
        endGame();
    }


}
