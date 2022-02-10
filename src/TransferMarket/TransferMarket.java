package TransferMarket;

import Facilities.Facilities;
import Settings.Settings1;
import Squad.Squad;
import Stats.Stats;
import Tables.Tables;
import Training.Training;
import YouthAcademy.YouthAcademy;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TransferMarket {
    private JButton nextWeekButton;
    private JButton trainingButton;
    private JButton squadButton;
    private JButton transferMarketButton;
    private JButton youthAcademyButton;
    private JButton facilitiesButton;
    private JButton staffButton;
    private JButton leagueTableCupCompetitionsButton;
    private JButton playerStatsButton;
    private JButton settingsButton;
    private JTextField textField1;
    private JPanel Panel3;
    private JFrame frame;

    public TransferMarket() {
        frame=new JFrame("TransferMarket");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setPreferredSize(new Dimension(500, 450));
        frame.setResizable(false);

        frame.add(Panel3);

        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        squadButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Squad();
            }
        });
        transferMarketButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new TransferMarket();
            }
        });
        youthAcademyButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new YouthAcademy();
            }
        });
        leagueTableCupCompetitionsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Tables();
            }
        });
        playerStatsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Stats();
            }
        });
        settingsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Settings1();
            }
        });
        trainingButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Training();
            }
        });
        facilitiesButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Facilities();
            }
        });
    }

}
