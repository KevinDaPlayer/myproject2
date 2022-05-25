package com.Kevin.ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyWin {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(600, 400);
        frame.setLocation(300, 200);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        JButton button = new JButton("ok");
        MyActionListener actionListener = new MyActionListener();
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed (ActionEvent actionEvent) {
                System.out.println("HelloWorld!!!");
            }
        });
        frame.setLayout(new FlowLayout());
        frame.add(button);
        frame.add(new JButton("123"));
        System.out.println("END");
    }
}
