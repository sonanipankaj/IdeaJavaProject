package edu.devry.week6;


import javax.swing.JFrame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class JavaPizzaTest {

    public static void main(String[] args) {
        JavaPizza jp = new JavaPizza();
        jp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jp.setSize(650, 300);
        jp.setVisible(true);

    }

}

class  WindowQuitter  extends WindowAdapter
{
    public void windowClosing( WindowEvent e )
    {
        System.exit( 0 );
    }
}
