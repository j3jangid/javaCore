package library_management;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class Index {
    public static void main(String[] args) {
        new adminUserFrame();
    }
}

class adminUserFrame extends JFrame{
    adminUserFrame(){
        setTitle("Library Management");
        setLayout(null);
        setSize(400, 200);
        setBackground(Color.gray);

        JButton loginBtn = new JButton("Login");
        loginBtn.setBounds(50, 50, 100, 30);
        add(loginBtn);

        JButton signUp = new JButton("Sign Up");
        signUp.setBounds(200, 50, 100, 30);
        add(signUp);

        setVisible(true);
        addWindowListener(new GenericWindowListener(this));

        ActionListener signUpBtnAction = e -> {
            dispose();
            new signUpProcess();
        };
        signUp.addActionListener(signUpBtnAction);

        loginBtn.addActionListener(new GenricNextWindow(this,"library_management.LoginPage"));
    }
}