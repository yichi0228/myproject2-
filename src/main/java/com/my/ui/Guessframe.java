package com.my.ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Guessframe extends JFrame {
    //Fields
    JButton button=new JButton("Hi");
    JLabel label=new JLabel("Zzzz...");
    //Constructors
    public  Guessframe(){
        super();
        setSize(600,400);
        setLocation(300,200);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);


        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                System.out.println("Hello!");
                label.setText("Hello!");
            }
        });

        setLayout(new FlowLayout());

        add(button);
        add(label);
        setVisible(true);
    }
    //Methods








    public static void main(String[] args){
        Guessframe guessframe=new Guessframe();
        guessframe.setSize(600,400);
        guessframe.setVisible(true);
    }
}

