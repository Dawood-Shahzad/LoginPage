package YouthAcademy;

import javax.swing.*;
import java.awt.*;

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
        frame.setPreferredSize(new Dimension(1200, 600));
        frame.setResizable(false);

        frame.add(Panel2);

        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);


    }
}
