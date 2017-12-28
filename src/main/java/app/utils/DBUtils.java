package app.utils;


import app.entities.Users;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBUtils {

    public static Users findUser(Connection conn, //
                                 String userName, String password) throws SQLException {

        String sql = "Select a.User_Name, a.Password, a.Gender from User_Account a " //
                + " where a.User_Name = ? and a.password= ?";

        PreparedStatement pstm = conn.prepareStatement(sql);
        pstm.setString(1, userName);
        pstm.setString(2, password);
        ResultSet rs = pstm.executeQuery();

        if (rs.next()) {

            Users users = new Users();
            users.setLogin(userName);
            users.setPassword(password);
            return users;
        }
        return null;
    }

    public static Users findUser(Connection conn, String userName) throws SQLException {

        String sql = "Select a.User_Name, a.Password,  from User_Account a "//
                + " where a.User_Name = ? ";

        PreparedStatement pstm = conn.prepareStatement(sql);
        pstm.setString(1, userName);

        ResultSet rs = pstm.executeQuery();

        if (rs.next()) {
            String password = rs.getString("Password");
            Users users = new Users();
            users.setLogin(userName);
            users.setPassword(password);
            return users;
        }
        return null;
    }


}