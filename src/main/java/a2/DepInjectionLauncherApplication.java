package a2;


import com.in28minutes.learnspringframework.GamingAppLauncherApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@Configuration
@ComponentScan()
public class DepInjectionLauncherApplication {
    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(GamingAppLauncherApplication.class);

      Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);

    }
}
