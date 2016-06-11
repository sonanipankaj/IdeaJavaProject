package com.scs.java.core.datatypes;

/**
 * Created by pankajs on 4/20/2016.
 */

        /*char data type is a single 16-bit Unicode character
        Minimum value is : '\u0000' (or 0)
        Maximum value is : '\uffff' (or 65,535 inclusive)
        Char data type is used to store any character*/

public class Char_DataType {
    char a = 'J';
    char b = 'A';
    char c = 'V';
    char d = 'A';

    void join(){
        System.out.println("The Characters Value is " + a+b+c+d);
    }

}
