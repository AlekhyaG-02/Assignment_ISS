<!-- welcome.jsp -->

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <!-- Set the title of the HTML page -->
    <title>Welcome</title>
    
    <!-- Include a stylesheet for styling -->
    <link rel="stylesheet" type="text/css" href="style.css">
</head>
<body>
    <!-- Main container for the welcome page -->
    <div id="welcome-container">
        <!-- Heading with a dynamic welcome message using JSP expression -->
        <h2>Welcome, <%= request.getAttribute("username") %></h2>
        
        <!-- Form for user logout -->
        <form action="LogoutServlet" method="post">
            <!-- Button to submit the logout form -->
            <button type="submit">Logout</button>
        </form>
    </div>
</body>
</html>
