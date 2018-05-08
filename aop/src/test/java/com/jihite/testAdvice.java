package com.jihite;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.testng.annotations.Test;

public class testAdvice {
    @Test
    public void testBeforeAdvide() {
        String cofigPath = "com.jihite/beans.xml";
        ApplicationContext ctx = new ClassPathXmlApplicationContext(cofigPath);
        Waiter waiter = (Waiter)ctx.getBean("waiterBefore");
        waiter.greetTo("John");
        waiter.serveTo("Tom");
    }

    @Test
    public void testBeforeAfterAdvide() {
        String cofigPath = "com.jihite/beans.xml";
        ApplicationContext ctx = new ClassPathXmlApplicationContext(cofigPath);
        Waiter waiter = (Waiter)ctx.getBean("waiter");
        waiter.greetTo("John");
        waiter.serveTo("Tom");
    }

    @Test
    public void testAroundAdvide() {
        String cofigPath = "com.jihite/beans.xml";
        ApplicationContext ctx = new ClassPathXmlApplicationContext(cofigPath);
        Waiter waiter = (Waiter)ctx.getBean("waiterAround");
        waiter.greetTo("John");
        waiter.serveTo("Tom");
    }

    @Test
    public void testThrowsAdvide() {
        String cofigPath = "com.jihite/beans.xml";
        ApplicationContext ctx = new ClassPathXmlApplicationContext(cofigPath);
        ViewSpaceService waiter = (ViewSpaceService )ctx.getBean("viewspaceService");
        waiter.deleteViewService(100);
    }
}
