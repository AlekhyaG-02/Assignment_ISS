-- create a new database
CREATE DATABASE studentDB; 

-- use the exisiting student database
USE studentDB;

-- create a new table in the student database
CREATE TABLE IF NOT EXISTS STUDENTS (
   STUDENT_ID  INT NOT NULL,
   NAME        VARCHAR(50) NOT NULL,
   AGE         INT NOT NULL,
   ADDRESS     VARCHAR(100),
   GPA         DECIMAL(3, 2),
   PRIMARY KEY (STUDENT_ID)
);

-- Insert 5 rows of data into the table
INSERT INTO STUDENTS (STUDENT_ID, NAME, AGE, ADDRESS, GPA)
VALUES
   (1, 'John Doe', 20, '123 Main St', 3.5),
   (2, 'Jane Smith', 22, '456 Oak Ave', 3.8),
   (3, 'Bob Johnson', 21, '789 Pine Blvd', 3.2),
   (4, 'Alice Brown', 19, '101 Elm St', 3.9),
   (5, 'Charlie White', 23, '202 Maple Dr', 3.4);

-- Select Everything from the table
SELECT * FROM STUDENTS;

-- Select Specific Columns from the table
SELECT STUDENT_ID, NAME, GPA FROM STUDENTS;

-- Insert additional data
INSERT INTO STUDENTS (STUDENT_ID, NAME, AGE, ADDRESS, GPA)
VALUES
   (6, 'David Green', 24, '303 Oak Ave', 3.1),
   (7, 'Eva Black', 20, '404 Pine Blvd', 3.7),
   (8, 'Frank Red', 22, '505 Elm St', 3.6),
   (9, 'Grace Blue', 21, '606 Maple Dr', 3.3),
   (10, 'Henry Yellow', 23, '707 Cedar Ln', 3.5);

SELECT GPA FROM STUDENTS ORDER BY GPA;

-- Use DISTINCT clause to retrieve unique GPA values
SELECT DISTINCT GPA FROM STUDENTS;

-- Use WHERE clause to filter students with GPA greater than 3.5
SELECT NAME
FROM STUDENTS
WHERE GPA > 3.5;

-- Update GPA for student with STUDENT_ID = 2
UPDATE STUDENTS
SET GPA = 4.0
WHERE STUDENT_ID = 2;

-- Increment AGE for all students by 1
UPDATE STUDENTS
SET AGE = AGE + 1;

-- Select all students and order them by GPA in descending order
SELECT * FROM STUDENTS
ORDER BY GPA DESC;

-- Delete students with a GPA less than 3.0
SET SQL_SAFE_UPDATES = 0;

DELETE FROM STUDENTS
WHERE GPA < 3.2;

-- Select the top 3 students with the highest GPA in MySQL
SELECT * FROM STUDENTS
ORDER BY GPA DESC
LIMIT 3;

-- Select students whose names start with 'J'
SELECT * FROM STUDENTS
WHERE NAME LIKE 'J%';

-- Select students with specific IDs
SELECT * FROM STUDENTS
WHERE STUDENT_ID IN (1, 3, 5);

-- Select students with an age between 20 and 25
SELECT * FROM STUDENTS
WHERE AGE BETWEEN 20 AND 25;

-- Select student names and their GPAs using aliases
SELECT NAME AS StudentName, GPA AS GradePointAverage
FROM STUDENTS;

-- Create another table which is courses
CREATE TABLE COURSES (
   COURSE_ID INT NOT NULL,
   COURSE_NAME VARCHAR(50) NOT NULL,
   PRIMARY KEY (COURSE_ID)
);

-- Insert data into the COURSES table
INSERT INTO COURSES (COURSE_ID, COURSE_NAME)
VALUES (1, 'Math'), (2, 'English'), (3, 'History');

-- Inner Join to get students and their courses
SELECT STUDENTS.NAME, COURSES.COURSE_NAME
FROM STUDENTS
INNER JOIN COURSES ON STUDENTS.STUDENT_ID = COURSES.COURSE_ID;

-- Left Join to get all students and their courses (even if they don't have a course)
SELECT STUDENTS.NAME, COURSES.COURSE_NAME
FROM STUDENTS
LEFT JOIN COURSES ON STUDENTS.STUDENT_ID = COURSES.COURSE_ID;

-- Right Join to get all courses and the students who have taken them (even if no student has taken a course)
SELECT STUDENTS.NAME, COURSES.COURSE_NAME
FROM STUDENTS
RIGHT JOIN COURSES ON STUDENTS.STUDENT_ID = COURSES.COURSE_ID;

-- Combine results using UNION of LEFT JOIN and RIGHT JOIN
SELECT STUDENTS.NAME AS StudentName, COURSES.COURSE_NAME
FROM STUDENTS
LEFT JOIN COURSES ON STUDENTS.STUDENT_ID = COURSES.COURSE_ID

UNION

SELECT STUDENTS.NAME AS StudentName, COURSES.COURSE_NAME
FROM STUDENTS
RIGHT JOIN COURSES ON STUDENTS.STUDENT_ID = COURSES.COURSE_ID
WHERE STUDENTS.STUDENT_ID IS NULL;

-- Create a new table STUDENT_DETAILS based on selected columns from STUDENTS
CREATE TABLE STUDENT_DETAILS AS
SELECT STUDENT_ID, NAME, AGE
FROM STUDENTS;

-- Insert some data with NULL values
INSERT INTO STUDENTS ()
VALUES
   (14, 'Sam Grey', 21, NULL, 3.8),
   (15, 'Mia Black', 22, '807 Eienstein Street', NULL);

-- Group students by age and calculate the average GPA for each group
SELECT AGE, AVG(GPA) AS AvgGPA
FROM STUDENTS
GROUP BY AGE
HAVING AVG(GPA) IS NOT NULL;

-- Create a new database
CREATE DATABASE UniversityDB;

-- Switch to the new database
USE UniversityDB;

-- Create a new table with constraints
CREATE TABLE STUDENT_DETAILS (
   STUDENT_ID INT PRIMARY KEY,
   FULL_NAME VARCHAR(100) NOT NULL,
   BIRTH_DATE DATE,
   CONSTRAINT UQ_FULL_NAME UNIQUE (FULL_NAME)
);

-- Add a CHECK constraint
ALTER TABLE STUDENT_DETAILS
ADD CONSTRAINT CHK_BIRTH_DATE CHECK (BIRTH_DATE >= '1900-01-01');

-- Add a default value for BIRTH_DATE
ALTER TABLE STUDENT_DETAILS
ALTER COLUMN BIRTH_DATE SET DEFAULT '2000-01-01';

