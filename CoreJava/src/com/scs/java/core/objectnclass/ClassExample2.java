package com.scs.java.core.objectnclass;

/**
 * Created by pankajs on 4/22/2016.
 */
public class ClassExample2 {

    void display1() {

        System.out.println("This is Class - 1");
    }
}

class Class2 {

    void display2() {

        System.out.println("This is Class - 2");
    }
}

class Class3 {

    void display3() {

        System.out.println("This is Class - 3");
    }
}

class MainClass {

    public static void main(String[] args) {

        ClassExample2 obj1 = new ClassExample2();
        Class2 obj2 = new Class2();
        Class3 obj3 = new Class3();

        obj1.display1();
        obj2.display2();
        obj3.display3();
    }


}
