package com.example.mysecondapp;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator {
    private JPanel panel;
    private JTextField txtNum1;
    private JTextField txtNum2;
    private JTextField txtAns;
    private JButton btnAdd;

    public Calculator() {
        btnAdd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Code executed when button is clicked
                double num1=Double.parseDouble(txtNum1.getText());
                double num2= Double.parseDouble(txtNum2.getText());
                double ans=num1+num2;
                txtAns.setText(Double.toString(ans));
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculator");
        frame.setContentPane(new Calculator().panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
