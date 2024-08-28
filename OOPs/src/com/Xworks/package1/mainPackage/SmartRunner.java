package com.Xworks.package1.mainPackage;

import com.Xworks.package1.ChildClass;
import com.Xworks.package1.SmartPhone;

public class SmartRunner {

    public static void main(String[] args) {

        //obj1 for child class inherited by its parent
        ChildClass cl1 = new ChildClass();

        System.out.println("---created instance of subclass using same class type----");

        cl1.BrandName = "samsung";
        cl1.name = "Samsung galaxy S24 ultra";
        cl1.colour = "white";
        cl1.cost = 124000;
        cl1.OS = "Android";

        System.out.println(cl1.BrandName);
        System.out.println(cl1.name);
        System.out.println(cl1.colour);
        System.out.println(cl1.cost);
        System.out.println(cl1.OS);

        cl1.Child();

        System.out.println("-----------------------");

        SmartPhone smart = new ChildClass();
        System.out.println("---created instance of subclass using parent class type----");
        smart.BrandName = "RealMe";
        smart.name = "Realme 13 pro";
        smart.colour = "Gosling gradient";
        smart.cost = 24000;
        smart.OS = "Android";

        System.out.println(smart.BrandName);
        System.out.println(smart.name);
        System.out.println(smart.colour);
        System.out.println(smart.cost);
        System.out.println(smart.OS);

    }

}
