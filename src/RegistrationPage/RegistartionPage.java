package RegistrationPage;

import javafx.fxml.FXML;

import javax.swing.*;
import java.awt.*;

public class RegistartionPage extends RegistrationPage {
    private JPanel panel1;
    private JTextField emailText;
    private JTextField userText;
    private JButton registerButton;
    @FXML
    private JPasswordField password;
    private JPasswordField passwordRetype;
    private JButton backToLoginButton;
    @FXML
    private JFrame frame;

    public RegistartionPage(){

        frame=new JFrame("Register");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setPreferredSize(new Dimension(500, 450));
        frame.setResizable(false);

        frame.add(panel1);

        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
