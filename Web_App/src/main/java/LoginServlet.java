// LoginServlet.java
//import javax.servlet.*;
//import javax.servlet.http.*;

//import jakarta.servlet.annotation.WebServlet;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

import java.io.*;
import java.sql.*;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	// JDBC database connection details
    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/web_app";
    private static final String JDBC_USER = "root";
    private static final String JDBC_PASSWORD = "root";

    // Handle POST requests for login
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        // Get username and password from the request parameters
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        try {
            // Establish a database connection
            Connection connection = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD);

            // Prepare a SQL query to check username and password
            PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM users WHERE username=? AND password=?");
            preparedStatement.setString(1, username);
            preparedStatement.setString(2, password);

            // Execute the query
            ResultSet resultSet = preparedStatement.executeQuery();

            // Check if a matching user is found
            if (resultSet.next()) {
                // If found, create a session and redirect to the welcome page
            	
            	// Use logging to debug
                System.out.println("User authenticated. Redirecting to welcome.jsp");
            	
                HttpSession session = request.getSession();
                session.setAttribute("username", username);
                response.sendRedirect("welcome.jsp");
                RequestDispatcher rd = request.getRequestDispatcher("welcome.jsp");
                rd.forward(request, response);
            } else {
                // If not found, set an error attribute and redirect to the login page
                request.setAttribute("error", "Invalid username or password");
                response.sendRedirect("index.jsp");
                RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
                rd.forward(request, response);
            }

            // Close database resources
            resultSet.close();
            preparedStatement.close();
            connection.close();
        } catch (SQLException e) {
            // Handle database connection errors
            e.printStackTrace();
        }
    }
}
