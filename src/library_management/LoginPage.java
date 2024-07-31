package library_management;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.sql.SQLException;

public class LoginPage extends JFrame {
    public LoginPage(){
        setTitle("Login");
        setLayout(null);
        setSize(450, 300);

        JLabel oidLable = new JLabel("Organization ID :");
        oidLable.setBounds(30, 10, 150, 30);
        add(oidLable);

        JTextField oid = new JTextField();
        oid.setBounds(200, 10, 200, 30);
        add(oid);

        JLabel userNameLable = new JLabel("User Name :");
        userNameLable.setBounds(30, 60, 150, 30);
        add(userNameLable);

        JTextField userName = new JTextField();
        userName.setBounds(200, 60, 200, 30);
        add(userName);

        JLabel passLable = new JLabel("Password :");
        passLable.setBounds(30, 110, 150, 30);
        add(passLable);

        JPasswordField password = new JPasswordField();
        password.setBounds(200, 110, 200, 30);
        add(password);

        JLabel label = new JLabel("Forgot O-ID/User Name/Password");
        label.setBounds(106, 160, 200, 20);
        label.setForeground(Color.blue);
        label.setCursor(new Cursor(Cursor.HAND_CURSOR));
        add(label);

        JButton homeBtn = new JButton("Home");
        homeBtn.setBounds(50, 200, 100, 30);
        homeBtn.setCursor(new Cursor(Cursor.HAND_CURSOR));
        add(homeBtn);

        JButton signUpBtn = new JButton("Sign Up");
        signUpBtn.setBounds( 170, 200, 100, 30);
        signUpBtn.setCursor(new Cursor(Cursor.HAND_CURSOR));
        add(signUpBtn);

        JButton loginBtn = new JButton("Login In");
        loginBtn.setBounds(290, 200, 100, 30);
        loginBtn.setCursor(new Cursor(Cursor.HAND_CURSOR));
        add(loginBtn);

        setVisible(true);

        ActionListener gotoHome = e -> {
          dispose();
          new adminUserFrame();
        };
        homeBtn.addActionListener(gotoHome);

        ActionListener gotoSignUp = e -> {
            dispose();
            new signUpProcess();
        };
        signUpBtn.addActionListener(gotoSignUp);

        ActionListener loginProcess = e -> {
            String OID = oid.getText();
            String username = userName.getText();
            String pass = String.valueOf(password.getPassword());

            if (OID.isEmpty() || username.isEmpty() || pass.isEmpty()) {
                JOptionPane.showMessageDialog(LoginPage.this, "Please Enter All Required Details", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }else {
                try {
                    String[] valiData =  UserVarify.validateUser(OID, username, pass);
                    if (valiData[0].equals("incorrectPassword") || valiData[0].equals("incorrectIdUserName")){
                        JOptionPane.showMessageDialog(LoginPage.this, "Please Enter Details Correctly.", "Error", JOptionPane.ERROR_MESSAGE);
                        return;
                    }else {
                        new UserHome(valiData);
                        dispose();
                    }
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
        };
        loginBtn.addActionListener(loginProcess);

        addWindowListener(new GenericWindowListener(this));


    }
}
