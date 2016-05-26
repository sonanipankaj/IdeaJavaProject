package com.scs.java.core.datatypes;

/**
 * Created by pankajs on 4/20/2016.
 */

/*      Float data type is a single-precision 32-bit IEEE 754 floating point
        Default value is : 0.0f
        Float data type is never used for precise values such as currency
        Float is mainly used to save memory in large arrays of floating point numbers*/

public class Float_DataType {
    float  a = (float) 10.56f;
    float b = (float) -23.57f;

    void add(){
        float c = a + b;
        System.out.println("This Float ADD value is " + c);
    }
}
