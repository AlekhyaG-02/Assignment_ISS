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

    // Check if password has a minimum length of 9 characters
    if (password.length < 9) {
        // Display an error message if the password is too short
        errorMessage.innerHTML = "Password should be at least 9 characters long.";
        return false;
    }

    // Check if the username contains only alphanumeric characters
    var alphanumericRegex = /^[a-zA-Z0-9]+$/;
    if (!alphanumericRegex.test(username)) {
        // Display an error message if the username contains invalid characters
        errorMessage.innerHTML = "Username should contain only letters and numbers.";
        return false;
    }

    // If all validations pass, return true to allow form submission
    return true;
}
