package edu.devry.week6;

import java.awt.Container;
import javax.swing.*;
import java.awt.*;

public class Restaurant {  
     private pizzaPanel pPanel;
     private pricePanel rPanel;
     private static JTabbedPane tp;
     public double price; 
     public String order; 
     
     public Restaurant () {
          pPanel = new pizzaPanel(this);
          rPanel = new pricePanel();
          
          tp = new JTabbedPane();

          tp.addTab("Order", pPanel);
          tp.addTab("Payment", rPanel);
     }
     
     public void notifyPizzaReady () {
          price = pPanel.getPrice();
          order = pPanel.getOrder();
          rPanel.passData(price, order);
     }
     
     private static void createAndShowGUI() {
          JFrame frame = new JFrame("168 Restaurant");
          frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
          frame.setLocationRelativeTo(null);
          
          frame.getContentPane().add(tp);
          frame.pack();
          frame.setVisible(true);
     }
     
     public static void main(String[] args) {
          SwingUtilities.invokeLater(new Runnable(){
               public void run(){
                    createAndShowGUI();
               }
                      });
     }
}