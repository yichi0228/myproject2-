package com.my.sales;

public class GoldenCustomer extends SilverCustmer {
    public GoldenCustomer(String name,int amount){
        super(name,amount);
        off=0.2f;
    }
}
