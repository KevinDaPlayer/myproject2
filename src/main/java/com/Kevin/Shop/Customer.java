package com.Kevin.Shop;

public class Customer {
    String name;
    int consumption;
    int discount;
    public Customer (String name, int consumption) {
        this.name = name;
        this.consumption = consumption;
    }
    public Customer () {

    }
    public float backmoney () {
        return (consumption/1000)*100;
    }
    public void discount () {
        discount = (consumption/1000)*100;
        System.out.println(name + "\t" + consumption + "\t" + "discount:" + discount + "\t" + "level" + "\t" + "*");
    }
}