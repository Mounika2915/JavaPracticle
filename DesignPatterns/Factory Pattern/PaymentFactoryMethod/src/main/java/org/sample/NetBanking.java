package org.sample;

public class NetBanking implements Payment{

    @Override
    public void pay() {
        System.out.println("Paying in NetBanking");
    }
}
