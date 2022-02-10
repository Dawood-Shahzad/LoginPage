package Tables;

import javax.swing.*;
import java.awt.*;

public class Tables {
    private JButton training;
    private JButton squad;
    private JButton transferMarket;
    private JButton youthAcademy;
    private JButton facilities;
    private JButton staff;
    private JButton leagueTableCupCompetitions;
    private JButton seasonStats;
    private JButton settings;
    private JButton nextWeek;
    private JPanel Panel4;
    private JFrame frame;

    public Tables() {

        frame = new JFrame("Tables");
        //frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setPreferredSize(new Dimension(1500, 600));
        frame.setResizable(false);

        frame.add(Panel4);

        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);


    }
}
