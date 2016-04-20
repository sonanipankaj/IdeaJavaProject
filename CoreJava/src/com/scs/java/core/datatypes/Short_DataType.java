package com.scs.java.core.datatypes;

/**
 * Created by pankajs on 4/20/2016.
 */

/*Short

        Short data type is a 16-bit signed two's complement integer
        Minimum value is : -32,768 (-2^15)
        Maximum value is : 32,767(inclusive) (2^15 -1)
        Default value is : 0
        Short data type can also be used to save memory as byte data type. A short is 2 times smaller than an int*/

public class Short_DataType {

    short a = 1000;
    short b = -1500;

    void add(){
        short c = (short) (a + b);
        System.out.println("This short ADD value is " + c);
    }

}
