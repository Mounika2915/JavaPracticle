package org.sample.product2;

public class BeefPizza implements Pizza{
    @Override
    public void prepare() {
        System.out.println("Beef pizza prepared");
    }
}
