package Swings;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class ImageButtonExample {

    JLabel label;

    ImageButtonExample() {

        JFrame f = new JFrame("Image Button Example");

        // Label
        label = new JLabel("Click any image");
        label.setBounds(100, 30, 400, 40);
        label.setFont(new Font("Arial", Font.BOLD, 20));

        // Load Images (Make sure images are in same folder or give full path)
        ImageIcon clockIcon = new ImageIcon("clock.png.png");
        ImageIcon hourglassIcon = new ImageIcon("hourglass.png.jpg");

        // Buttons with images
        JButton b1 = new JButton(clockIcon);
        JButton b2 = new JButton(hourglassIcon);

        b1.setBounds(100, 100, 120, 120);
        b2.setBounds(300, 100, 120, 120);

        // Action for Digital Clock
        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                label.setText("You have pressed Digital Clock!");
            }
        });

        // Action for Hour Glass
        b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                label.setText("You have pressed Hour Glass!");
            }
        });

        // Add components
        f.add(label);
        f.add(b1);
        f.add(b2);

        f.setSize(550, 300);
        f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        new ImageButtonExample();
    }
}