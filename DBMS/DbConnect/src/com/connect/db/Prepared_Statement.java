package com.connect.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Prepared_Statement {
    public static void main(String[] args) {
        // JDBC URL, username, and password
        String url = "jdbc:mysql://localhost:3306/StudentData";
        String user = "root";
        String password = "root";

        try (Connection connection = DriverManager.getConnection(url, user, password)) {
            // Prepare the PreparedStatement with a parameterized query
            String sql = "SELECT * FROM Students WHERE Age = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);

            // Set the parameter
            preparedStatement.setInt(1, 22); // Example age value

            // Execute the query
            ResultSet resultSet = preparedStatement.executeQuery();

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
