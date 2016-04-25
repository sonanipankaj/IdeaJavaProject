package com.scs.java.core.objectnclass;

/**
 * Created by pankajs on 4/25/2016.
 */
public class ObjectExample2 {
    int a = 99;
    float b = (float)99.99;
    String str = "Java";

}

class MainClassObj2{
    public static void main(String[] args) {
        ObjectExample2 obj = new ObjectExample2();

        System.out.println("The Integer value is : " + obj.a);
        System.out.println("The Float value is : " + obj.b);
        System.out.println("The String value is : " + obj.str);
    }
}
