package mySqlDbTest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class jdbc {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("jar Loaded");
            Connection conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root");
            Statement stmt=conn.createStatement();
            int i=stmt.executeUpdate("insert into student (name) values('Ram'),('Kishan')");
            System.out.println(i);
            System.out.println("connnected");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
