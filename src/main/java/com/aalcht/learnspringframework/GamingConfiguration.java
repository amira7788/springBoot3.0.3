package com.aalcht.learnspringframework;

import com.aalcht.learnspringframework.game.GameRunner;
import com.aalcht.learnspringframework.game.GamingConsol;
import com.aalcht.learnspringframework.game.PacManGame;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GamingConfiguration {

    @Bean
    public GamingConsol game() {
        var game = new PacManGame();
        return game;
    }
    @Bean
    public GameRunner gameRunner(GamingConsol game) {
        var gameRunner = new GameRunner(game);
        return gameRunner;
    }


}
