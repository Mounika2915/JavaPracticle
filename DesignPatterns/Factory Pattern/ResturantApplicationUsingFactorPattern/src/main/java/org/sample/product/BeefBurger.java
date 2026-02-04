package org.sample.product;

public class BeefBurger implements Burger{
    @Override
    public void prepare() {
        System.out.println("preparing Beef Burger");
    }
}
