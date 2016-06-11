package edu.devry.week6;

import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class JavaPizza extends JFrame implements ActionListener{
	
	private static final int smallPizza=8, mediumPizza=10, largePizza=12;
	
	private JLabel lblWelcome,lblName,lblPhone,lblSize,lblTopings,lblTotaldue,lblTotal;
	private JTextField txtName,txtPhone,txtTotal= new JTextField(15);
	private JPanel p1,p2,p3,p4;
	private JTabbedPane jtp;
	private JRadioButton rbSmall,rbMedium,rbLarge;
	private JCheckBox cbPepperoni,cbSausage,cbMushroom,cbOnion;
	private JButton btnOrderSum;
	//JTextField txtTotal = new JTextField(15);
	private int pizzaSizeCost;
	private int pizzaToppingsCost;
	
	public JavaPizza(){
		super("Java Pizza");
		setLayout(new FlowLayout());
		/*setLayout(new GridBagLayout());
		GridBagConstraints c = new GridBagConstraints();*/
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
		jtp.addTab("Customer",null, p1, "First Panel");
		
		JLabel lblsize = new JLabel("What size of pizza?", SwingConstants.CENTER);
		JRadioButton rbSmall = new JRadioButton("Small");
		rbSmall.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				pizzaSizeCost = 8;
				txtTotal.setText(pizzaSizeCost+pizzaToppingsCost+"");
				
			}
		} );
		JRadioButton rbMedium = new JRadioButton("Medium");
rbMedium.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				pizzaSizeCost = 10;
				txtTotal.setText(pizzaSizeCost+pizzaToppingsCost+"");
				
			}
		} );
		JRadioButton rbLarge = new JRadioButton("Large");
rbLarge.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				pizzaSizeCost = 12;
				txtTotal.setText(pizzaSizeCost+pizzaToppingsCost+"");
				
			}
		} );
		ButtonGroup group = new ButtonGroup();
	    group.add(rbSmall);
	    group.add(rbMedium);
	    group.add(rbLarge);
	    
	    
		JPanel p2 = new JPanel();
		p2.add(lblsize);
		p2.add(rbSmall);
		p2.add(rbMedium);
		p2.add(rbLarge);
		
		jtp.addTab("Size",null, p2, "Second Panel");
		
		
		JLabel lblToppings = new JLabel("What Toppings would you like?", SwingConstants.CENTER);
		JCheckBox cbPepperoni = new JCheckBox("Pepperoni");
		cbPepperoni.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				if(cbPepperoni.isSelected()){
					pizzaToppingsCost+=2;
				}
				else{
					pizzaToppingsCost-=2;
				}
				txtTotal.setText(pizzaSizeCost+pizzaToppingsCost+"");
				
			}
		});
		JCheckBox cbSausage = new JCheckBox("Sausage");
		cbSausage.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				if(cbSausage.isSelected()){
					pizzaToppingsCost+=2;
				}
				else{
					pizzaToppingsCost-=2;
				}
				txtTotal.setText(pizzaSizeCost+pizzaToppingsCost+"");
				
			}
		});
		JCheckBox cbMushroom = new JCheckBox("Mushroom");
		cbMushroom.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				if(cbMushroom.isSelected()){
					pizzaToppingsCost+=2;
				}
				else{
					pizzaToppingsCost-=2;
				}
				txtTotal.setText(pizzaSizeCost+pizzaToppingsCost+"");
				
			}
		});
		JCheckBox cbOnion = new JCheckBox("Onion");
		cbOnion.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				if(cbOnion.isSelected()){
					pizzaToppingsCost+=2;
				}
				else{
					pizzaToppingsCost-=2;
				}
				txtTotal.setText(pizzaSizeCost+pizzaToppingsCost+"");
				
			}
		});
		
		JPanel p3 = new JPanel();
		p3.add(lblToppings);
		p3.add(cbPepperoni);
		p3.add(cbSausage);
		p3.add(cbMushroom);
		p3.add(cbOnion);
		
		jtp.addTab("Toppings",null, p3, "Third Panel");
		
		JLabel lblTotaldue = new JLabel("Total Due", SwingConstants.CENTER);
		JLabel lblTotal = new JLabel("Total:", SwingConstants.CENTER);
		
		
		JButton btnOrderSum = new JButton("Order Summary");
		JPanel p4 = new JPanel();
		p4.add(lblTotaldue);
		p4.add(lblTotal);
		p4.add(txtTotal);
		p4.add(btnOrderSum);
		jtp.addTab("Total",null, p4, "Fourth Panel");
		
		btnOrderSum.addActionListener(this);
		
		add(jtp);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}