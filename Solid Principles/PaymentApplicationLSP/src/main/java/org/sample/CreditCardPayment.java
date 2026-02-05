package org.sample;

import java.sql.Ref;

public class CreditCardPayment implements Payment , Refundable {
    @Override
    public void pay() {
        System.out.println("Paid using CreditCard");
    }

    @Override
    public void refund() {
        System.out.println("Refund to CreditCard");
    }
}
