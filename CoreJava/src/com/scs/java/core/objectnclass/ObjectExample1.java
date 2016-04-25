package com.scs.java.core.objectnclass;

/**
 * Created by pankajs on 4/22/2016.
 */
public class ObjectExample1 {
    int a = 10;
    int b = 20;
    int c;

    public ObjectExample1() {
        c = a + b;
        System.out.println("The Addition is : " + c);

    }
}

class MainClass1 {
    public static void main(String[] args) {
        ObjectExample1 obj = new ObjectExample1();
    }
}
