package org.sample;

public class NetBankingPayment implements Payment{
    @Override
    public void pay() {
        System.out.println("Paid using NetBanking");
    }
}
