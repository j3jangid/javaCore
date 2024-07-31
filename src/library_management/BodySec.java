package library_management;

import javax.swing.*;
import java.awt.*;

public class BodySec extends JPanel {
    BodySec(){
        setLayout(null);
        setBackground(Color.black);
        setBounds(0, 70, 1900, 930);

        JPanel currentOption = new UserDashboard();
        add(currentOption);

    }
}
