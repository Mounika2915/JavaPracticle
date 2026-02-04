package org.sample;

public class Main {
    static void main() {
//        PaymentFactory pf = new PaymentFactory();
//        pf.createPayment("CreditCard").pay();

        PaymentGateway pg = new CreditCardGateway() ;
        pg.payingPayment();
    }
}
