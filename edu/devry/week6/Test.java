package edu.devry.week6;
import java.awt.*;import javax.swing.*;
public class Test extends JFrame{
	public Test(){
	super("JTabbedPane Demo ");
		JTabbedPane tab =new JTabbedPane();// constructing the first panelJLabel l1 =newJLabel("Welcome to CIS355A",SwingConstants.CENTER );JPanel p1 =newJPanel();
Container p1 = null;
Component l1 = null;
p1.add( l1 );
tab.addTab("Tab#1",null, p1," Panel #1");// constructing the second panelJLabel l2 =newJLabel("Welcome to JTabbedPaneDemo",SwingConstants.CENTER);JPanel p2 =newJPanel();
Frame p2 = null;
p2.setBackground(Color.blue );
Component l2 = null;
p2.add( l2 );
tab.addTab("Tab#2",null, p2," Panel #2");// constructing the third panelJLabel l3 =newJLabel(" Java is sooooooooooo fun!");JPanel p3 =newJPanel();
JFrame p3 = null;
p3.setLayout(new BorderLayout());
p3.add(new JButton("J"),BorderLayout.NORTH );
p3.add(new JButton("A"),BorderLayout.WEST );
p3.add(new JButton("V"),BorderLayout.EAST );
p3.add(new JButton("A"),BorderLayout.SOUTH );
Component l3 = null;
p3.add( l3,BorderLayout.CENTER );
tab.addTab("Tab#3",null, p3," Panel #3");// constructing the fourth panelJPanel p4 =newJPanel();
Frame p4 = null;
p4.setBackground(Color.black );JLabel digits =new JLabel("Java");
digits.setFont(new Font("Serif",Font.ITALIC,50));
digits.setForeground(Color.blue );
p4.add( digits );
tab.addTab("Tab#4",null, p4," Panel #4");// constructing the last panelJLabel l4 =newJLabel("The end!");JPanel p5 =newJPanel();
Container p5 = null;
Component l4 = null;
p5.add( l4);
tab.addTab("Tab#5",null, p5," Panel #5");// add JTabbedPane to container
getContentPane().add( tab );
setSize(270,200);
setVisible(true);
}
	public static void main(String args[]){
	Test demo =new Test();
demo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE );}}