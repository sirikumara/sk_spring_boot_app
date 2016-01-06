package hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Arrays;

/**
 * Created by sira on 1/5/2016.
 */

@SpringBootApplication
public class SPBootApplication {
    public static void main(String args[]  ){
        ApplicationContext context = SpringApplication.run(SPBootApplication.class,args);
        System.out.println("Lets inspect the beans provided by Spring Boot..");

        String[] beanNames = context.getBeanDefinitionNames();
        Arrays.sort(beanNames);

        for (String beanName :
                beanNames) {
            System.out.println(beanName);
        }
        
    }
}
