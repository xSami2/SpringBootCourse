package Task;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@Configuration
@ComponentScan()
public class ApplicationLauncher {


    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ApplicationLauncher.class);

        Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println); // Communicate With Business Class
        System.out.println(context.getBean(BusinessCalculationService.class).findMax());
    }


}
