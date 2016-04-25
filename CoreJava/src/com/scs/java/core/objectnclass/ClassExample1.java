package com.scs.java.core.objectnclass;

/**
 * Created by pankajs on 4/22/2016.
 */
public class ClassExample1 {
    int a;
    float b;
    String str;

    public ClassExample1()
    {
        a = 10;
        b = (float) 15.26;
        str = "Java";
    }

    public void display()
    {
        System.out.println("The Integer Value is : "+a);
        System.out.println("The Float Value is : "+b);
        System.out.println("The String Value is : "+str);
    }
}

class mainClass {

    public static void main (String args[])
    {
        ClassExample1 obj = new ClassExample1();

        obj.display();
    }
}
