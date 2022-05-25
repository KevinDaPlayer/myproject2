package com.Kevin.framePractice;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class NewWin {
    public static void main(String[] args) {
        Random random = new Random();
        JFrame frame = new JFrame();
        frame.setSize(500, 500);
        frame.setLocation(300, 300);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        JButton button = new JButton("dont touch");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                int doro = random.nextInt(3)+1;
                switch (doro) {
                    case 1:
                        System.out.println("保持優雅");
                        break;
                    case 2:
                        System.out.println("阿爾托利亞‧潘德拉岡");
                        break;
                    case 3:
                        System.out.println("不夜城的caster");
                        break;
                }
            }
        });
        frame.add(button);
        frame.setLayout(new FlowLayout());


    }
}
