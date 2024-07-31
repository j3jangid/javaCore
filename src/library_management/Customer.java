package library_management;

import javax.swing.*;
import java.awt.*;

public class Customer extends JPanel {
    Customer(){
        setLayout(null);
        setBounds(0, 0, 1900, 850);

        JLabel customerLabel = new JLabel("Customer Section");
        customerLabel.setBounds(500, 50, 900, 100);
        customerLabel.setFont(new Font("Serif", Font.PLAIN, 70));
        add(customerLabel);
    }
}
