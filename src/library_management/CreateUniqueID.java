package library_management;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class CreateUniqueID {
    public static String cid() throws Exception {
        String randomId;
        while (true) {
            randomId = String.valueOf(ranNum());
            if (!checkUniqeId(randomId)) {
                break;
            }
        }
        return randomId;
//        System.out.println(randomId);
    }

    public static boolean checkUniqeId(String randomId) throws Exception {
        boolean flag = false;
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/librarymanagmentpro", "root", "root");
        PreparedStatement ps = con.prepareStatement("SELECT * FROM userdetails where orgID=?");
        ps.setString(1, randomId);
        ResultSet rs = ps.executeQuery();
        flag = rs.next();
        con.close();
        return flag;
    }

    public static int ranNum() {
        double x = Math.floor(Math.random() * 90000) + 10000;
        int y = (int) (x);
        return y;
    }
}
