package com.example.wk6assignment;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InterestCalculator {
    private JTextField txtPrincipal;
    private JTextField txtRate;
    private JTextField txtTime;
    private JRadioButton btnSimpleInterest;
    private JButton btnCalculate;
    private JLabel lblPrincipal;
    private JLabel lblRate;
    private JLabel lblTime;
    private JLabel lblInterestType;
    private JRadioButton btnCompoundInterest;
    private JLabel lblCalculate;
    private JPanel panel;
    private JTextField txtInterest;
    private JLabel lblInterest;


    public InterestCalculator() {
        //Calculate button action listener
        btnCalculate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double principal=Double.parseDouble(txtPrincipal.getText());
                double rate=Double.parseDouble(txtRate.getText());
                double time=Double.parseDouble(txtTime.getText());

                //Interest calculation
                double interest = 0;
                if (btnSimpleInterest.isSelected()){
                    interest=principal*rate*time/100;
                }
                else if (btnCompoundInterest.isSelected()){
                    interest=principal*Math.pow((1+rate/100),time)-principal;
                }
                //Display interest calculated
                txtInterest.setText(String.format("%.2f",interest));
            }
        });
        //Setting the default radio button
        btnSimpleInterest.setSelected(true);
    }

    //Main method
    public static void main(String[] args) {
        JFrame frame = new JFrame("InterestCalculator");
        frame.setContentPane(new InterestCalculator().panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
