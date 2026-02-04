package org.sample;

public abstract class PaymentGateway {
    public Payment payingPayment(){
        Payment p = createPayment();
        p.pay();
        return p ;
    }
    public abstract Payment createPayment();
}
