package org.sample.creator;

import org.sample.product.Burger;
import org.sample.product.VeggieBurger;

public class VeggieBurgerRestuarant extends Restuarant{
    @Override
    public Burger createBurger() {
        return new VeggieBurger();
    }
}
