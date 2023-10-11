package com.example.mynewapp;

import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {
    //Another method of creating a JFrame
    //JFrame MyFrame=new JFrame();
    JButton btnAdd;
    JLabel lblNum1;
    JLabel lblNum2;
    JLabel lblAns;


    JTextField txtNum1;
    JTextField txtNum2;
    JTextField txtAns;

    //Panel creation
    JPanel panel;

    //Constructor for MyFrame
    public MyFrame(){
        btnAdd=new JButton("Add");
        lblNum1=new JLabel("Num 1: ");
        lblNum2=new JLabel("Num 2: ");
        lblAns=new JLabel("Answer is: ");

        txtNum1=new JTextField();
        txtNum2=new JTextField();
        txtAns=new JTextField();

        panel=new JPanel();
        panel.setLayout(new GridLayout());
        //Adding elements to the panel
        panel.add(lblNum1);
        panel.add(txtNum1);
        panel.add(lblNum2);
        panel.add(txtNum2);
        panel.add(lblAns);
        panel.add(txtAns);
        panel.add(btnAdd);
        //Add panel to the Jframe
        this.add(panel);
        //Close operation
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //Autosize frame to components
        this.pack();
        //App title
        this.setTitle("Casio");
        //Display the frame (do last)
        this.setVisible(true);

    }

}
