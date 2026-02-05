package org.sample.creator;

import org.sample.product1.Burger;
import org.sample.product1.VegBurger;
import org.sample.product2.Pizza;
import org.sample.product2.VegPizza;

public class VegRestuarant implements Restuarant{
    @Override
    public Burger createBurger() {
        return  new VegBurger();
    }

    @Override
    public Pizza createPizza() {
        return new VegPizza();
    }
}
