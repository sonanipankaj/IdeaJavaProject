/************************************************************************
 * Program Name:Quick Fast Car Care.java 
 * Programmer Name : Haresh Busa
 * Program Description : This program will do provide fast customer order accepting user interface for car wash and car oil change  .
 ************************************************************************/
package edu.devry.week4;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;


public class Carcare extends JFrame {
	int oilChangeCost = 0;
	int carWash = 0;
public Carcare(){
	super("Quick Fast Car Care ");
	JMenu OilChangeMenu = new JMenu("Oil Change");
	JMenuItem BronzeItem =new JMenuItem("Bronze");
	JMenuItem SilverItem =new JMenuItem("Silver");
	JMenuItem GoldItem =new JMenuItem("Gold");
	
	OilChangeMenu.add(BronzeItem);
	OilChangeMenu.add(SilverItem);
	OilChangeMenu.add(GoldItem);
	BronzeItem.addActionListener(
			new ActionListener() //anonymous inner class 
			{ 
			public void actionPerformed(ActionEvent event){
			oilChangeCost = 20;	
			JOptionPane.showMessageDialog(Carcare.this, "Bronze Oild change costs $20.", "Bronze Item", JOptionPane.PLAIN_MESSAGE);
			} 
			}
			);
	SilverItem.addActionListener(
			new ActionListener() //anonymous inner class 
			{ 
			public void actionPerformed(ActionEvent event){ 
				oilChangeCost = 25;
			JOptionPane.showMessageDialog(Carcare.this, "Silver Oid change costs $25.", "Silver Item", JOptionPane.PLAIN_MESSAGE);
			} 
			}
			);
	GoldItem.addActionListener(
			new ActionListener() //anonymous inner class 
			{ 
			public void actionPerformed(ActionEvent event){ 
				oilChangeCost = 30;
			JOptionPane.showMessageDialog(Carcare.this, "Gold oil change costs $30.", "Gold Item", JOptionPane.PLAIN_MESSAGE);
			} 
			}
			);

	JMenu CarWashMenu = new JMenu("Car Wash");
	JMenuItem BasicItem =new JMenuItem("Basic");
	JMenuItem BetterItem =new JMenuItem("Better");
	JMenuItem BestItem =new JMenuItem("Best");
	CarWashMenu.add(BasicItem);
	CarWashMenu.add(BetterItem);
	CarWashMenu.add(BestItem);
	BasicItem.addActionListener( 
			new ActionListener() //anonymous inner class 
			{ 
			public void actionPerformed(ActionEvent event){
				carWash  = 5;
			JOptionPane.showMessageDialog(Carcare.this, "Basic car wash costs $5.", "Basic Item", JOptionPane.PLAIN_MESSAGE); 
			} 
			}
			);
	BetterItem.addActionListener( 
			new ActionListener() //anonymous inner class 
			{ 
			public void actionPerformed(ActionEvent event){ 
				carWash  = 10;
			JOptionPane.showMessageDialog(Carcare.this, "Better car wash costs $10.", "Better Item", JOptionPane.PLAIN_MESSAGE); 
			} 
			}
			);
	BestItem.addActionListener( 
			new ActionListener() //anonymous inner class 
			{ 
			public void actionPerformed(ActionEvent event){ 
				carWash  = 15;
			JOptionPane.showMessageDialog(Carcare.this, "Best car wash costs $15.", "Best Item", JOptionPane.PLAIN_MESSAGE); 
			} 
			}
			);
	JMenu TotalsClearExitMenu = new JMenu("Totals/Clear/Exit");
	JMenuItem TotalItem =new JMenuItem("Total");
	JMenuItem ClearItem =new JMenuItem("Clear");
	JMenuItem ExitItem =new JMenuItem("Exit");
	TotalsClearExitMenu.add(TotalItem);
	TotalsClearExitMenu.add(ClearItem);
	TotalsClearExitMenu.add(ExitItem);
	TotalItem.addActionListener( 
			new ActionListener() //anonymous inner class 
			{ 
			public void actionPerformed(ActionEvent event){ 
			JOptionPane.showMessageDialog(Carcare.this, "Oil chage cost : $" + oilChangeCost + 
					"\nCar wash cost : $" + carWash 
					+ "\nTotal : $" + (oilChangeCost + carWash) + ".", "Total", JOptionPane.PLAIN_MESSAGE); 
			} 
			} //end anonymous inner class 
			); //end call to addActionListener 
	ClearItem.addActionListener( 
			new ActionListener() //anonymous inner class 
			{ 
			public void actionPerformed(ActionEvent event){
				oilChangeCost = 0;
				carWash = 0;
			JOptionPane.showMessageDialog(Carcare.this, "Customer accout has been cleared.", "Clear Account", JOptionPane.PLAIN_MESSAGE); 
			} 
			}
			);
	ExitItem.addActionListener( 
			new ActionListener() //anonymous inner class 
			{ 
			public void actionPerformed(ActionEvent event){
				System.exit(0);
			} 
			}
			);
	
		JMenuBar bar = new JMenuBar(); //create menu bar 
		setJMenuBar(bar); 
		bar.add(OilChangeMenu);
		bar.add(CarWashMenu);
		bar.add(TotalsClearExitMenu);
		
		
}

			public static void main(String[] args) { 
			Carcare m = new Carcare(); 
			m.setVisible(true); 
			m.setSize(600,300); 

			} 
	
}

