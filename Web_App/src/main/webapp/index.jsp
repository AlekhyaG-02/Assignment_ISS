<!-- index.jsp -->

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <!-- Set the title of the HTML page -->
    <title>Login and Registration</title>
    
    <!-- Include a stylesheet for styling -->
    <link rel="stylesheet" type="text/css" href="style.css">
</head>
<body>
    <!-- Main container for login and registration -->
    <div id="login-container">
        <!-- Heading for login/registration section -->
        <h2>Go into your account!</h2>
        
        <!-- Form for user login -->
        <form action="LoginServlet" method="post" onsubmit="return validateForm()">
            <!-- Input field for username -->
            <input type="text" id="username" name="username" placeholder="Username" required>
            
            <!-- Input field for password -->
            <input type="password" id="password" name="password" placeholder="Password" required>
            
            <!-- Submit button for login -->
            <button type="submit">Login</button>
        </form>
        
        <!-- Display error message if login fails -->
        <p id="error-message"></p>
        
        <!-- Link to registration page -->
        <p>Don't have an account? <a href="register.jsp">Register here</a></p>
    </div>
    
    <!-- Include a JavaScript file for client-side validation -->
    <script src="script.js"></script>
</body>
</html>
