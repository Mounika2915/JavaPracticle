package org.sample.product1;

public class BeefBurger implements  Burger{
    @Override
    public void prepare() {
        System.out.println("BeefBurger prepared");
    }
}
