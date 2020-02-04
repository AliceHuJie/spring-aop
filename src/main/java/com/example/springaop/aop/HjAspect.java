package com.example.springaop.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class HjAspect {
    private Logger logger = LoggerFactory.getLogger(HjAspect.class);

    @Pointcut("execution(* com.example.springaop.service.*.*(..))")
    private void pointcut() {

    }

    @Around("com.example.springaop.aop.HjAspect.pointcut()")
    public Object around(ProceedingJoinPoint pjp) {
        long start = System.currentTimeMillis();
        Object proceed = null;
        try {
            proceed = pjp.proceed();
            long end = System.currentTimeMillis();
            logger.info("方法耗时：" + (end - start));
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        return proceed;
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
