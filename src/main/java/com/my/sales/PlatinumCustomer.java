package com.my.sales;

public class PlatinumCustomer extends Customer{
    public PlatinumCustomer(String name,int cost){super(name,cost);}
    public void print(){System.out.println(name+"\t"+cust+"\t"+(cust-backmoney())+"("+backmoney()+")");}
    float off=0.1f;
    public  float backmoney(){return 3*((cust/1000)*off*1000);}

    }


