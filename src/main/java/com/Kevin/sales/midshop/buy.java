package com.Kevin.sales.midshop;

import java.util.ArrayList;

public class buy {
    public static void main(String[] args) {
        ArrayList<Customer> customers = new ArrayList<>();
        customers.add(new Customer("nishida", 1500));
        customers.add(new SilverCustomer("codysanderson", 3540));
        customers.add(new GoldCustomer("Ishikawa", 2000));
        for (int i = 0; i < 3; i++) {
            customers.get(i).print();
        }
        for (Customer c : customers) {
            c.print();
        }
    }
}
