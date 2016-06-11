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

    import javax.swing.JButton;
    import javax.swing.JFrame;
    import javax.swing.JLabel;
    import javax.swing.JTextField;

    public class ClientInformation extends JFrame {
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

        }
        public void actionPerformed(ActionEvent event){
            try{
                if (event.getActionCommand().equals("Save")){
                    String toBewrite = txtFname.getText() + "," + txtCname.getText()+
                            txtCID.getText() + "," + txtStBal.getText()+ "," + txtClBal.getText();
                    writeToFile(toBewrite);
                    btnSave.removeActionListener((ActionListener) this);
                    if (event.getActionCommand().equals("Display")) {
                        readFile();
                        btnDisplay.removeActionListener((ActionListener) this);
                    }
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
        public static void main(String[] args) {

            ClientInformation client = new ClientInformation();
            client.setSize(525,300);
            client.setVisible(true);

        }


    }

