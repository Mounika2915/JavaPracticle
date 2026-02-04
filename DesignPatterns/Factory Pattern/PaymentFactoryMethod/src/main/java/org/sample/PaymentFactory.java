package org.sample;

public class PaymentFactory {
    public Payment createPayment(String type){
        if(type.equalsIgnoreCase("NetBanking")){
            return new NetBanking();
        }else if(type.equalsIgnoreCase("CreditCard")){
            return new CreditCard();
        }
        throw new IllegalArgumentException("Not Accepting");
    }
}
