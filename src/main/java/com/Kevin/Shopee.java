package com.Kevin;

public class Shopee {
    public static void main(String[] args) {
        Customer olvia = new Customer("Olivia", 2000);
        SilverCustomer kevin = new SilverCustomer("Kevin", 3000);
        GoldenCustomer ishikawa = new GoldenCustomer("Ishikawa", 4500);
        olvia.discount();
        kevin.discount();
        ishikawa.discount();
    }
}
