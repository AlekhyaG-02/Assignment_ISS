var school = {
  "students": {
    "john": {
      "name": "John",
      "age": 15,
      "grade": "10th"
    },
    "emma": {
      "name": "Emma",
      "age": 14,
      "grade": "9th"
    }
  },
  "teachers": {
    "mrSmith": {
      "name": "Mr. Smith",
      "subject": "Math"
    },
    "msJones": {
      "name": "Ms. Jones",
      "subject": "English"
    }
  }
};

// Accessing nested JSON objects
console.log("John's Grade: " + school.students.john.grade);
console.log("Ms. Jones teaches: " + school.teachers.msJones.subject);
