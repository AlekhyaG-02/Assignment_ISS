// LogoutServlet.java
//import javax.servlet.*;
//import javax.servlet.http.*;

//import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.*;
import jakarta.servlet.http.*;


import java.io.*;

//@WebServlet("/LogoutServlet")
public class LogoutServlet extends HttpServlet {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	// Handle POST requests for user logout
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        // Retrieve the existing session (if any)
        HttpSession session = request.getSession(false);

        // Invalidate the session if it exists
        if (session != null) {
            session.invalidate();
        }

        // Redirect the user to the login page after logout
        response.sendRedirect("index.jsp");
    }
}