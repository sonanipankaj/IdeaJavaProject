package edu.devry.week6;

import java.awt.*;
import javax.swing.*;

public class pricePanel extends JPanel {
     private static JLabel l1, l2;
     private static double price;
     private static String order;
     
     public pricePanel () {          //total and order are passed in
          setPreferredSize(new Dimension (300, 200));
          setBackground (Color.green);
          setLayout(new FlowLayout());
          
          l1 = new JLabel ("Please pay the amount: ");     
          l2 = new JLabel (order + ": \t $" + price);
          add(l1);add(l2);
     }
     public void passData (double d, String s) {
          price = d;
          order = s;
     }
     public void clearData(){
          l2.setText("");
     }
     
}