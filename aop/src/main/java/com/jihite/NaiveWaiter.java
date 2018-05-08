package com.jihite;

public class NaiveWaiter implements Waiter{
    @Override
    public void greetTo(String name) {
        System.out.println("Greet to " + name);
    }

    @Override
    public void serveTo(String name) {
        System.out.println("Serve to " + name);
    }
}
