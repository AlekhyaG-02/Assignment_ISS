// RegisterServlet.java
//import javax.servlet.*;
//import javax.servlet.http.*;

//import jakarta.servlet.annotation.WebServlet;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

import java.io.*;
import java.sql.*;

@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	// JDBC database connection details
    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/web_app";
    private static final String JDBC_USER = "root";
    private static final String JDBC_PASSWORD = "root";

    // Handle POST requests for user registration
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        // Get username and password from the request parameters
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        try {
            // Establish a database connection
            Connection connection = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD);

            // Prepare a SQL query to insert a new user into the database
            PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO users (username, password) VALUES (?, ?)");
            preparedStatement.setString(1, username);
            preparedStatement.setString(2, password);

            // Execute the query and get the number of rows affected
            int rowsAffected = preparedStatement.executeUpdate();

            // Check if registration was successful
            if (rowsAffected > 0) {
                // If successful, redirect to the login page
            	response.sendRedirect(request.getContextPath() + "/index.jsp");
            } else {
                // If not successful, set an error attribute and forward to the registration page
                request.setAttribute("error", "Registration failed");
                RequestDispatcher rd = request.getRequestDispatcher("register.jsp");
                rd.forward(request, response);
            }

            // Close database resources
            preparedStatement.close();
            connection.close();
        } catch (SQLException e) {
            // Handle database connection errors
            e.printStackTrace();
        }
    }
}
