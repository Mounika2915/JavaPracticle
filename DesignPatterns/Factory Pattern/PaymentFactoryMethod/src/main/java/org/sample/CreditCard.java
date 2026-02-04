package org.sample;

public class CreditCard implements Payment{
    @Override
    public void pay() {
        System.out.println("Paying using Credit card");
    }
}
