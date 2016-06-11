package edu.devry.week6;

import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class pizzaPanel extends JPanel implements ActionListener {
     public double total = 0;
     public String order = " ";
     private JPanel titlePanel; 
     private JPanel gridPanel; 
     private Restaurant rest;
     
     private JRadioButton cb1, cb2;
     private JButton submit;
     
     
     public pizzaPanel (Restaurant rest) {
          this.rest = rest;
          
          titlePanel.setPreferredSize(new Dimension(100, 30));
          titlePanel.setLayout(new FlowLayout());
          JLabel label = new JLabel("Please order your food");
          titlePanel.add(label);
          
          gridPanel.setLayout (new GridLayout(1, 4)); 
          
          JLabel b1 = new JLabel("Premium Goats' Cheese $5.00");
          cb1 = new JRadioButton ("1");cb2 = new JRadioButton ("2");
          
          submit = new JButton("Submit");
          submit.setPreferredSize(new Dimension(50, 20));
          //ButtonListener listener = new ButtonListener();
          submit.addActionListener(this);
          
          ButtonGroup bg1 = new ButtonGroup ();
          bg1.add(cb1);bg1.add(cb2);
          
          gridPanel.add(b1);gridPanel.add(cb1);gridPanel.add(cb2);
     
          setPreferredSize(new Dimension (200, 200));
          setLayout(new BorderLayout());
          add(titlePanel, BorderLayout.NORTH);
          add(gridPanel, BorderLayout.CENTER);
          add(submit, BorderLayout.SOUTH);
     }
     
      public void actionPerformed(ActionEvent e) { 
           if (cb1.isSelected()) {                                   
          total += 5;                       
          order += "Goats' Cheese" + " \n";   
           }
         else if (cb2.isSelected()) {
          total += 10;                              
          order += "Goats' Cheese" + " \n";
         }
          
        if (e.getSource() == submit) {
          JOptionPane.showMessageDialog (null, order  + "\t = $" + total + "\n Please click Payment tab");
          rest.price = total;
          rest.order = order;
               
          sbumitButtonAction(e);
        }
      }
      
      private void sbumitButtonAction (ActionEvent ae) {
           rest.notifyPizzaReady();
      }
      public double getPrice() {
           return total;
      }
      public String getOrder() {
           return order;
      }
     }
