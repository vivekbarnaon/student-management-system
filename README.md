# Java Practice Project

A comprehensive Java learning project featuring database operations, servlet-based web applications, and CRUD operations for student management.

## Project Overview

This project contains multiple Java applications demonstrating:
- **JDBC Database Operations**: Insert, search, update, and delete student records
- **Servlet Web Applications**: Login authentication system with HTTP servlet
- **SQL Integration**: MySQL database connectivity for persistent data storage

## Project Structure

```
JavaPractice/
├── InsertStudent.java          # Insert student records into database
├── SearchStudent.java          # Search for student records by name
├── UpdateStudent.java          # Update existing student records
├── DeleteStudent.java          # Delete student records
├── DisplayStudent.java         # Display all student records
├── Project/                    # Web servlet project
│   ├── src/
│   │   └── LoginServlet.java   # Authentication servlet
│   └── web/
│       ├── index.html          # Login form
│       └── WEB-INF/
│           └── web.xml         # Web configuration
├── web/                        # Web resources
│   ├── src/
│   │   └── Main.java           # Main application
│   ├── index.html              # Login interface
│   └── WEB-INF/
│       └── web.xml
└── mysql-connector-j-9.7.0.jar # MySQL JDBC Driver
```

## Features

### Student Management System
- **Insert**: Add new student records with ID, name, and marks
- **Search**: Find students by name with result display
- **Update**: Modify existing student information
- **Delete**: Remove student records
- **Display**: View all student records in database

### Web Application
- Login servlet with basic authentication
- HTML form interface for user input
- Credentials validation (hardcoded for demo)

## Prerequisites

- Java 8 or higher
- MySQL Database
- MySQL JDBC Connector (included: `mysql-connector-j-9.7.0.jar`)
- Apache Tomcat (for servlet deployment)

## Database Setup

Create a MySQL database with the following schema:

```sql
CREATE DATABASE school;

USE school;

CREATE TABLE Student (
    id INT PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    marks INT
);
```

## Configuration

Update database credentials in each Java file before running the application.

## Usage

### Running JDBC Operations

```bash
# Compile
javac -cp mysql-connector-j-9.7.0.jar InsertStudent.java

# Run
java -cp .:mysql-connector-j-9.7.0.jar InsertStudent
java -cp .:mysql-connector-j-9.7.0.jar SearchStudent
java -cp .:mysql-connector-j-9.7.0.jar UpdateStudent
java -cp .:mysql-connector-j-9.7.0.jar DeleteStudent
java -cp .:mysql-connector-j-9.7.0.jar DisplayStudent
```

### Deploying Web Application

1. Package the servlet project as WAR file
2. Deploy to Apache Tomcat
3. Access via: `http://localhost:8080/project/login`

## Technologies Used

- **Language**: Java
- **Database**: MySQL
- **Framework**: Apache Servlet
- **JDBC**: MySQL Connector/J 9.7.0
- **Build Tool**: Manual compilation

## Learning Outcomes

- JDBC database connectivity
- SQL query execution
- Prepared statements for security
- Exception handling
- Servlet development
- Form submission and validation
- HTTP protocol basics

## Notes

- This is a learning project with hardcoded credentials for demonstration
- For production use, implement proper authentication and configuration management
- Consider using ORM frameworks like Hibernate for larger projects

## Future Enhancements

- Implement MVC pattern
- Add JSP pages for better UI
- Use connection pooling
- Implement role-based access control
- Add input validation and sanitization
- Use configuration files instead of hardcoded values


