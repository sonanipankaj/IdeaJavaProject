/************************************************************************
 * Program Name:ClientInformation.java 
 * Programmer Name : Haresh Busa
 * Program Description :Create the Client Information GUI, so that when your program is running, 
 * your user can input information regarding a client and hit the save button to save the information out to a file.
 ************************************************************************/
package edu.devry.week5;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.StringTokenizer;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class ClientInformation extends JFrame implements ActionListener {
	private JLabel lblFilename,lblClientName, lblClientID, lblStartingBalance, lblClosingBalance;
	private JTextField txtFname, txtCname, txtCID, txtStBal, txtClBal;
	private JButton btnDisplay, btnSave;
	
	public ClientInformation(){
		super("Manage Client Information");
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
		
		btnSave.addActionListener(this);
		btnDisplay.addActionListener(this);
		
	}
	public void actionPerformed(ActionEvent event){
		try{
			
			if("".equals(txtFname.getText()) || txtFname.getText()==null){
				JOptionPane.showMessageDialog(this, "File name should not be empty.");
				return;
			}
			
			
			if (event.getActionCommand().equals("Save")){
			
				
				
				if("".equals(txtCID.getText()) || txtCID.getText()==null){
					JOptionPane.showMessageDialog(this, "Client ID should not be empty.");
				}
				if("".equals(txtStBal.getText()) || txtStBal.getText()==null){
					JOptionPane.showMessageDialog(this, "Client Starting Blance should not be empty.");
				}
				if("".equals(txtClBal.getText()) || txtClBal.getText()==null){
					JOptionPane.showMessageDialog(this, "Client Closing Balance should not be empty.");
				}
				this.writeToFile();
				/*String toBewrite = txtFname.getText() + "," + txtCname.getText()+
						txtCID.getText() + "," + txtStBal.getText()+ "," + txtClBal.getText();
				writeToFile(toBewrite);
				btnSave.removeActionListener((ActionListener) this);*/
				//txtFname.setText("");
				txtCname.setText("");
	     		txtCID.setText("");
	     		txtStBal.setText("");
	     		txtClBal.setText("");

			}
			if (event.getActionCommand().equals("Display")) {
				this.readFile();
			}
		} catch (Exception e) { }

	}
		
	
	

	 private void writeToFile() throws IOException {
	    	 File f = new File(txtFname.getText());
	         FileWriter fw = new FileWriter(f,true);
	         BufferedWriter bw = new BufferedWriter(fw);
	         try{
	            
	             bw.newLine();
	             String record = txtCname.getText()+" # "+
	     		txtCID.getText()+" # "+
	     		txtStBal.getText()+" # "+
	     		txtClBal.getText();
				bw.write(record);
				bw.flush();
	             
	         }
	         catch(Exception e){
	             System.out.println(e);
	         }
	         finally {
	        	 bw.close();
	        	 fw.close();
			}
	      
		}
	 private void readFile() throws Exception {
		 
		 System.out.println("Client Activity Report");
		 System.out.println("----------------------");
		 File f = new File(txtFname.getText());
		 FileReader fr = new FileReader(f);
		 BufferedReader br = new BufferedReader(fr);
		 try{
			 
			 while(br.ready()){
				// System.out.println(br.readLine());
				 StringTokenizer st = new StringTokenizer(br.readLine()," # ");

				 while(st.hasMoreTokens()){
					 System.out.print(st.nextToken());
					 if(st.hasMoreTokens()){
						 System.out.print("\t");
					 }
					 else{
						 System.out.print("\n");
					 }
				 }
			 }
		 }catch(Exception e){
			 System.out.println(e);
		 }
		 finally {
			 br.close(); 
			 fr.close();
		}

	 }

		
}
			
				
	
				
	



				
				
		
	
		
		
		