package edu.zaharov.spring_test.cfg;

import edu.zaharov.spring_test.bean_post_processor.CustomBeanPostProcessor;
import edu.zaharov.spring_test.models.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;


@Configuration
public class Config {

    @Bean()
    public User user(){
        return new User();
    }

    @Bean
    public CustomBeanPostProcessor customBeanPostProcessor(){

        return new CustomBeanPostProcessor();
    }
}
