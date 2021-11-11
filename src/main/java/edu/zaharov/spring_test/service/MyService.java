package edu.zaharov.spring_test.service;

import edu.zaharov.spring_test.enums.Skill;
import edu.zaharov.spring_test.models.Primer;
import edu.zaharov.spring_test.models.User;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.Date;

@Component
@RequiredArgsConstructor
public class MyService {

    private final User user;

    @PostConstruct
    public void postConstruct(){

        user.setSkill(Skill.ARMY);
        System.out.println("post construct");
    }

    @PreDestroy
    public void preDestroy(){

        System.out.println("preDestroy");
    }

    @Bean
    public Primer primer(){

        return new Primer();
    }
}
