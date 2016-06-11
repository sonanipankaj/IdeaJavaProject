package com.scs.java.core.datatypes;

/**
 * Created by pankajs on 4/20/2016.
 */
public class Byte_DataType {

    /*
    * Byte_DataType

    * Byte_DataType data type is a 8-bit signed two's complement integer
    * Minimum value is : -128 (-2^7)
    * Maximum value is : 127 (inclusive)(2^7 -1)
    * Default value is : 0
    * Byte_DataType data type is used to save space in large arrays, mainly in place of integers, since a byte is four times smaller than an int
    * */

    byte a = 50;
    byte b = (byte) - 80;

    void add(){
        byte c = (byte) (a + b);
        System.out.println("The Byte ADD value is : " + c);
    }


}
