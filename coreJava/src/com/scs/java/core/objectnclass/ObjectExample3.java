package com.scs.java.core.objectnclass;

/**
 * Created by pankajs on 4/25/2016.
 */
public class ObjectExample3 {
    int a;
    float b;
    String str;

    public ObjectExample3(){
        a = 99;
        b = (float)99.99;
        str = "Java is Cool";
    }
    public void Method3(){
        System.out.println("The Integer value is : " + a);
        System.out.println("The Float value is : " + b);
        System.out.println("The String value is : " + str);
    }
}

class MainClassObj3{
    public static void main(String[] args) {
        ObjectExample3 obj = new ObjectExample3();
        obj.Method3();
    }
}