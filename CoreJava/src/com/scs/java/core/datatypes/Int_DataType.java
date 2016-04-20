package com.scs.java.core.datatypes;

/**
 * Created by pankajs on 4/20/2016.
 */

/*Int data type is a 32-bit signed two's complement integer
        Minimum value is : -2,147,483,648.(-2^31)
        Maximum value is : 2,147,483,647(inclusive).(2^31 -1)
        Default value is : 0
        Int is generally used as the default data type for integral values unless there is a concern about memory*/

public class Int_DataType {
    int a = 15000;
    int b = -20000;

    void add(){
        int c = a + b;
        System.out.println("This Int ADD value is " + c);
    }
}
