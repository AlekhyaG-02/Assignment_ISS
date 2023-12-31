// DbConnectionTest.java
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class dbconnect {
	public static void main(String[] args) {
        testDatabaseConnection();
    }

    public static void testDatabaseConnection() {
        Connection connection = null;

        try {
            // Load the JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish the connection
            String jdbcUrl = "jdbc:mysql://localhost:3306/web_app";
            String jdbcUser = "root";
            String jdbcPassword = "root";
            connection = DriverManager.getConnection(jdbcUrl, jdbcUser, jdbcPassword);

            // Print a success message if the connection is successful
            System.out.println("Database connection successful!");

        } catch (ClassNotFoundException | SQLException e) {
            // Print an error message if there is an exception
            e.printStackTrace();
        } finally {
            // Close the connection in the finally block to ensure it's always closed
            try {
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
