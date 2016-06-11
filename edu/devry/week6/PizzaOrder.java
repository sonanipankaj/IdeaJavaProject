package edu.devry.week6;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
public class PizzaOrder
{

    private JPanel phone;

    public static void main (String[] args)
    {

    JFrame frame = new JFrame ("Pizza Order");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    JPanel phone = new JPanel();
    phone.setBorder (BorderFactory.createRaisedBevelBorder());

    JTabbedPane tp = new JTabbedPane();
    tp.addTab ("Pizza Order", new PizzaGUI());

    frame.getContentPane().add(phone);
    frame.getContentPane().add(tp);
    frame.pack();
    frame.pack();frame.setVisible(true);

    }
}
