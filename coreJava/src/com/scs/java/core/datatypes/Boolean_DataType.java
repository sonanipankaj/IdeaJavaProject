package com.scs.java.core.datatypes;

/**
 * Created by pankajs on 4/20/2016.
 */

        /*boolean data type represents one bit of information
        There are only two possible values : true and false
        This data type is used for simple flags that track true/false conditions
        Default value is : false*/

public class Boolean_DataType {

    boolean a = true;

    void check(){
        if (a == true){
            a = false;
            System.out.println("This Boolean value is " + a);
        }
    }
}
