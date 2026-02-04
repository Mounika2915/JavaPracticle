package org.sample;

public class NetBankingGateway extends PaymentGateway {
    @Override
    public Payment createPayment() {
        return new NetBanking();
    }
}
