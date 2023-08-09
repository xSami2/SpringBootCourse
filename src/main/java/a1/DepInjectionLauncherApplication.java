package a1;


import com.in28minutes.learnspringframework.GamingAppLauncherApplication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.*;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
class YourBusiness {
    Dep1 dep1;
    Dep2 dep2;
    @Autowired
    public YourBusiness(Dep1 dep1, Dep2 dep2) {
        System.out.println("Sam");
        this.dep1 = dep1;
        this.dep2 = dep2;
    }




    public String toString() {
        return "Using " + dep1 + " and " + dep2;
    }
}

@Component
class Dep1 {

}

@Component
class Dep2 {

}

@Configuration
@ComponentScan()
public class DepInjectionLauncherApplication {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(DepInjectionLauncherApplication.class);

        // Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
        System.out.println(context.getBean(YourBusiness.class));
    }
}
