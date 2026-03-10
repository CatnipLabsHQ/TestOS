import java.awt.*;
import java.util.Scanner;
import javax.swing.*;

public class CatOS {

    public static void main(String[] args) {
        LoginGUI();
        DesktopGUI();
    }

    public static void LoginGUI() {
        JFrame loginFrame = new JFrame();
        JPasswordField passField = new JPasswordField();
        JPanel panel = new JPanel();
        JTextArea loginText = new JTextArea();
        JButton loginButton = new JButton();

        // login Window Configuration
        loginFrame.setTitle("CatOS Login");
        loginFrame.setSize(300, 300);
        loginFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Login Text Configuration
        loginText.setText("Please enter your PassKey: ");
        loginText.setEditable(false);
        loginText.setBackground(null);
        loginText.setBorder(null);

        // Pass Field Configuration
        passField.setEchoChar('*');
        passField.setPreferredSize(new Dimension(150, 30));

        // Login button Configuration
        loginButton.setText("Login");
        loginButton.setSize(50, 30);
        loginButton.addActionListener(e -> {
            Scanner userLogin = new Scanner(passField.getText());

            int  inputPassKey = userLogin.nextInt();
            int passKey = 1234;

            if (inputPassKey == passKey) {
                loginFrame.dispose();
            }
            else {
                System.exit(0);
            }
        });

        // panel Configuration
        panel.add(loginText);
        panel.add(passField);
        panel.add(loginButton);
        loginFrame.add(panel);
        loginFrame.setPreferredSize(new Dimension(150, 30));

        loginFrame.setVisible(true);
    }

    public static void DesktopGUI() {
        JFrame mainWindow = new JFrame();
        JToolBar toolBar = new JToolBar();
        JButton shutDown = new JButton();

        // Main Window Configuration
        mainWindow.setTitle("CatOS");
        mainWindow.setSize(300, 300);
        mainWindow.getContentPane().setBackground(Color.CYAN);
        mainWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // ToolBar Configuration
        mainWindow.add(toolBar, BorderLayout.SOUTH);
        toolBar.setPreferredSize(new Dimension(300, 40));

        // ShutDown Button Configuration
        toolBar.add(shutDown);
        shutDown.setSize(35, 35);
        shutDown.setText("ShutDown");
        shutDown.addActionListener(e -> {
            System.exit(0);
                });

        mainWindow.setVisible(true);
    }
}