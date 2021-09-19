package com.aryan1403.Manage;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class studentDAO {
    public static Boolean insertStudent(Student s) {
        boolean ex = false;
        try {
            // Insert Data to DB
            Connection con = db.createConnection();

            String q = "insert into students(sname, phone, city) values(?,?,?)";

            // Prepared Statement
            PreparedStatement statement = con.prepareStatement(q);
            // Set values of parameters
            statement.setString(1, s.getStudentName());
            statement.setString(2, s.getStudentPhone());
            statement.setString(3, s.getStudentCity());

            // Execute the Query
            statement.execute();
            ex = true;
            return ex;
        } catch (SQLException e) {
            return ex;
        }
    }

    public static Boolean deleteStudent(int userId) {
        boolean ex = false;
        try {
            // Delete Data from DB
            Connection con = db.createConnection();

            String q = "delete from students where sid=?";

            // Prepared Statement
            PreparedStatement statement = con.prepareStatement(q);
            // Set values of parameters
            statement.setInt(1, userId);

            // Execute the Query
            statement.execute();
            ex = true;
            return ex;
        } catch (SQLException e) {
            return ex;
        }
    }

    public static void showAllStudents() {
        try {
            // Show Data from DB
            Connection con = db.createConnection();

            String q = "select * from students";

            // Prepared Statement
            Statement statement = con.createStatement();

            // Execute the Query
            ResultSet resultSet = statement.executeQuery(q);

            while (resultSet.next()) {
                int id = resultSet.getInt(1);
                String name = resultSet.getString(2);
                String phone = resultSet.getString("phone");
                String city = resultSet.getString("city");

                System.out.println("ID : " + id);
                System.out.println("Name : " + name);
                System.out.println("Phone : " + phone);
                System.out.println("City : " + city);
                System.out.println("++++++++++++++++++++++++++++++");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Method for GUI Implementation
    public static List<Student> getAllData() {
        try {
            // Show Data from DB
            Connection con = db.createConnection();

            String q = "select * from students";

            // Prepared Statement
            Statement statement = con.createStatement();

            // Execute the Query
            ResultSet resultSet = statement.executeQuery(q);

            List<Student> list = new ArrayList<>();

            while (resultSet.next()) {
                int id = resultSet.getInt(1);
                String name = resultSet.getString(2);
                String phone = resultSet.getString("phone");
                String city = resultSet.getString("city");

                list.add(new Student(id, name, phone, city)); // Add student to te list
            }
            
            return list;
        } catch (SQLException e) {
            return null;
        }
    }
}
