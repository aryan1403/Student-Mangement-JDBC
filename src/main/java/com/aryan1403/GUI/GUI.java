package com.aryan1403.GUI;

import javax.swing.JFrame;
import javax.swing.JTabbedPane;

public class GUI {
    JFrame frame;

    private final int frameX = 800;
    private final int frameY = 700;
    public GUI() {
        JTabbedPane pane = new JTabbedPane();
        pane.setBounds(10, 10, 790, 690);
        pane.add("Data", new DataPane());
        pane.add("Insert Data", new InsertPane());
        pane.setLayout(null);

        frame = new JFrame();
        frame.setSize(frameX, frameY);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(3);
        frame.setResizable(false);
        frame.setLayout(null);
        frame.add(pane);
        frame.setVisible(true);
    }
}
