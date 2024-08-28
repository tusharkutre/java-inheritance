package com.Xworks.package1;

public class SmartPhone {

    public String BrandName;
    public String name;
    public double cost;
    public String colour;
    public String OS;

    //default constructor
    public SmartPhone()
    {
        System.out.println("IM a parent constructor");
        System.out.println("chaining message here");
    }

    //instance method(non-static)
    public void Parent(){
        System.out.println("Parent class");
    }
}
