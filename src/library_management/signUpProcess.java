package library_management;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.sql.*;
import java.time.LocalDateTime;

import static library_management.CreateUniqueID.cid;

public class signUpProcess extends JFrame {
        signUpProcess() {
            setTitle("Enter Details to Join");
            setLayout(null);
            setSize(570, 550);

            JLabel heading = new JLabel("Start New Journey");
            heading.setBounds(150, 5, 450, 40);
            heading.setFont(new Font("Serif", Font.PLAIN, 35));
            add(heading);

            JLabel fullName = new JLabel("Full Name :");
            fullName.setBounds(50, 90, 100, 30);
            add(fullName);

            JTextField nameInput = new JTextField();
            nameInput.setBounds(200, 90, 300, 30 );
            add(nameInput);

            JLabel mobileNo = new JLabel("Mobile No. :");
            mobileNo.setBounds(50, 140, 100, 30);
            add(mobileNo);

            JTextField mobileNoInput = new JTextField();
            mobileNoInput.setBounds(200, 140, 300, 30);
            add(mobileNoInput);

            JLabel mailId = new JLabel("E-mail :");
            mailId.setBounds(50, 190, 100, 30);
            add(mailId);

            JTextField mailInput = new JTextField();
            mailInput.setBounds(200, 190, 300, 30);
            add(mailInput);

            JLabel userName = new JLabel("User Name :");
            userName.setBounds( 50, 240, 100, 30);
            add(userName);

            JTextField userNameInput = new JTextField();
            userNameInput.setBounds(200, 240, 300, 30);
            add(userNameInput);

            JLabel password = new JLabel("Password :");
            password.setBounds( 50, 290, 100, 30);
            add(password);

            JPasswordField passwordInput = new JPasswordField();
            passwordInput.setBounds(200, 290, 300, 30);
            add(passwordInput);

            JLabel cPassword = new JLabel("Confirm Password :");
            cPassword.setBounds(50, 340, 120, 30);
            add(cPassword);

            JTextField cPasswordInput = new JTextField();
            cPasswordInput.setBounds(200, 340, 300, 30);
            add(cPasswordInput);

            JCheckBox confirm = new JCheckBox("I agree to the Terms of Service and Privacy Policy.");
            confirm.setBounds( 50, 390, 310, 20 );
            confirm.setCursor(new Cursor(Cursor.HAND_CURSOR));
            add(confirm);

            JButton backBtn = new JButton("Back");
            backBtn.setBounds(70, 430, 100, 30);
            backBtn.setCursor(new Cursor(Cursor.HAND_CURSOR));
            add(backBtn);

            JButton clearBtn = new JButton("Clear");
            clearBtn.setBounds(220, 430, 100, 30);
            clearBtn.setCursor(new Cursor(Cursor.HAND_CURSOR));
            add(clearBtn);

            JButton submitBtn = new JButton("Submit");
            submitBtn.setBounds(370, 430, 100, 30);
            submitBtn.setCursor(new Cursor(Cursor.HAND_CURSOR));
            add(submitBtn);

            setVisible(true);
            addWindowListener(new GenericWindowListener(this));

                submitBtn.addActionListener(e -> {
                    String randomID;
                    try {
                        randomID = cid();
                    } catch (Exception ex) {
                        throw new RuntimeException(ex);
                    }

                    String name = nameInput.getText();
                        String mobile = mobileNoInput.getText();
                        String email = mailInput.getText();
                        String uid = randomID;
                        String userName1 = userNameInput.getText();
                        String password1 = passwordInput.getText();
                        String cPassword1 = cPasswordInput.getText();
                        boolean confirmation = confirm.isSelected();

                    if (name.isEmpty()) {
                        JOptionPane.showMessageDialog(signUpProcess.this, "Please Enter Your Name.", "Error", JOptionPane.ERROR_MESSAGE);
                        return;
                    }

                    if (mobile.isEmpty()) {
                        JOptionPane.showMessageDialog(signUpProcess.this, "Please Enter Your Mobile Number.", "Error", JOptionPane.ERROR_MESSAGE);
                        return;
                    }

                    if (email.isEmpty()) {
                        JOptionPane.showMessageDialog(signUpProcess.this, "Please Enter Your Email ID.", "Error", JOptionPane.ERROR_MESSAGE);
                        return;
                    }

                    if (userName1.isEmpty()) {
                        JOptionPane.showMessageDialog(signUpProcess.this, "Please Enter Your User Name.", "Error", JOptionPane.ERROR_MESSAGE);
                        return;
                    }

                    if (password1.isEmpty()) {
                        JOptionPane.showMessageDialog(signUpProcess.this, "Password cannot be blank.", "Error", JOptionPane.ERROR_MESSAGE);
                        return;
                    }

                    if (cPassword1.isEmpty()) {
                        JOptionPane.showMessageDialog(signUpProcess.this, "Please Confirm Your Password.", "Error", JOptionPane.ERROR_MESSAGE);
                        return;
                    }

                    if (!password1.equals(cPassword1)) {
                        JOptionPane.showMessageDialog(signUpProcess.this, "Please Correct Your Confirm Password.", "Error", JOptionPane.ERROR_MESSAGE);
                        return;
                    }

                        if (confirmation){
                            confirm.setBackground(null);
                                try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/librarymanagmentpro", "root", "root")) {
                                        PreparedStatement addData = con.prepareStatement("INSERT INTO userdetails (fullName, mobileNo, emailID, orgID, userName, adminUser, password, cPassword, confirmation, dateTime) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
                                        addData.setString(1, name);
                                        addData.setString(2, mobile);
                                        addData.setString(3, email);
                                        addData.setString(4, uid);
                                        addData.setString(5, userName1);
                                        addData.setString(6, "sa");
                                        addData.setString(7, password1);
                                        addData.setString(8, cPassword1);
                                        addData.setBoolean(9, confirmation);
                                        LocalDateTime currentDateTime = LocalDateTime.now();
                                        addData.setString(10, String.valueOf(currentDateTime));
                                        int i = addData.executeUpdate();
                                        dispose();
                                        new signUpSuccess(userName1, uid, password1);

                                } catch (SQLException ex) { ex.printStackTrace();} catch (Exception ex) {
                                    throw new RuntimeException(ex);
                                }
                        }else {
                            confirm.setBackground(Color.red);
                        }
                });

                ActionListener clearSignupForm = e -> {
                    nameInput.setText("");
                    mobileNoInput.setText("");
                    mailInput.setText("");
                    userNameInput.setText("");
                    passwordInput.setText("");
                    cPasswordInput.setText("");
                    confirm.setSelected(false);
                };
            clearBtn.addActionListener(clearSignupForm);

                ActionListener signuptoindex = e -> {
                    dispose();
                    new adminUserFrame();
                };
                backBtn.addActionListener(signuptoindex);

        }
    }




