package com.jihite;
import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;

public class GreetingAfterAdvice implements AfterReturningAdvice {
    @Override
    public void afterReturning(Object returnObj, Method method, Object[] args, Object obj) throws Throwable {
        String clientName = (String)args[0];
        System.out.println("Please enjoy yourself! Mr." + clientName);
    }
}
