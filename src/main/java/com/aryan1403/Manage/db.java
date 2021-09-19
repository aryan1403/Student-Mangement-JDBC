package com.aryan1403.Manage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class db {
    public static Connection createConnection() {
        try {
            // load the Driver
            // Class.forName("com.mysql.jdbc.Driver");
            Class.forName("com.mysql.cj.jdbc.Driver");
            // Create the connection
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student_manage", "root", "12345");
            return con;
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
