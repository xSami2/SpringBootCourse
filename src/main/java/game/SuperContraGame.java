package game;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
@Qualifier("SuperContraGameQualifier")
public class SuperContraGame  implements GamingConsole{
    public void up(){
        System.out.println("UpUp");
    }
    public void down(){
        System.out.println("Down Down");
    }
    public void left(){
        System.out.println("Left Left");
    }
    public void right(){
        System.out.println("Right Right");
    }
}
