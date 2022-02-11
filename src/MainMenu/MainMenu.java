package MainMenu;

import Facilities.Facilities;
import Squad.Squad;
import Staff.Staff;
import Training.Training;
import TransferMarket.TransferMarket;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainMenu {
    private JButton training;
    private JButton squad;
    private JButton transferMarket;
    private JButton youthAcademy;
    private JButton facilities;
    private JButton staff;
    private JButton leagueTableCupCompetitions;
    private JButton playerStats;
    private JButton settings;
    private JButton nextWeek;
    private JPanel Panel3;
    private JFrame frame;

    public MainMenu() {

        frame = new JFrame("Main Menu");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setPreferredSize(new Dimension(1500, 600));
        frame.setResizable(false);

        frame.add(Panel3);

        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        transferMarket.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new TransferMarket();
            }
        });
        squad.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Squad();
            }
        });
        training.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Training();
            }
        });
        facilities.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Facilities();
            }
        });
        staff.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Staff();
            }
        });
    }
    }
