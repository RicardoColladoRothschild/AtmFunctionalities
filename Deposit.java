import java.io.Serializable;
import java.io.*;
import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.*;
import javax.swing.event.*;
import javax.swing.JTextField;
import javax.swing.JLabel;

public class Deposit extends JFrame implements Serializable{
    private String amount;
    public Deposit(){
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);

            //label:
            label_deposit.setBounds(15,15,200,25);
            field_amount.setBounds(15,50,100,25);
            amount = field_amount.getText();
            add(label_deposit);

            

    }

    //Butons:
    JButton btn_sendInformation = new JButton(" Make Deposit");
    JTextField field_amount = new JTextField();
    JLabel label_deposit = new JLabel("Please enter amount to be deposit");
}
