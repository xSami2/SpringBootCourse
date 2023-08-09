package com.in28minutes.learnspringframework;


import game.GameRunner;
import game.GamingConsole;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("game")

public class GamingAppLauncherApplication {



    public static void main(String[] args) {

       var context = new AnnotationConfigApplicationContext(GamingAppLauncherApplication.class);

       context.getBean(GameRunner.class).run();
        context.getBean(GamingConsole.class).up();

    }
}
