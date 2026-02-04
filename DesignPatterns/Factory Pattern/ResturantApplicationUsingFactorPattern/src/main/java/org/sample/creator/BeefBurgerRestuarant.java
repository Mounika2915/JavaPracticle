package org.sample.creator;

import org.sample.product.BeefBurger;
import org.sample.product.Burger;

public class BeefBurgerRestuarant extends Restuarant {
    @Override
    public Burger createBurger() {
       return new BeefBurger();
    }
}
