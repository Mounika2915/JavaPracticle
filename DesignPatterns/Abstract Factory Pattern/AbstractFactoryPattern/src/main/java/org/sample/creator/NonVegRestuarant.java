package org.sample.creator;

import org.sample.product1.BeefBurger;
import org.sample.product1.Burger;
import org.sample.product2.BeefPizza;
import org.sample.product2.Pizza;

public class NonVegRestuarant implements Restuarant{
    @Override
    public Burger createBurger() {
        return new BeefBurger() ;
    }

    @Override
    public Pizza createPizza() {
        return new BeefPizza();
    }
}
