package edu.devry.week6;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class PizzaGui extends JPanel{

    private JLabel  resultLabel;


    private JButton button0, button1, button2, button3, button4, button5, button6, button7, button8, button9, buttonclear;

    public  PizzaGui()
    {
        // grid layout
        setLayout (new GridLayout (5, 3));

        // creates buttons  and label
        resultLabel = new JLabel (" ");
        button0 = new JButton ("Small: 10.00");
        button1 = new JButton ("Medium: 14.00");
        button2 = new JButton ("Large: 16.00");
        button3 = new JButton ("Soda: 2.00");
        button4 = new JButton ("Water: 1.50");
        button5 = new JButton ("Extra Cheese: 1.50");
        button6 = new JButton ("Pepperoni: 1.50");
        button7 = new JButton ("Mushroom: 1.50");
        button8 = new JButton ("Sausage: 1.50");
        button9 = new JButton ("Pepper Onion: 1.50");
        buttonclear = new JButton ("Total");

        //listeners for each button
        button0.addActionListener (new ButtonListener0());
        button1.addActionListener (new ButtonListener1());
        button2.addActionListener (new ButtonListener2());
        button3.addActionListener (new ButtonListener3());
        button4.addActionListener (new ButtonListener4());
        button5.addActionListener (new ButtonListener5());
        button6.addActionListener (new ButtonListener6());
        button7.addActionListener (new ButtonListener7());
        button8.addActionListener (new ButtonListener8());
        button9.addActionListener (new ButtonListener9());
        buttonclear.addActionListener(new ButtonListenerT());

        //adds all buttons and label
        add (resultLabel);
        add (button0);
        add (button1);
        add (button2);
        add (button3);
        add (button4);
        add (button5);
        add (button6);
        add (button7);
        add (button8);
        add (button9);
        add (buttonclear);


        setPreferredSize (new Dimension(720,360));
        setBackground (Color.white);
    }

    //code below is one listener per button
    private class ButtonListener0 implements ActionListener
    {
        public void actionPerformed (ActionEvent event)
        {


            resultLabel.setText(resultLabel.getText() + "10.00");
        }
    }


    private class ButtonListener1 implements ActionListener
    {
        public void actionPerformed (ActionEvent event)
        {



            resultLabel.setText(resultLabel.getText() + "14.00");
        }
    }

    private class ButtonListener2 implements ActionListener
    {
        public void actionPerformed (ActionEvent event)
        {


            resultLabel.setText(resultLabel.getText() + "16.00");
        }
    }


    private class ButtonListener3 implements ActionListener
    {
        public void actionPerformed (ActionEvent event)
        {


            resultLabel.setText(resultLabel.getText() + "2.00");
        }
    }

    private class ButtonListener4 implements ActionListener
    {
        public void actionPerformed (ActionEvent event)
        {


            resultLabel.setText(resultLabel.getText() + "1.50");
        }
    }

    private class ButtonListener5 implements ActionListener
    {
        public void actionPerformed (ActionEvent event)
        {


            resultLabel.setText(resultLabel.getText() + "1.50");
        }
    }

    private class ButtonListener6 implements ActionListener
    {
        public void actionPerformed (ActionEvent event)
        {


            resultLabel.setText(resultLabel.getText() + "1.50");
        }
    }

    private class ButtonListener7 implements ActionListener
    {
        public void actionPerformed (ActionEvent event)
        {


            resultLabel.setText(resultLabel.getText() + "1.50");
        }
    }

    private class ButtonListener8 implements ActionListener
    {
        public void actionPerformed (ActionEvent event)
        {


            resultLabel.setText(resultLabel.getText() + "1.50");
        }
    }

    private class ButtonListener9 implements ActionListener
    {
        public void actionPerformed (ActionEvent event)
        {


            resultLabel.setText(resultLabel.getText() + "1.50");
        }
    }

    private class ButtonListenerT implements ActionListener
    {
        public void actionPerformed (ActionEvent event)
        {
            double total;
            total = Double.parseDouble(resultLabel.getText());
            resultLabel.setText ("Total plus tax: " + (total *1.07));
        }
    }



}
