/************************************************************************
 * Program Name:Snowman.java 
 * Programmer Name : Haresh Busa
 * Program Description : Use the many draw methods provided to you by Java and draw a Snowman!
 ************************************************************************/
package edu.devry.week5;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Polygon;

import javax.swing.JPanel;

public class Snowman extends JPanel {

	public void paintComponent(Graphics d){
		super.paintComponent(d);
		setBackground(Color.BLUE);
		
		d.setColor(Color.WHITE);
		d.fillOval(150, 30, 140, 140);//draw head
		d.fillOval(150, 170, 140, 140);//draw upper
		d.fillOval(150, 310, 140, 140);//draw lower
		
		d.setColor(Color.BLACK);//draw eyes
		d.fillRect(185, 75, 13, 17);
		d.fillRect(240, 75, 13, 17);
		
		d.setColor(Color.ORANGE);//draw button
		d.fillOval(210, 200, 12, 12);
		d.fillOval(210, 225, 12, 12);
		d.fillOval(210, 250, 12, 12);
		
		
		d.setColor(Color.RED);//draw mouth
		d.fillOval(195, 115, 50,15);
		//draw arms
		d.setColor(Color.BLACK);
		//d.drawLine(150, 240, -50,40 );
		d.drawLine(150, 240, 70,200 );
		d.drawLine(290, 240, 380,110 );
	
		//  draw hat	
		    d.drawLine (200, 30, 235,30 ); 
				
		    d.fillRect (205, 5, 25, 25);
		
		
		d.setColor(Color.GREEN);
		d.drawString("My Snowman", 190, 500);
		
		
	}

}

