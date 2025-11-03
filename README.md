# Student Management System

This is a Spring Boot application for managing student records.

## Prerequisites

- Java 11 or higher
- MySQL 8.0 or higher
- Maven

## Database Setup

The application is configured to automatically create the database and tables when it starts. However, you need to ensure that:

1. MySQL service is running
2. The MySQL user credentials in `application.properties` are correct:
   - Username: root
   - Password: WJ28@krhps (or update to match your MySQL password)

### Starting MySQL Service

#### Windows
```
net start MySQL80
```
(Run as administrator if you get a permission denied error)

#### Linux/Mac
```
sudo systemctl start mysql
```

## Running the Application

1. Clone the repository
2. Navigate to the project directory
3. Run the application using Maven:
```
mvn spring-boot:run
```

## Troubleshooting

### "No database selected" Error

If you encounter a "No database selected" error, it means the application is trying to connect to MySQL but the database doesn't exist yet. This should be automatically resolved by:

1. The `schema.sql` file which creates the database if it doesn't exist
2. The updated `application.properties` which connects to MySQL without specifying a database initially

If the error persists, you can manually create the database:

```sql
CREATE DATABASE IF NOT EXISTS studentdb;
```

### Connection Issues

If you have connection issues:
1. Verify MySQL is running
2. Check that the password in `application.properties` matches your MySQL root password
3. Ensure port 3306 is not blocked by a firewall

## API Endpoints

- GET `/students/all` - Get all students
- GET `/students/count` - Get total number of students
- GET `/students/byYear` - Get student count by birth year
- POST `/students/save` - Add a new student
- DELETE `/students/delete/{id}` - Delete a student by ID