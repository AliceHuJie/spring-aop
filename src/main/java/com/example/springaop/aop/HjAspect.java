package com.example.springaop.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class HjAspect {
    @Pointcut("execution(* com.example.springaop.service.*.*(..))")
    private void pointcut() {

    }

    @Before("com.example.springaop.aop.HjAspect.pointcut()")
    public void before() {
        System.out.println("before");
    }

    @After("com.example.springaop.aop.HjAspect.pointcut()")
    public void after() {
        System.out.println("after");
    }
}
