package edu.devry.week5;

import javax.swing.JFrame;

public class SnowmanTest extends JFrame {

	
	
	public static void main (String[] args){
		Snowman s = new Snowman();
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(s);
		frame.setSize(500, 600);
		frame.setVisible(true);
		
	}

}
