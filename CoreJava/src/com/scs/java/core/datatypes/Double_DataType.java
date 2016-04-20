package com.scs.java.core.datatypes;

/**
 * Created by pankajs on 4/20/2016.
 */

        /*double data type is a double-precision 64-bit IEEE 754 floating point
        Default value is : 0.0d
        Double data type should never be used for precise values such as currency
        This data type is generally used as the default data type for decimal values. generally the default choice*/

public class Double_DataType {
    double a = 123.456;
    double b = -45.894;

    void add(){
        double c = a + b;
        System.out.println("This Double ADD value is " + c);
    }


}
