package com.Kevin.finalExamPractice;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class GameFrame extends JFrame {
    Random random = new Random();
    JLabel label = new JLabel("FGO");
    JButton button = new JButton("doro");
    JTextField textField = new JTextField(5);
    int secret = random.nextInt(10) +1;

    public GameFrame () {
        super();
        setSize(500, 500);
        setLocation(400, 200);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                int num = Integer.parseInt(textField.getText());
                if (num > secret) {
                    label.setText("smaller");
                } else if (num < secret) {
                    label.setText("bigger");
                } else {
                    label.setText("bingoo");
                }
            }
        });
        setLayout(new FlowLayout());
        add(button);
        add(label);
        add(textField);
        setVisible(true);
    }

    public static void main(String[] args) {
        GameFrame frame = new GameFrame();
    }
}
