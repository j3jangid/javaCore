package library_management;

import javax.swing.*;
import java.awt.*;

public class Items extends JPanel {
    Items(){
        setLayout(null);
        setBounds(0, 0, 1900, 850);

        JLabel itemLabel = new JLabel("Item Section");
        itemLabel.setBounds(500, 50, 900, 100);
        itemLabel.setFont(new Font("Serif", Font.PLAIN, 70));
        add(itemLabel);
    }
}
