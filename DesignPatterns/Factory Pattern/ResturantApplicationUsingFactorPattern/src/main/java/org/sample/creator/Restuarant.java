package org.sample.creator;

import org.sample.product.Burger;

public abstract class Restuarant {
    public abstract Burger createBurger();

    public Burger orderBurger(){
        Burger burger  = createBurger();
        burger.prepare();
        return burger;
    }
}
