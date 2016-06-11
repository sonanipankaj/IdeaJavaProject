package edu.devry.week6;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class JavaPizza extends JFrame implements ActionListener {
    private JLabel lblWelcome, lblName, lblPhone, lblSize, lblTopings, lblTotaldue, lblTotal;
    private JTextField txtName, txtPhone, txtTotal;
    private JPanel p1, p2, p3, p4;
    private JTabbedPane jtp;
    private JRadioButton rbSmall, rbMedium, rbLarge;
    private JCheckBox cbPepperoni, cbSausage, cbMushroom, cbOnion;
    private JButton btnOrderSum;

    public JavaPizza() {
        super("Java Pizza");
        setLayout(new FlowLayout());
        JTabbedPane jtp = new JTabbedPane();

        JLabel lblWelcome = new JLabel("Welcome to Java Pizza", SwingConstants.CENTER);
        JLabel lblName = new JLabel("Name:", SwingConstants.CENTER);
        JLabel lblPhone = new JLabel("Phone Number:", SwingConstants.CENTER);
        JTextField txtName = new JTextField(15);
        JTextField txtPhone = new JTextField(15);
        JPanel p1 = new JPanel();
        //setLayout(new FlowLayout());
        p1.add(lblWelcome);
        p1.add(lblName);
        p1.add(txtName);
        p1.add(lblPhone);
        p1.add(txtPhone);
        jtp.addTab("Customer", null, p1, "First Panel");

        JLabel lblsize = new JLabel("What size of pizza?", SwingConstants.CENTER);
        JRadioButton rbSmall = new JRadioButton("Small");
        JRadioButton rbMedium = new JRadioButton("Medium");
        JRadioButton rbLarge = new JRadioButton("Large");
        JPanel p2 = new JPanel();
        p2.add(lblsize);
        p2.add(rbSmall);
        p2.add(rbMedium);
        p2.add(rbLarge);

        jtp.addTab("Size", null, p2, "Second Panel");


        JLabel lblToppings = new JLabel("What Toppings would you like?", SwingConstants.CENTER);
        JCheckBox cbPepperoni = new JCheckBox("Pepperoni");
        JCheckBox cbSausage = new JCheckBox("Sausage");
        JCheckBox cbMushroom = new JCheckBox("Mushroom");
        JCheckBox cbOnion = new JCheckBox("Onion");

        JPanel p3 = new JPanel();
        p3.add(lblToppings);
        p3.add(cbPepperoni);
        p3.add(cbSausage);
        p3.add(cbMushroom);
        p3.add(cbOnion);

        jtp.addTab("Toppings", null, p3, "Third Panel");

        JLabel lblTotaldue = new JLabel("Total Due", SwingConstants.CENTER);
        JLabel lblTotal = new JLabel("Total:", SwingConstants.CENTER);
        JTextField txtTotal = new JTextField(15);
        JButton btnOrderSum = new JButton("Order Summary");
        JPanel p4 = new JPanel();
        p4.add(lblTotaldue);
        p4.add(lblTotal);
        p4.add(txtTotal);
        p4.add(btnOrderSum);
        jtp.addTab("Total", null, p4, "Fourth Panel");

        btnOrderSum.addActionListener(this);

        add(jtp);

    }



    private String name ="";
    private String phone;

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }


public void display(){
    System.out.println("Name: " +getName());
    System.out.println("Cell : " + getPhone());
}


    @Override
    public void actionPerformed(ActionEvent e) {


        Object source = e.getSource();

        System.out.println(source);

        setName(txtName.getText());
        setPhone(txtPhone.getText());

    }
}


