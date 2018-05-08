package com.jihite;
import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class GreetingInterceptorAdvice implements MethodInterceptor {
    @Override
    public Object invoke(MethodInvocation invocation) throws Throwable {
        Object[] args = invocation.getArguments();
        String clientName = (String)args[0];
        System.out.println("method invocation before..." + clientName);
        Object object = invocation.proceed();
        System.out.println("method invocation after..." + clientName);
        return object;
    }
}
