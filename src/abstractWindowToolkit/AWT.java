package abstractWindowToolkit;
import java.awt.*;

public class AWT {
    public static void main(String[] args) {
        Frame f = new Frame();
        f.setTitle("My First AWT App");
        f.setVisible(true);
        f.setLayout(null);
        f.setSize(800,500);

        Button b = new Button("Click Me");
        b.setBounds(50, 50, 200, 50);
        f.add(b);

        TextArea ta = new TextArea("Text Area");
        ta.setBounds(50, 150, 400, 200);
        f.add(ta);

        Checkbox cb = new Checkbox("Check Me");
        cb.setBounds(50, 400, 80, 80);
        f.add(cb);

        TextField tf = new TextField("Text Field");
        tf.setBounds(50, 500, 200, 100);
        tf.setBackground(Color.red);
        f.add(tf);






    }
}
