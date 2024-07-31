package library_management;

import java.sql.*;

public class UserVarify {
    public static String[] validateUser(String oid, String userName, String password) throws SQLException {
        String[] status = {};
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/librarymanagmentpro", "root", "root");
        PreparedStatement search = con.prepareStatement("SELECT * FROM userdetails");
        ResultSet check = search.executeQuery();
        while (check.next()){
            if(check.getString(5).equals(oid)){
                if (check.getString(6).equals(userName)){
                    if (check.getString(8).equals(password)){
                        status = new String[]{"passed", oid, userName, password};
                        break;
                    }else{
                        status = new String[]{"incorrectPassword", oid, userName, password};
                    }
                }else {
                    status = new String[]{"incorrectIdUserName", oid, userName, password};
                }
            }else {
                status = new String[]{"incorrectIdUserName", oid, userName, password};
            }
        }
        return status;
    }
}
