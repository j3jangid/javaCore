package abstractWindowToolkit;

import java.awt.*;

public class AWT2 {
    public static void main(String[] args) {
        new MyFrame();
    }
}
class MyFrame extends java.awt.Frame{
    MyFrame(){
        setTitle("MyFrame");
        setLayout(null);
        setVisible(true);
        setSize(500, 700);
        TextArea ta = new TextArea("");
        ta.setBounds(50, 100, 300, 50);
        add(ta);

    }

}
