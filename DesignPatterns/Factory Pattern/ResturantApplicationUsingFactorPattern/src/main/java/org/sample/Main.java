package org.sample;


import org.sample.creator.BeefBurgerRestuarant;
import org.sample.creator.Restuarant;
import org.sample.creator.VeggieBurgerRestuarant;

public class Main {
    static void main() {
        Restuarant burger = new VeggieBurgerRestuarant();
        burger.orderBurger();
    }
}
