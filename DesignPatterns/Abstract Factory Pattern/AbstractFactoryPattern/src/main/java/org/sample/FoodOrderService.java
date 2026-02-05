package org.sample;

import org.sample.creator.Restuarant;
import org.sample.product1.Burger;
import org.sample.product2.Pizza;

public class FoodOrderService {
    private final Burger b ;
    private final Pizza p ;
    public FoodOrderService(Restuarant res) {
        b = res.createBurger();
        p = res.createPizza();
    }
    public void prepareOrder(){
        b.prepare();
        p.prepare();
    }
}
