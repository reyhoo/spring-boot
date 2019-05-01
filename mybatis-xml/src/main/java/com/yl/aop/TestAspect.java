package com.yl.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class TestAspect {


    @Before("execution(* com..*ServiceImpl.getUser(..))")
    public void before(){
        System.err.println("TestAspect.before");
    }
}
