package LoginPage;

import MainMenu.MainMenu;
import RegistrationPage.RegistartionPage;
import javafx.fxml.FXML;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginPage extends JFrame{
    private JTextField userText;
    private JPanel panel1;
    private JPasswordField password;

    private JButton loginButton;
    @FXML
    private JButton registerButton;
    @FXML
    private JFrame frame;

    public LoginPage(){

        frame=new JFrame("Login");
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setPreferredSize(new Dimension(300, 250));
        frame.setResizable(false);

        frame.add(panel1);

        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);


        registerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                    new RegistartionPage();
                }
        });
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new MainMenu();
            }
        });
    }

}
