package com.my.sales;

import com.my.sales.Customer;
import com.my.sales.SilverCustmer;

public class Rules {
    public static void main(String[] args) {
        Customer c1=new Customer("0001",1200);
        Customer c2=new Customer("0002",800);
        SilverCustmer c3=new SilverCustmer("0003",2000);
        c1.print();
        c2.print();
        c3.print();
    }
}
