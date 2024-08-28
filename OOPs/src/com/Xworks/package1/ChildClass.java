package com.Xworks.package1;

public class ChildClass extends SmartPhone{

    //default constructor of child
   public ChildClass(){
       super();//explicitly defined , calling the parent class constrcutor,methods and vars as well
       System.out.println("this is child constructor");
    }

    //instance method(non-static)
    public void Child(){
        System.out.println("child class");
    }
}
