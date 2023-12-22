package com.connect.db;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class Callable_Statement {
    public static void main(String[] args) {
        // JDBC URL, username, and password
        String url = "jdbc:mysql://localhost:3306/StudentData";
        String user = "root";
        String password = "root";

        try (Connection connection = DriverManager.getConnection(url, user, password)) {
            // Prepare the CallableStatement with the stored procedure
            CallableStatement callableStatement = connection.prepareCall("{call GetStudentsByAge(?)}");

            // Set the input parameter
            callableStatement.setInt(1, 22); // Example age value

            // Execute the stored procedure
            ResultSet resultSet = callableStatement.executeQuery();

            // Process the result set
            while (resultSet.next()) {
                int studentID = resultSet.getInt("StudentID");
                String name = resultSet.getString("Name");
                int age = resultSet.getInt("Age");
                String address = resultSet.getString("Address");
                double gpa = resultSet.getDouble("GPA");

                // Process the retrieved data as needed
                System.out.println("Student ID: " + studentID + ", Name: " + name + ", Age: " + age +
                        ", Address: " + address + ", GPA: " + gpa);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
