package Training;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Players {
    private JButton backToTrainingButton;
    private JButton ALLISONBECKERButton;
    private JButton TRENTALEXANDERARNOLDButton;
    private JButton VIRGILVANDIJKButton;
    private JButton ANDYROBERTSONButton;
    private JButton FABINHOTAVARESButton;
    private JButton HARVEYELLIOTButton;
    private JButton MOHAMMEDSALAHButton;
    private JButton DIOGOJOTAButton;
    private JButton SADIOMANEButton;
    private JPanel Panel7;
    private JFrame frame;

    public Players() {
        frame = new JFrame("Players");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setPreferredSize(new Dimension(1500, 600));
        frame.setResizable(false);

        frame.add(Panel7);

        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

        backToTrainingButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Training();
            }
        });
    }
}
