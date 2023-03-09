package com.aalcht.learnspringframework.game;

public class GameRunner {
    private GamingConsol game;
    public GameRunner(GamingConsol game) {
        this.game = game;
    }

    public void run() {
        System.out.println("Running game: "+game);
        game.up();
        game.down();
        game.left();
        game.right();
    }
}
