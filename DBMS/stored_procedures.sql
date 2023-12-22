-- Create a new database
CREATE DATABASE StudentData;

-- Switch to the new database
USE StudentData;

-- Create a Students table
CREATE TABLE IF NOT EXISTS Students (
    StudentID INT PRIMARY KEY,
    Name VARCHAR(50) NOT NULL,
    Age INT,
    Address VARCHAR(100),
    GPA DECIMAL(3, 2)
);

-- Insert data
INSERT INTO Students (StudentID, Name, Age, Address, GPA)
VALUES
    (1, 'John Doe', 20, '123 Main St', 3.5),
    (2, 'Jane Smith', 22, '456 Oak Ave', 3.8),
    (3, 'Bob Johnson', 21, '789 Pine Blvd', 3.2),
    (4, 'Alice Brown', 19, '101 Elm St', 3.9),
    (5, 'Charlie White', 23, '202 Maple Dr', 3.4);

-- Create a stored procedure
DELIMITER //

CREATE PROCEDURE GetStudentsByAge(IN StudentAge INT)
BEGIN
    SELECT * FROM Students WHERE Age = StudentAge;
END //

DELIMITER ;

-- Call the stored procedure with input parameter 22
CALL GetStudentsByAge(22);
