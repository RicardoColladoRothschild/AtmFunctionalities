package AtmFunctionalities;

import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.BoxLayout;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.event.*;
import java.awt.event.*;
 import java.swing.JOptionPanel;

public class MainClass{
    
    

    public static void main(String[] args){

        JFrame frame = new JFrame("Atm Simulator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container contentPane = frame.getContentPane();
       
        JPanel vPanel = new JPanel();
        BoxLayout btns_Box = new BoxLayout(vPanel, BoxLayout.Y_AXIS);
        vPanel.setLayout(btns_Box);
            //buttons:

                  JButton btn_deposit = new JButton("Deposits");;
                        btn_deposit.addActionListener(new ActionListener(){
                            @Override
                                public void actionPerformed(ActionEvent e){

                                }
                        });
                        vPanel.add(btn_deposit);


                    JButton btn_withdraw = new JButton("Withdraw");
                        btn_withdraw.addActionListener(new ActionListener(){
                            @Override
                                public void actionPerformed(ActionEvent e){

                                }
                        });
                        vPanel.add(btn_withdraw);
                        
                 JButton btn_balance = new JButton("Balance");
                                            
                        
                        btn_balance.addActionListener(new ActionListener(){
                            @Override
                            public void actionPerformed(ActionEvent e){

                            }
                        });
                        vPanel.add(btn_balance);

                        contentPane.add(vPanel, BorderLayout.CENTER);
                        frame.pack();
                        frame.setBounds(0,0,250,250);
                        frame.setResizable(false);
                        frame.setLocationRelativeTo(null);
                        frame.setVisible(true);

    }

    
}
