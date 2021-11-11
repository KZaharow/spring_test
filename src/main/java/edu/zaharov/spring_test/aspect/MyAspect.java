package edu.zaharov.spring_test.aspect;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.util.Date;

@Slf4j
@Aspect
@Component
public class MyAspect {

    @Before("execution(* edu.zaharov.spring_test.models.Quoter+.*(..))")
    public void doLog1() {

        log.info("Log {}", "****************************");
    }

    @After("execution(* edu.zaharov.spring_test.models.Quoter+.*(..))")
    public void doLog2() {

        log.info("Log {}", "----------------------------");
    }

}
