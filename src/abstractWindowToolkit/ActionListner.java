package abstractWindowToolkit;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActionListner {
    public static void main(String[] args) {
        Frame f = new Frame();
        f.setTitle("actionListner");
        f.setLayout(null);
        f.setVisible(true);
        f.setSize(500, 800);
        Button b = new Button("Click Me");
        b.setBounds(50, 100, 200, 50);
        f.add(b);
        b.addActionListener(new ButtonOnClick());

    }
}

class ButtonOnClick implements ActionListener{
    @Override
    public void actionPerformed(ActionEvent e) {
        int i = 1;
        System.out.println("hello");
    }
}
