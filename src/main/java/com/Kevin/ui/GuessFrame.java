package com.Kevin.ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class GuessFrame extends JFrame {

    JLabel label = new JLabel("GOODLUCK");
    JButton button = new JButton("GUESS");
    JTextField number = new JTextField(8);
    Random random = new Random();
    int secret = random.nextInt(10)+1;
    public GuessFrame () {
        super();
        setSize(600, 400);
        setLocation(300, 200);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                System.out.println(secret);
                int num = Integer.parseInt(number.getText());
                if (num > secret) {
                    label.setText("Smaller");
                } else if (num < secret) {
                    label.setText("Bigger");
                } else {
                    label.setText("Bingo");
                }
                //label.setText("Sheeesh");
            }
        });
        setLayout(new FlowLayout());
        add(number);
        add(button);
        add(label);
        setVisible(true);
    }

    public static void main(String[] args) {
        GuessFrame guessFrame = new GuessFrame();
        //guessFrame.setVisible(true);
    }
}
