package com.aalcht.learnspringframework;

import com.aalcht.learnspringframework.game.GameRunner;
import com.aalcht.learnspringframework.game.GamingConsol;
import com.aalcht.learnspringframework.game.PacManGame;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App03GamingSpringBeans {

    public static void main(String[] args) {
        try (var context =
                     new AnnotationConfigApplicationContext
                             (GamingConfiguration.class)) {

            context.getBean(GamingConsol.class).up();
            context.getBean(GameRunner.class).run();
        }
    }
}
