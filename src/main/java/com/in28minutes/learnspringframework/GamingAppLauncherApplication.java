package com.in28minutes.learnspringframework;


import game.GameRunner;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("game")
public class GamingAppLauncherApplication {



    public static void main(String[] args) {

       var context = new AnnotationConfigApplicationContext(GamingAppLauncherApplication.class);

       context.getBean(GameRunner.class).run();

    }
}
