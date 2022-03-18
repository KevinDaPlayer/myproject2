package com.Kevin;

public class SilverCustomer extends Customer{
    public SilverCustomer (String name, int consumption) {
        super(name, consumption);
    }

    @Override
    public void discount() {
        int backmoney = (consumption/1000)*100;
        discount = (consumption/1000)*100;
        System.out.println(name + "\t" + consumption + "\t" + "discount:" + discount +"("+backmoney+ ")"+ "\t" + "level" + "\t" + "**");
    }
}
