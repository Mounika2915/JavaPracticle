package org.sample.creator;

import org.sample.product1.Burger;
import org.sample.product2.Pizza;

public interface Restuarant {
    Burger createBurger();
    Pizza createPizza();
}
