/************************************************************************
 * Program Name:ClientInformation.java 
 * Programmer Name : Haresh Busa
 * Program Description :Create the Client Information GUI, so that when your program is running, 
 * your user can input information regarding a client and hit the save button to save the information out to a file.
 ************************************************************************/
package edu.devry.week5;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class ClientInformation extends JFrame {
	private JLabel lblFilename,lblClientName, lblClientID, lblStartingBalance, lblClosingBalance;
	private JTextField txtFname, txtCname, txtCID, txtStBal, txtClBal;
	private JButton btnDisplay, btnSave;
	
	public ClientInformation(){
		lblFilename = new JLabel("Filename");
		lblClientName = new JLabel("client Name");
		lblClientID = new JLabel("Client ID");
		lblStartingBalance = new JLabel("Starting Balance");
		lblClosingBalance = new JLabel("Closing Balance");
		txtFname = new JTextField(15);
		txtCname = new JTextField(15);
		txtCID = new JTextField(15);
		txtStBal = new JTextField(15);
		txtClBal = new JTextField(15);
		btnDisplay = new JButton("Display");
		btnSave = new JButton("Save");
		
		setLayout(new FlowLayout());
		add(lblFilename);
		add(txtFname);
		
		add(lblClientName);
		add(txtCname);
		add(lblClientID);
		add(txtCID);
		
		add(lblStartingBalance);
		add(txtStBal);
		add(lblClosingBalance);
		add(txtClBal);
		add(btnDisplay);
		add(btnSave);
		
		
		
		
	}

}
