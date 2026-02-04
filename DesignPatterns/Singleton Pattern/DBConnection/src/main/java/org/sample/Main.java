package org.sample;

public class Main {
    static void main() {
        Singletone s1 = Singletone.getInstance("Mounika" , "Mouni123");
        Singletone s2 = Singletone.getInstance("Karthik" , "Mouni123");

        System.out.println("s1 hashCode " + s1.hashCode());
        System.out.println("s2 hashCode " + s2.hashCode());

        System.out.println("Same Object ? " + (s1.hashCode() == s2.hashCode()));

    }
}
