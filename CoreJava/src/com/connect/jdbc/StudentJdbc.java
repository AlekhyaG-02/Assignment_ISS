package com.connect.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class StudentJdbc {

    // JDBC URL, username, and password of MySQL server
    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/jdbc";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "root";

    public static void main(String[] args) {
        try {
            // Load the JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish a connection
            try (Connection connection = DriverManager.getConnection(JDBC_URL, USERNAME, PASSWORD)) {

                // Create a statement
                try (Statement statement = connection.createStatement()) {

                    // CREATE (INSERT)
                    String insertSql = "INSERT INTO studentsdb (name, age) VALUES (?, ?)";
                    try (PreparedStatement insertStatement = connection.prepareStatement(insertSql)) {
                        insertStatement.setString(1, "John");
                        insertStatement.setInt(2, 25);
                        int rowsInserted = insertStatement.executeUpdate();
                        System.out.println(rowsInserted + " row(s) inserted.");
                    }

                    // READ (SELECT)
                    String selectSql = "SELECT * FROM studentsdb";
                    try (ResultSet resultSet = statement.executeQuery(selectSql)) {
                        while (resultSet.next()) {
                            int id = resultSet.getInt("id");
                            String name = resultSet.getString("name");
                            int age = resultSet.getInt("age");
                            System.out.println("ID: " + id + ", Name: " + name + ", Age: " + age);
                        }
                    }

                    // UPDATE
                    String updateSql = "UPDATE studentsdb SET age = ? WHERE name = ?";
                    try (PreparedStatement updateStatement = connection.prepareStatement(updateSql)) {
                        updateStatement.setInt(1, 26);
                        updateStatement.setString(2, "John");
                        int rowsUpdated = updateStatement.executeUpdate();
                        System.out.println(rowsUpdated + " row(s) updated.");
                    }

                    // DELETE
                    String deleteSql = "DELETE FROM studentsdb WHERE name = ?";
                    try (PreparedStatement deleteStatement = connection.prepareStatement(deleteSql)) {
                        deleteStatement.setString(1, "John");
                        int rowsDeleted = deleteStatement.executeUpdate();
                        System.out.println(rowsDeleted + " row(s) deleted.");
                    }
                }
            }

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
}
