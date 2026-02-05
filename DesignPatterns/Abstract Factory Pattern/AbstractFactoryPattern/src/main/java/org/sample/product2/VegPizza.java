package org.sample.product2;

public class VegPizza implements Pizza{
    @Override
    public void prepare() {
        System.out.println("Veg pizza prepared");
    }
}
