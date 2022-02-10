package Squad;

import Facilities.Facilities;
import Settings.Settings1;
import Stats.Stats;
import Tables.Tables;
import Training.Training;
import TransferMarket.TransferMarket;
import YouthAcademy.YouthAcademy;
import javafx.scene.control.Tab;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Squad {
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
    private JPanel Panel6;
    private JFrame frame;

    public Squad() {
        frame=new JFrame("Squad");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setPreferredSize(new Dimension(500, 450));
        frame.setResizable(false);

        frame.add(Panel6);

        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
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
    }
}
