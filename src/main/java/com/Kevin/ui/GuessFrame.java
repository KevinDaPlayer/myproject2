package com.Kevin.ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GuessFrame extends JFrame {

    JLabel label = new JLabel("shitON");
    JButton button = new JButton("hi");
    public GuessFrame () {
        super();
        setSize(600, 400);
        setLocation(300, 200);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                label.setText("Sheeesh");
            }
        });
        setLayout(new FlowLayout());
        add(button);
        add(label);
        setVisible(true);
    }

    public static void main(String[] args) {
        GuessFrame guessFrame = new GuessFrame();
        //guessFrame.setVisible(true);
    }
}
