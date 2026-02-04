package org.sample;


public class Main {
    static void main() {
        Box b = new Box();
        b.value = 10 ;
        System.out.println(b.value);
        change(b);
        System.out.println(b.value) ;
    }
    static void change(Box b){
        b.value = 30 ;
    }
}
