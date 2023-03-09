package com.aalcht.learnspringframework;

import com.aalcht.learnspringframework.game.GameRunner;
import com.aalcht.learnspringframework.game.PacManGame;

public class App01GamingBasicJava {

    public static void main(String[] args) {
        //var game = new MarioGame();
        //var game = new SuperContraGame();
        var game = new PacManGame();// a: Object Creation
        var gameRunner = new GameRunner(game); //2: Object  Creation + wiring of dependencies
        //Game is a dependency of GameRunner the game class is created and injected on GameRunner
        //If we have a lot of classes to inject into a runner what to do ?
        //JVM manage contratGame, MarioGame...
        // we wa,t spring manage all classes for the JVM
        //Inside the JVM we will create Sring container
        gameRunner.run();
    }
}
