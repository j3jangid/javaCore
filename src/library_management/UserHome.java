package library_management;

import javax.swing.*;

public class UserHome extends JFrame {
    UserHome(String[] valiData) {
        setTitle("Home");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setSize(1918, 1000);

        JPanel navSec = new NavSec(valiData);
        add(navSec);

        JPanel bodySec = new BodySec();
        add(bodySec);

        setVisible(true);
    }
}


