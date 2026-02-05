package org.sample;

public class Main {
    public static void main(String[] args) {
        Payment creditCard = new CreditCardPayment();
        creditCard.pay();
        Refundable refund = new CreditCardPayment();
        refund.refund();
        //cash onDelivery doesn't support refund .
        //in general payment interfaces have 2 methods pay and refund
        //but implementing class cash onDelivery does not have refund option
        // that means cash onDelivery doesn't support payment that's why we separate
        Payment cashOnDelivery = new CashOnDelivery();
        cashOnDelivery.pay();
    }
}
