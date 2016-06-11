package edu.devry.week5;
import java.awt.*;  //import older gui library for content pane
import javax.swing.*;   //import newer gui library for labels, textfields, and button
import java.awt.event.*; //import gui event action library
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JRadioButton;

public class CustomerRecord extends JFrame implements ActionListener {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	// declare labels used on GUI screen
    private JLabel labelId, labelName, labelGender,labelcategory, labelPItem, labeldiscount;
    private JLabel labelError, labelRegistration; 
    private JTextField textId, textName, textGender, textState, textcategory, textPItem, textdiscount;
    // declare button used on GUI screen
    private JButton submitButton, clearButton, readButton;
    final JRadioButton jRadioMale = new JRadioButton("Male");
    final JRadioButton jRadioFemale = new JRadioButton("Female");
    // declare content pane
    private Container contentPane;

    public CustomerRecord() {
        createGUI();
    } // ends  constructor

    private void createGUI() {
        try {
            // get content pane and set the layout to null
            contentPane = getContentPane();
            contentPane.setLayout(null);    //free-form layout
            setFont(new Font("TimesRoman", Font.ITALIC, 14));

            // create the name label
            labelId = new JLabel(); //instantiate new JLabel
            labelId.setText("C.ID");    //set label text to name
            labelId.setLocation(38, 10);    //set location of JLabel
            labelId.setSize(200, 25);   //set size of JLabel
            labelId.setForeground(Color.BLACK);//set initial background color
            contentPane.add(labelId);   //add JLabel to content pane

            // create the name text box
            textName = new JTextField();    //instantiate new JTextField
            textName.setText("");   //clear JTextField
            textName.setToolTipText("Please enter ID");
            textName.setLocation(75, 10);   //set location of JTextFfield
            textName.setSize(200, 25);   //set size of JTextField
            contentPane.add(textId); //add jextId to content pane

            // create the address label
            labelName = new JLabel();
            labelName.setText("Name:");
            labelName.setLocation(23, 50);
            labelName.setSize(80, 25);
            labelName.setForeground(Color.BLACK);
            contentPane.add(labelName);

            // create the address text box
            textName = new JTextField();
            textName.setText("");
            textName.setToolTipText("Please type in full name");
            textName.setLocation(75, 50);
            textName.setSize(300, 25);
            contentPane.add(textName);
            labelGender = new JLabel();
            labelGender.setText("Gender");
            labelGender.setLocation(30, 90);
            labelGender.setSize(300, 25);
            labelGender.setForeground(Color.BLACK);
            contentPane.add(labelGender);
            textGender = new JTextField();
            textGender.setText("");
            textGender.setToolTipText("M/F");
            textGender.setLocation(75, 90);
            textGender.setSize(130, 25);
            contentPane.add(textGender);
            labelcategory = new JLabel();
            labelcategory.setText("Category");
            labelcategory.setLocation(18, 170);
            labelcategory.setSize(300, 25);
            labelcategory.setForeground(Color.BLACK);
            contentPane.add(labelcategory);
            textcategory = new JTextField();
            textcategory.setText("");
            textcategory.setToolTipText("Item Type (Grocery)");
            textcategory.setLocation(75, 170);
            textcategory.setSize(130, 25);
            contentPane.add(textcategory);
            labelPItem = new JLabel();
            labelPItem.setText("Total Item");
            labelPItem.setLocation(15, 210);
            labelPItem.setSize(250, 25);
            labelPItem.setForeground(Color.BLACK);
            contentPane.add(labelPItem);
            textPItem = new JTextField();
            textPItem.setText("");
            textPItem.setToolTipText("Purchased items must be between start with 1 or 70");
            textPItem.setLocation(75, 210);
            textPItem.setSize(130, 25);
            contentPane.add(textPItem);
            labeldiscount = new JLabel();
            labeldiscount.setText("Discount");
            labeldiscount.setLocation(18, 250);
            labeldiscount.setSize(300, 25);
            labeldiscount.setForeground(Color.BLACK);
            contentPane.add(labeldiscount);
            textdiscount = new JTextField();
            textdiscount.setText("");
            textdiscount.setToolTipText("Entered Value must be containing ' % '");
            textdiscount.setLocation(75, 250);
            textdiscount.setSize(130, 25);
            contentPane.add(textdiscount);
            submitButton = new JButton();
            submitButton.setText("Submit");
            submitButton.setToolTipText("Click \"submit \" when the form is completely filled out");
            submitButton.setLocation(125, 450);
            submitButton.setSize(100, 30);
            contentPane.add(submitButton);
            submitButton.addActionListener(this);
            readButton = new JButton();
            readButton.setText("Show Records");
            readButton.setToolTipText("Click Show Record if you want to check record");
            readButton.setLocation(225, 350);
            readButton.setSize(200, 30);
            contentPane.add(readButton);
            readButton.addActionListener(this);

            clearButton = new JButton();
            clearButton.setText("Clear");
            clearButton.setToolTipText("Click \"clear \" when you want to clear the form");
            clearButton.setLocation(250, 450);
            clearButton.setSize(100, 30);
            contentPane.add(clearButton);
            clearButton.addActionListener(this);

            // create the error label
            labelError = new JLabel();
            labelError.setText("Please correct items in red");
            labelError.setLocation(150, 500);
            labelError.setSize(190, 25);
            labelError.setForeground(Color.RED);
            labelError.setVisible(false);
            contentPane.add(labelError);

            // create the registration label
            labelRegistration = new JLabel();
            labelRegistration.setText("Thank you for your entry.");
            labelRegistration.setLocation(145, 500);
            labelRegistration.setSize(190, 25);
            labelRegistration.setForeground(Color.BLACK);
            labelRegistration.setVisible(false);
            contentPane.add(labelRegistration);

            setTitle("Customer Form");  //set window title
            setSize(475, 600); //set window size
            setVisible(true);
        } catch (Exception e) {
        }
    }// ends creatGUI method.
    
    
    /*private void writeToFile(String list) throws IOException{
    
    	                File f = new File("C:\\client.txt");
    	                System.out.println(f);
    	                FileWriter fw = new FileWriter(f,true);
    	                System.out.println(fw);
    	                try{
    	                    BufferedWriter bw = new BufferedWriter(fw);
    	                    System.out.println(bw);
    	                    bw.newLine();
    	                    bw.write(list);
    	                    bw.flush();
    	                    bw.close();
    	                }
    	                catch(Exception e){
    	                    System.out.println(e);
    	                }
    	             
    	}
    
    private void readFile(){
    	File f = new File("C:\\client.txt");
    	try{
    	       FileReader fr = new FileReader(f);
    	       BufferedReader br = new BufferedReader(fr);
    	       while(br.ready()){
    	       System.out.println(br.readLine());
    	     
    	       br.close(); 
    	      
    	       }
    	}catch(Exception e){
    	    System.out.println(e);
    	}
   }
    	
   */
    
    

    public static void main(String args[]) {
        CustomerRecord application = new CustomerRecord();
        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }// ends main

    public void actionPerformed(ActionEvent event) {
        try {
            if (event.getActionCommand().equals("Submit")) {

                if (checkID() & checkName() & checkGender() &  check() & checkPItem() & checkdiscount()) {
                	labelRegistration.setVisible(true);
                    labelError.setVisible(false);
                    //concatnating the collected data to be written.
                    String toBewrite = textId.getText() + "," + textName.getText();
                    toBewrite = toBewrite + "," + textGender.getText() + "," + textcategory.getText();
                    toBewrite = toBewrite + "," + textPItem.getText() + "," + textdiscount.getText();
                    ///calling the writeToFile method where the relavent data to be updated to the file.
                    writeToFile(toBewrite);
                    ////
                    submitButton.removeActionListener(this);
                    clearButton.removeActionListener(this);
                } else {
                    labelError.setVisible(true); 
                    labelRegistration.setVisible(false); 
                }
            } if (event.getActionCommand().equals("Clear")) 
                {
                textName.setText("");
                textName.setText("");
                textGender.setText("");
                textState.setText("");
                textcategory.setText("");
                textPItem.setText("");
                textdiscount.setText("");

                labelError.setVisible(false);
                labelRegistration.setVisible(false);
                labelId.setForeground(Color.BLACK);
                labelName.setForeground(Color.BLACK);
                labelGender.setForeground(Color.BLACK);
                labelcategory.setForeground(Color.BLACK);
                labelPItem.setForeground(Color.BLACK);
                labeldiscount.setForeground(Color.BLACK);

            }
            if (event.getActionCommand().equals("Show Records")) {
                readFile();
            }
        } catch (Exception e) { }
    }
    private void writeToFile(String toBewrite) throws IOException {
    	 File f = new File("C:\\client.txt");
         System.out.println(f);
         FileWriter fw = new FileWriter(f,true);
         System.out.println(fw);
         try{
             BufferedWriter bw = new BufferedWriter(fw);
             System.out.println(bw);
             bw.newLine();
             char[] list = null;
			bw.write(list);
             bw.flush();
             bw.close();
         }
         catch(Exception e){
             System.out.println(e);
         }
      
	}

	private void readFile() {
    	File f = new File("C:\\client.txt");
    	try{
    	       FileReader fr = new FileReader(f);
    	       BufferedReader br = new BufferedReader(fr);
    	       while(br.ready()){
    	       System.out.println(br.readLine());
    	     
    	       br.close(); 
    	      
    	       }
    	}catch(Exception e){
    	    System.out.println(e);
    	}
		
	}

	private boolean checkID() {
        if (textName.getText().length() == 0) {
            labelId.setForeground(Color.RED);   //name is not correct
            return false;
        } else {
            labelId.setForeground(Color.BLACK); //name is correct
            return true;
        }
    } 
    private boolean checkName() {
        if (textName.getText().length() < 5) {
            labelName.setForeground(Color.RED); 
            return false;
        } else {
            labelName.setForeground(Color.BLACK);
            return true;
        }
    } 

    private boolean checkGender() {
        if (textGender.getText().length() == 0) {
            labelGender.setForeground(Color.RED);
            return false;
        } else {
            labelGender.setForeground(Color.BLACK); 
            return true;
        }
    } 
    private boolean check() {
        try {

            if (textcategory.getText().length() == 5) {
                labelcategory.setForeground(Color.BLACK);
                return true;
            } else {
                labelcategory.setForeground(Color.RED); 
                return false;
            }
        } catch (Exception e) {
            labelcategory.setForeground(Color.RED);     
            return false;
        }
    } 
    private boolean checkPItem() {

            if (textPItem.getText().startsWith("1") || textPItem.getText().startsWith("70")) 
            {
                labelPItem.setForeground(Color.BLACK);
                return true;
            } else {
                labelPItem.setForeground(Color.RED);    
                return false;
            }      
    } 
    private boolean checkdiscount() {
        if (textdiscount.getText().contains("%"))
        {
            labeldiscount.setForeground(Color.BLACK);
                return true;
        } else
        {
            labeldiscount.setForeground(Color.RED); 
                return false;
        }
    }   
}
