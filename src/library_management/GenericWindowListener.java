package library_management;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class GenericWindowListener extends WindowAdapter {
    Frame frame;

    GenericWindowListener(Frame frame){
        this.frame=frame;
    }
    @Override
    public void windowClosing(WindowEvent e) {
        frame.dispose();
    }
}
