package testSets;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.sql.*;

public class Form {
    public static void main(String[] args){
        Frame f = new Frame();
        f.setTitle("Form");
        f.setVisible(true);
        f.setLayout(null);
        f.setSize(500, 600);
        f.setBackground(Color.yellow);

        Label nameLable = new Label("Name :");
        nameLable.setBounds(50, 50, 100, 30 );
        f.add(nameLable);

        TextField nameField = new TextField();
        nameField.setBounds( 150, 50, 200, 30);
        f.add(nameField);

        Label mailLable = new Label("E-Mail :");
        mailLable.setBounds(50, 100, 100, 30);
        f.add(mailLable);

        TextField mailField = new TextField();
        mailField.setBounds(150, 100, 200, 30);
        f.add(mailField);

        Label mobileLable = new Label("Mobile No. :");
        mobileLable.setBounds(50, 150, 100, 30);
        f.add(mobileLable);

        TextField mobileField = new TextField();
        mobileField.setBounds(150, 150, 200, 30);
        f.add(mobileField);

        Label addLable = new Label("Address :");
        addLable. setBounds(50, 200, 100, 30);
        f.add(addLable);

        TextArea addArea = new TextArea();
        addArea.setBounds(50, 230, 300, 60 );
        f.add(addArea);

        Checkbox confirm = new Checkbox("I agree to the Terms of Service and Privacy Policy.");
        confirm.setBounds(50, 300 ,300, 15);
        f.add(confirm);

        Button submitBtn = new Button("Submit");
        submitBtn.setBounds(50, 325, 300, 30);
        f.add(submitBtn);

        WindowListener w = new WindowListener() {
            public void windowOpened(WindowEvent e) {System.out.println("windowOpened"); }

            public void windowClosing(WindowEvent e) {
                System.out.println("windowClosing");
                f.dispose();
            }

            public void windowClosed(WindowEvent e) {
                System.out.println("windowClosed");
            }

            public void windowIconified(WindowEvent e) {
                System.out.println("windowIconified");
            }

            public void windowDeiconified(WindowEvent e) {
                System.out.println("windowDeiconified");
            }

            public void windowActivated(WindowEvent e) {
                System.out.println("windowActivated");
            }

            public void windowDeactivated(WindowEvent e) {
                System.out.println("windowDeactivated");
            }
        };
        f.addWindowListener(w);

        ActionListener al = new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String name = nameField.getText();
                String email = mailField.getText();
                String mobile = mobileField.getText();
                String address = addArea.getText();
                boolean confirmed = confirm.getState();

                System.out.println(name + ", " + email + ", " + mobile + ", " + address + ", " + confirmed);

                try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/form", "root", "root")) {
                    try (PreparedStatement addData = con.prepareStatement("insert into formtest1 (name, email, mobile, address, confirmed) values(?,?,?,?,?)")) {
                        addData.setString(1, name);
                        addData.setString(2, email);
                        addData.setString(3, mobile);
                        addData.setString(4, address);
                        addData.setBoolean(5, confirmed);
                        int i = addData.executeUpdate();
                        System.out.println(i);
                    } catch (SQLException ex) {
                        ex.printStackTrace();
                    }
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
        };
        submitBtn.addActionListener(al);

    }
}
