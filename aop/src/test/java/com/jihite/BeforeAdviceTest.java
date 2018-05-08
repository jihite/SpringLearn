package com.jihite;

import org.springframework.aop.BeforeAdvice;
import org.springframework.aop.framework.ProxyFactory;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BeforeAdviceTest {
    private Waiter target;
    private BeforeAdvice advice;
    private ProxyFactory pf;

    @BeforeTest
    public void init() {
        target = new NaiveWaiter();
        advice = new GreetingBeforeAdvice();
        pf = new ProxyFactory();
        pf.setTarget(target);
        pf.addAdvice(advice);
    }

    @Test
    public void beforeAdvice() {
        Waiter proxy = (Waiter)pf.getProxy();
        proxy.greetTo("Jphn");
        proxy.serveTo("Tom");
    }
}
