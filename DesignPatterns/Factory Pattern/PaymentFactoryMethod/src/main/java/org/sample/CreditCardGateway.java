package org.sample;

public class CreditCardGateway extends PaymentGateway{
    @Override
    public Payment createPayment() {
        return new CreditCard();
    }
}
