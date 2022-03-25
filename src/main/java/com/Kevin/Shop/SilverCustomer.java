package com.Kevin.Shop;

public class SilverCustomer extends Customer {
    public SilverCustomer (String name, int consumption) {
        super(name, consumption);
    }
    public SilverCustomer () {

    }

    @Override
    public void discount() {
        discount = (consumption/1000)*100;
        System.out.println(name + "\t" + consumption + "\t" + "discount:" + discount +"("+backmoney()+ ")"+ "\t" + "level" + "\t" + "**");
    }
}
