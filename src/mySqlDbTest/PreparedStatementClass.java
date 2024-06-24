package mySqlDbTest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PreparedStatementClass {
    public static void main(String[] args) throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        System.out.println("driver Loaded");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb", "root", "root");
        System.out.println("connected");

//      Insert Data by prepared Statement
//        PreparedStatement ps = con.prepareStatement("insert into basic (name, age) values(?,?)");
//        ps.setString(1, "hari");
//        ps.setString(2, "12");

//      Update Data by Prepared Statement
        PreparedStatement ps = con.prepareStatement("update basic set name=?, age=? where sr=?");
        ps.setInt(3, 13);
        ps.setString(1, "namo");
        ps.setString(2, "20");


//      Delete Data  By Prepared Statement
//        PreparedStatement ps = con.prepareStatement("delete from basic where sr=?");
//        ps.setInt(1, 5);

        int i = ps.executeUpdate();
        System.out.println(i);

    }
}
