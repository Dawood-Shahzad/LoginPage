package Facilities;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Anfield {
    private JButton backToFacilitiesButton;
    private JButton UPGRADEButton;
    private JButton UPGRADEButton1;
    private JButton UPGRADEButton2;
    private JButton UPGRADEButton3;
    private JPanel Panel9;
    private JFrame frame;

    public Anfield(){

        frame=new JFrame("Anfield");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setPreferredSize(new Dimension(300, 250));
        frame.setResizable(false);

        frame.add(Panel9);

        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

        backToFacilitiesButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Facilities();
            }
        });
    }}
