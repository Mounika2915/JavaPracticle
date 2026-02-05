package org.sample;

public class CashOnDelivery implements Payment{
    @Override
    public void pay() {
        System.out.println("Paid using cashOnDelivery");
    }
}
