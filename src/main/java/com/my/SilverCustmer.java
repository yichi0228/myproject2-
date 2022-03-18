package com.my;

public class SilverCustmer extends Customer{
    public SilverCustmer(String name,int cost){
        super(name,cost);
    }
    public void print(){
        System.out.println(name+"\t"+cust+"\t"+(cust-offmoney())+"("+offmoney()+")");
    }
}
