package org.sample;


import org.sample.creator.NonVegRestuarant;
import org.sample.creator.Restuarant;

public class Main {
    static void main() {
        Restuarant res = new NonVegRestuarant();
        new FoodOrderService(res).prepareOrder();

    }
}
