package LazyInitLauncherApplication;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import java.util.Arrays;
@Component
class ClassA{

}
 @Component
 @Lazy
 class ClassB{
     private final ClassA ClassA;

     public ClassB ( ClassA ClassA ) {
         this.ClassA = ClassA;
     }
     public void doSomething (){
         System.out.println("Hello");
     }
 }

    @Configuration
    @ComponentScan
    public class LazyInitLauncherApplication {

        public static void main ( String[] args ) {
            var context = new AnnotationConfigApplicationContext ( LazyInitLauncherApplication.class );
            Arrays.stream ( context.getBeanDefinitionNames () ).forEach ( System.out::println );
            System.out.println ("Init");
           context.getBean(ClassB.class ).doSomething();

        }
    }
