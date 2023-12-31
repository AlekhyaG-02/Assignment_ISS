<!-- register.jsp -->

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <!-- Set the title of the HTML page -->
    <title>Registration</title>
    
    <!-- Include a stylesheet for styling -->
    <link rel="stylesheet" type="text/css" href="style.css">
</head>
<body>
    <!-- Main container for registration -->
    <div id="login-container">
        <!-- Heading for registration section -->
        <h2>Register</h2>
        
        <!-- Form for user registration -->
        <form action="RegisterServlet" method="post" onsubmit="return validateForm()">
            <!-- Input field for choosing a username -->
            <input type="text" id="username" name="username" placeholder="Username" required>
            
            <!-- Input field for choosing a password -->
            <input type="password" id="password" name="password" placeholder="Password" required>
            
            <!-- Submit button for user registration -->
            <button type="submit">Register</button>
        </form>
        
        <!-- Display error message if registration fails -->
        <p id="error-message"></p>
        
        <!-- Link to the login page for existing users -->
        <p>Already have an account? <a href="index.jsp">Login here</a></p>
    </div>
    
    <!-- Include a JavaScript file for client-side validation -->
    <script src="script.js"></script>
</body>
</html>
