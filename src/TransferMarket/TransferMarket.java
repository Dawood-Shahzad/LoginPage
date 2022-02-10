package TransferMarket;

import javax.swing.*;
import java.awt.*;

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
    }

}
