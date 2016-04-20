package com.scs.java.core.datatypes;

/**
 * Created by pankajs on 4/20/2016.
 */
public class DataTypeTestClass {

    public static void main(String[] args) {


        Byte_DataType byteObj = new Byte_DataType();
        byteObj.add();

        Short_DataType shortObj = new Short_DataType();
        shortObj.add();

        Int_DataType intObj = new Int_DataType();
        intObj.add();

        Long_DataType longObj = new Long_DataType();
        longObj.add();

        Float_DataType floatObj = new Float_DataType();
        floatObj.add();

        Double_DataType doubleObj = new Double_DataType();
        doubleObj.add();

        Boolean_DataType booleanObj = new Boolean_DataType();
        booleanObj.check();

        Char_DataType charObj = new Char_DataType();
        charObj.join();

    }
}
