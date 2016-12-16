package com.company.view;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class GuiConfig extends JFrame {
    private static final long serialVersionUID = 1L;
    private JButton setButton = new JButton("Set");
    private JTextField textField = new JTextField("Set Brightness");
    public GuiConfig() {
        createUI();
    }

    private void createUI() {

        setTitle("Lubuntu Desktop Brightness");
        setBounds(300, 300, 331, 300);
        getContentPane().setLayout(null);
        getContentPane().add(setButton);
        getContentPane().add(textField);


        //button
        setButton.setBounds(150, 150, 145, 38);
        setButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
               int value = Integer.parseInt(textField.getText());
                String setBrightness = "echo applet| sudo -S echo "+ value + " > /sys/class/backlight/intel_backlight/brightness";
                String[] cmd = {"/bin/bash","-c",setBrightness};
                try {
                    Process pb = Runtime.getRuntime().exec(cmd);
                } catch (IOException e) {
                    e.printStackTrace();
                }


            }
        });
        textField.setBounds(50, 67, 150, 48);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);

    }
}
