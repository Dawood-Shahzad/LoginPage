package Settings;

import javax.swing.*;
import java.awt.*;

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
        frame.setPreferredSize(new Dimension(800, 600));
        frame.setResizable(false);

        frame.add(Panel3);

        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);


    }
}
