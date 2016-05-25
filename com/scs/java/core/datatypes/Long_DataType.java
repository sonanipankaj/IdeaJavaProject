package com.scs.java.core.datatypes;

/**
 * Created by pankajs on 4/20/2016.
 */

/*      Long data type is a 64-bit signed two's complement integer
        Minimum value is : -9,223,372,036,854,775,808.(-2^63)
        Maximum value is : 9,223,372,036,854,775,807 (inclusive). (2^63 -1)
        Default value is : 0L
        This type is used when a wider range than int is needed*/

public class Long_DataType {
    long a = 1000L;
    long b = -2000L;

    void add(){
        long c = a + b;
        System.out.println("The Long ADD value is " + c);
    }
}
