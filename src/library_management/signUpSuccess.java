package library_management;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class signUpSuccess extends JFrame {
    signUpSuccess(String userName1, String uid, String password1){
        setTitle("Sign Up Completed");
        setLayout(null);
        setSize(420,330);

        JLabel heading = new JLabel("Congratulations");
        heading.setBounds(80, 5, 400, 40);
        heading.setFont(new Font("Serif", Font.PLAIN, 35));
        add(heading);

        JLabel userId = new JLabel("User ID :");
        userId.setBounds(30, 70, 100, 30);
        add(userId);

        JTextField userIDGenerated = new JTextField(uid);
        userIDGenerated.setBounds(150, 70, 200, 30);
        userIDGenerated.setEditable(false);
        add(userIDGenerated);

        JLabel userName = new JLabel("User Name :");
        userName.setBounds(30, 120, 100, 30);
        add(userName);

        JTextField userNameGenerated = new JTextField(userName1);
        userNameGenerated.setBounds(150, 120, 200, 30);
        userNameGenerated.setEditable(false);
        add(userNameGenerated);

        JLabel password = new JLabel("Password :");
        password.setBounds(30, 170, 100, 30);
        add(password);

        JTextField enteredPass = new JTextField(password1);
        enteredPass.setBounds(150, 170, 200, 30);
        enteredPass.setEditable(false);
        add(enteredPass);

        JButton saveDetailsBtn = new JButton("Save Details");
        saveDetailsBtn.setBounds(50, 220, 150, 30 );
        saveDetailsBtn.setCursor(new Cursor(Cursor.HAND_CURSOR));
        add(saveDetailsBtn);

        JButton gotologinPageBtn = new JButton("Login");
        gotologinPageBtn.setBounds(220, 220, 100, 30);
        gotologinPageBtn.setCursor(new Cursor(Cursor.HAND_CURSOR));
        add(gotologinPageBtn);

        setVisible(true);

        ActionListener gotologinPageBtnAction = e -> {
            dispose();
            new adminUserFrame();
        };

        gotologinPageBtn.addActionListener(gotologinPageBtnAction);




    }
}
