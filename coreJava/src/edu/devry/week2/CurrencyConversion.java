package edu.devry.week2;

import javax.swing.*;

/**
 * Created by PankuMac on 5/15/16.
 */
public class CurrencyConversion {

    public static void main(String[] args) {

        int x = 0;
        double result = 0.0;
        String YEN = "YEN", EURO = "EURO", USD = "USD";

        String exchangeCurrency = JOptionPane.showInputDialog("Enter Currency Code such as  " + YEN + ", " + EURO + ", " + USD);
        x = Integer.parseInt(JOptionPane.showInputDialog("Enter the Amount: "));


        String  currency = JOptionPane.showInputDialog("Which currency do you wish to exchange: such as " + YEN + ", " + EURO + ", " + USD);

        if (exchangeCurrency.equalsIgnoreCase("YEN")) {

            if(currency.equalsIgnoreCase("USD")){
                result = x * 0.0081;
                JOptionPane.showMessageDialog(null, "The Amount of " + x + " YEN =  " + USD + " is: " + result);
            }else if(currency.equalsIgnoreCase("EURO")){
                result = x * 0.0073;
                JOptionPane.showMessageDialog(null, "The Amount of " + x + " YEN =  " + EURO + " is: " + result);
            }

        }
        if (exchangeCurrency.equalsIgnoreCase("EURO")) {

            if(currency.equalsIgnoreCase("USD")){
                result = x * 1.11;
                JOptionPane.showMessageDialog(null, "The Amount of " + x + " EURO =  " + USD + " is: " + result);
            }else if(currency.equalsIgnoreCase("YEN")){
                result = x * 136.08;
                JOptionPane.showMessageDialog(null, "The Amount of " + x + " EURO = " + YEN + " is: " + result);
            }

        }

        if (exchangeCurrency.equalsIgnoreCase("USD")) {

            if(currency.equalsIgnoreCase("EURO")){
                result = x * 0.90;
                JOptionPane.showMessageDialog(null, "The Amount of " + x + " USD =  " + EURO + " is: " + result);
            }else if(currency.equalsIgnoreCase("YEN")){
                result = x * 123.14;
                JOptionPane.showMessageDialog(null, "The Amount of " + x + " USD = " + YEN + " is: " + result);
            }

        }

    }
}
