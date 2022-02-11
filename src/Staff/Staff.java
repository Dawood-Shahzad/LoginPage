package Staff;

import Facilities.Facilities;
import Settings.Settings1;
import Squad.Squad;
import Stats.Stats;
import Tables.Tables;
import Training.Training;
import TransferMarket.TransferMarket;
import YouthAcademy.YouthAcademy;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Staff {
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
    private JButton HIRENEWSTAFFButton;
    private JPanel Panel9;
    private JFrame frame;

    public Staff() {

        frame = new JFrame("Staff");
        //frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setPreferredSize(new Dimension(1500, 600));
        frame.setResizable(false);

        frame.add(Panel9);

        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

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
    }
}
