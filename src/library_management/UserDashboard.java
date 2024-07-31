package library_management;

import javax.swing.*;
import java.awt.*;

public class UserDashboard extends JPanel {
    UserDashboard(){
        setLayout(null);
        setBounds(0, 0, 1900, 850);

        JLabel headingLabel = new JLabel("Will Add Dashboard Later");
        headingLabel.setBounds(300, 50, 900, 100);
        headingLabel.setFont(new Font("Serif", Font.PLAIN, 70));
        add(headingLabel);

    }
}
