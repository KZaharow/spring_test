package edu.zaharov.spring_test;

import edu.zaharov.spring_test.aspect.MyAspect;
import edu.zaharov.spring_test.models.Primer;
import edu.zaharov.spring_test.models.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.Date;

@SpringBootApplication
public class SpringTestApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext ctx = SpringApplication.run(SpringTestApplication.class, args);
        for (int i = 0; i < 10; i++) {
            System.out.println(ctx.getBean(User.class).sayQuote());
        }
    }

}
