package Training;

import Facilities.Facilities;
import Settings.Settings1;
import Squad.Squad;
import Staff.Staff;
import Stats.Stats;
import Tables.Tables;
import TransferMarket.TransferMarket;
import YouthAcademy.YouthAcademy;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Training {
    private JButton training;
    private JButton squad;
    private JButton transferMarket;
    private JButton youthAcademy;
    private JButton facilites;
    private JButton staff;
    private JButton leagueTableCupCompetitions;
    private JButton playerStats;
    private JButton nextWeek;
    private JButton settings;
    private JButton GOALKEEPINGButton;
    private JButton DEFENDINGButton;
    private JButton PASSINGButton;
    private JButton DRIBBLINGButton;
    private JButton PACEButton;
    private JButton SHOOTINGButton;
    private JPanel Panel5;
    private JFrame frame;

    public Training() {
        frame = new JFrame("Training");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setPreferredSize(new Dimension(500, 450));
        frame.setResizable(false);

        frame.add(Panel5);

        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        GOALKEEPINGButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Players();
            }
        });
        DEFENDINGButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Players();
            }
        });
        PASSINGButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Players();
            }
        });
        DRIBBLINGButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Players();
            }
        });
        PACEButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Players();
            }
        });
        SHOOTINGButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Players();
            }
        });
        training.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Training();
            }
        });
        squad.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Squad();
            }
        });
        transferMarket.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new TransferMarket();
            }
        });
        youthAcademy.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new YouthAcademy();
            }
        });
        leagueTableCupCompetitions.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Tables();
            }
        });
        playerStats.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Stats();
            }
        });
        settings.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Settings1();
            }
        });
        facilites.addActionListener(new ActionListener() {
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
