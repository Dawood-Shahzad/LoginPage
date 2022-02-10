package Stats;

import javax.swing.*;
import java.awt.*;

public class Stats {
    private JButton training;
    private JButton squad;
    private JButton transferMarket;
    private JButton youthAcademy;
    private JButton facilities;
    private JButton staff;
    private JButton leagueTablesCupCompetitions;
    private JButton playerStats;
    private JButton nextWeek;
    private JButton settings;
    private JPanel Panel1;
    private JFrame frame;

    public Stats() {

        frame = new JFrame("Stats");
        //frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setPreferredSize(new Dimension(800, 600));
        frame.setResizable(false);

        frame.add(Panel1);

        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);


    }
}
