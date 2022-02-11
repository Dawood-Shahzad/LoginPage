package YouthAcademy;

import Facilities.Facilities;
import Settings.Settings1;
import Squad.Squad;
import Staff.Staff;
import Stats.Stats;
import Tables.Tables;
import Training.Training;
import TransferMarket.TransferMarket;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class YouthAcademy {
    private JButton training;
    private JButton squad;
    private JButton transferMarket;
    private JButton youthAcademy;
    private JButton facilities;
    private JButton staff;
    private JButton leagueTablesCupCompetitions;
    private JButton playerStats;
    private JButton settings;
    private JButton nextWeek;
    private JButton PROMOTEButton;
    private JButton PROMOTEButton1;
    private JButton PROMOTEButton2;
    private JButton PROMOTEButton3;
    private JButton PROMOTEButton4;
    private JButton RELEASEButton;
    private JButton RELEASEButton1;
    private JButton RELEASEButton2;
    private JButton RELEASEButton3;
    private JButton RELEASEButton4;
    private JPanel Panel2;
    private JFrame frame;

    public YouthAcademy() {

        frame = new JFrame("Youth Academy");
        //frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setPreferredSize(new Dimension(1500, 600));
        frame.setResizable(false);

        frame.add(Panel2);

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
        leagueTablesCupCompetitions.addActionListener(new ActionListener() {
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
