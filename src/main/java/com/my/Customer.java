package com.my;

public class Customer {
    String name;
    int cust;
    float off=0.1f;
    public Customer(String name){this.name=name;}
    public Customer(String name,int cust){
        this(name);
        this.cust=cust;
    }
    public float offmoney(){
        return (cust/1000)*off*1000;
    }
    public void print(){
        float offmoney=(cust/1000*off*1000);
        System.out.println(name+"\t"+cust+"\t"+(cust-offmoney));

        }

    }

