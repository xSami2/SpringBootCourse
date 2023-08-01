package game;

import org.springframework.stereotype.Component;

@Component

public class PacManGame implements GamingConsole{

    @Override
    public void up() {
        System.out.println("Pac Man Up");
    }

    @Override
    public void down() {
        System.out.println("Pac Man down");
    }

    @Override
    public void left() {
        System.out.println("Pack Man Left");
    }

    @Override
    public void right() {
        System.out.println("Pac Man Right");
    }
}
