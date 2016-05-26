package edu.devry.week4;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;


public class Carcare extends JFrame {
public Carcare(){
	super("Quick Fast Car Care ");
	JMenu OilChangeMenu = new JMenu("Oil Change");
	JMenuItem BronzeItem =new JMenuItem("Bronze");
	JMenuItem SilverItem =new JMenuItem("Silver");
	JMenuItem GoldItem =new JMenuItem("Gold");
	OilChangeMenu.add(BronzeItem);
	OilChangeMenu.add(SilverItem);
	OilChangeMenu.add(GoldItem);
	
	
	JMenu CarWashMenu = new JMenu("Car Wash");
	JMenuItem BasicItem =new JMenuItem("Basic");
	JMenuItem BetterItem =new JMenuItem("Better");
	JMenuItem BestItem =new JMenuItem("Best");
	CarWashMenu.add(BasicItem);
	CarWashMenu.add(BetterItem);
	CarWashMenu.add(BestItem);
	
	
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
			JOptionPane.showMessageDialog(Carcare.this, "Your total is \n of $$", "Total", JOptionPane.PLAIN_MESSAGE); 
			} 
			} //end anonymous inner class 
			); //end call to addActionListener 
			//JMenuItem exitItem = new JMenuItem("Exit"); 
			//TotalsClearExitMenu.add(exitItem); 

			JMenuBar bar = new JMenuBar(); //create menu bar 
			setJMenuBar(bar); 
			bar.add(OilChangeMenu); 
			
			JMenuBar bar1 = new JMenuBar(); //create menu bar 
			setJMenuBar(bar1); 
			bar1.add(CarWashMenu);
			
			
			JMenuBar bar2 = new JMenuBar(); //create menu bar 
			setJMenuBar(bar2); 
			bar2.add(TotalsClearExitMenu);
			
			

			
			} 
			public static void main(String[] args) { 
			Carcare m = new Carcare(); 
			m.setVisible(true); 
			m.setSize(600,300); 

			} 
	
}

