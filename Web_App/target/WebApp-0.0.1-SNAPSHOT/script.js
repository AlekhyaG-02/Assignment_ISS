// script.js

// Function to validate the login or registration form
function validateForm() {
    // Get the values of username and password input fields
    var username = document.getElementById("username").value;
    var password = document.getElementById("password").value;

    // Get the error message element
    var errorMessage = document.getElementById("error-message");

    // Check if username or password is empty after trimming whitespace
    if (username.trim() === "" || password.trim() === "") {
        // Display an error message if either field is empty
        errorMessage.innerHTML = "Username and password are required.";
        return false; 
    }

    // If both fields are filled, return true to allow form submission
    return true;
}
