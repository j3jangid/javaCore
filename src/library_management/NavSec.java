package library_management;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NavSec extends JPanel {
    NavSec(String[] valiData){
        setLayout(null);
        setBackground(Color.gray);
        setBounds(0, 0, 1900, 60);

        JLabel logo = new JLabel("deity's logo");
        logo.setBounds(20, 5, 400, 40);
        logo.setFont(new Font("Serif", Font.PLAIN, 35));
        add(logo);

        String[] masterOptions = {"Master", "Customer", "items"};
        JComboBox<String> master = new JComboBox<>(masterOptions);
        master.setBounds(400, 10, 140, 30);
        master.setFont(new Font("Serif", Font.PLAIN, 15));
        master.setName("master");
        add(master);

        String[] transactionOptions = {"Transaction", "Sale", "Purchase", "User Requirement"};
        JComboBox<String> transaction = new JComboBox<>(transactionOptions);
        transaction.setBounds(550, 10, 140, 30);
        transaction.setFont(new Font("Serif", Font.PLAIN, 15));
        transaction.setName("transaction");
        add(transaction);

        String[] configOptions = {"Configuration", "User Types", "Users", "User Rights"};
        JComboBox<String> configuration = new JComboBox<>(configOptions);
        configuration.setBounds(700, 10, 140, 30);
        configuration.setFont(new Font("Serif", Font.PLAIN, 15));
        configuration.setName("configuration");
        add(configuration);

        String[] settingOptions = {"Setting", "Master Setting", "Transaction Setting", "User Setting"};
        JComboBox<String> settings = new JComboBox<>(settingOptions);
        settings.setBounds(850, 10, 140, 30);
        settings.setFont(new Font("Serif", Font.PLAIN, 15));
        settings.setName("settings");
        add(settings);

//        JButton checkSwitch = new JButton("Switch Test");
//        checkSwitch.setBounds(1000, 10, 100, 30);
//        add(checkSwitch);

        JLabel orgId = new JLabel("OID :"+valiData[1]);
        orgId.setBounds(1200, 10, 150, 10);
        add(orgId);

        JLabel userLabel = new JLabel("UserName :"+valiData[2]);
        userLabel.setBounds(1200, 25, 150, 10);
        add(userLabel);

        String[] logOutBtnOptions = {"...", "Upgrade Plan", "Visit Site", "Log Out"};
        JComboBox<String> logOutBtn = new JComboBox<>(logOutBtnOptions);
        logOutBtn.setBounds(1350, 10, 100, 40);
        add(logOutBtn);


        ActionListener getText = new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JComboBox<String> target = (JComboBox<String>) e.getSource();
                String compName = target.getName();
                String itemName = target.getSelectedItem().toString();
                System.out.println(compName);
                System.out.println(itemName);
//                SwitchPanelActionListner(compName, itemName);
            }
        };

        master.addActionListener(getText);
        transaction.addActionListener(getText);
        configuration.addActionListener(getText);
        settings.addActionListener(getText);

    }
}
