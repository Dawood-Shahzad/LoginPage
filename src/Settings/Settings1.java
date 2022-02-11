package Settings;

import Facilities.Facilities;
import Squad.Squad;
import Staff.Staff;
import Stats.Stats;
import Tables.Tables;
import Training.Training;
import TransferMarket.TransferMarket;
import YouthAcademy.YouthAcademy;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Settings1 {
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
    private JButton SAVEGAMEButton;
    private JButton MAINMENUButton;
    private JButton SOUNDButton;
    private JButton CURRENCYButton;
    private JButton HELPButton;
    private JPanel Panel3;
    private JFrame frame;

    public Settings1() {

        frame = new JFrame("Settings");
        //frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setPreferredSize(new Dimension(1500, 600));
        frame.setResizable(false);

        frame.add(Panel3);

        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);


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
