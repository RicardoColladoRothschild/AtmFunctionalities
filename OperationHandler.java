
import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JButton;

import javax.swing.JPanel;
import javax.swing.event.*;
import java.awt.event.*;
import javax.swing.JOptionPane;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import javax.swing.event.*;


public class OperationHandler {
    
    
    Deposit depositObject;
    Balance balanceObject;
    public OperationHandler(){
        JFrame frame = new JFrame("Atm Functionalities using Object Serialization");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            
            Container contentPane = frame.getContentPane();
            contentPane.setLayout(new GridBagLayout());

            GridBagConstraints gbc = new GridBagConstraints();

            gbc.gridx = 0;
            gbc.gridy = 1;
            contentPane.add(btn_balance, gbc);
            gbc.gridx=0;
            gbc.gridy=2;
            contentPane.add(btn_deposit, gbc);
            gbc.gridx=0;
            gbc.gridy=3;
            contentPane.add(btn_withdraw, gbc);

            btn_balance.addActionListener(e->{
                balanceObject = new Balance();
            });

            btn_deposit.addActionListener(e->{
                depositObject = new Deposit();
                depositObject.setVisible(true);
                depositObject.setBounds(0,0,350,350);
                depositObject.setResizable(false);
                depositObject.setLocationRelativeTo(null);
                this.setVisible(false);
            });
            
            btn_withdraw.addActionListener(e->{
                Widthdraw WidthObject = new Widthdraw();
            });

            frame.pack();
            frame.setVisible(true);
    }
    

    //Basic Buttons:
        JButton btn_deposit = new JButton("Deposit");
        JButton btn_withdraw = new JButton("Withdraw");
        JButton btn_balance = new JButton("Balance");


        
}
