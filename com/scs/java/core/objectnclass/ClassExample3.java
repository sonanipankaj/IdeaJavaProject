package com.scs.java.core.objectnclass;

/**
 * Created by pankajs on 4/22/2016.
 */
public class ClassExample3 {

    int a, b, c;

    ClassExample3() {

        a = 10;
        b = 20;
    }

    class InnerClass {

        InnerClass() {

            c = a +b;
        }

        void display() {

            System.out.println("The Addition is : " + c);
        }
    }

    void display() {

        System.out.println("'A' is : " + a);
        System.out.println("'B' is : " + b);
    }
}

class MainClass3 {

    public static void main(String args[]) {

        ClassExample3 obj1 = new ClassExample3();
        ClassExample3.InnerClass obj2 = obj1.new InnerClass();

        obj1.display();
        obj2.display();
    }
}



