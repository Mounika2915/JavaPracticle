package org.sample.product1;

public class VegBurger implements Burger{
    @Override
    public void prepare() {
        System.out.println("VegBurger prepared");
    }
}
