package testSets;

import java.sql.*;

public class Jdbc {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("loaded");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb", "root", "root");
            System.out.println("Connected");
            Statement stat = con.createStatement();

//            to Insert Data
//            int i = stat.executeUpdate("insert into basic (name, age) values('j3', 15),('kamal', 12),('dan', 20),('Lucifer',25)");

//           to Update Data
//            int i = stat.executeUpdate("update basic set name='Don', age=22 where sr=3 ");

//             to Delete Data
//            int i = stat.executeUpdate("delete from basic where sr=8");
//            System.out.println(i);

//            to Get Data Form DB
            ResultSet res = stat.executeQuery("select * from basic");
            while (res.next()){
                System.out.print(res.getInt(1)+" - ");
                System.out.print(res.getString(2)+" - ");
                System.out.print(res.getString(3));
                System.out.println("");
            }

        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}
