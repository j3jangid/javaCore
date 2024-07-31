package abstractWindowToolkit;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActionListner2 {
    public static void main(String[] args) {
        new Frame1();

    }
}

class Frame1 extends Frame{
    Frame1(){
        setLayout(null);
        setVisible(true);
        setTitle("Frame 1");
        setSize(500,800);
        Button b1 = new Button("Goto Frame 2");
        b1.setBounds(100,100, 100, 50);
        add(b1);
        b1.addActionListener(new b1Listner(this));
    }
}

class Frame2 extends Frame{
    Frame2(){
        setLayout(null);
        setVisible(true);
        setTitle("Frame 2");
        setSize(500,800);
        Button b2 = new Button("Goto Frame 1");
        b2.setBounds(100,100, 100, 50);
        add(b2);
        b2.addActionListener(new b2Listner(this));
    }
}

class b1Listner implements ActionListener{
    Frame1 f1;
    b1Listner(Frame1 f1){
        this.f1=f1;
    }
    public void actionPerformed(ActionEvent e) {
        f1.dispose();
        new Frame2();
    }
}

class b2Listner implements ActionListener{
    Frame2 f2 ;
    b2Listner(Frame2 f2){
        this.f2=f2;
    }

    public void actionPerformed(ActionEvent e) {
        f2.dispose();
        new Frame1();
    }
}
