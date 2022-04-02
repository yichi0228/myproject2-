package com.my.sales;

public class DiscountCustomer extends Customer{
    public DiscountCustomer(String name,int cust){
        super(name,cust);
    }
    public float backMoney(){
        return  cust*off;
    }
}
