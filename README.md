# Student Result Management System

A REST API based Student Result Management System built with Spring Boot, Hibernate, PostgreSQL, and Maven.

## Technologies Used
- Java 21
- Spring Boot 3.5.14
- Hibernate (JPA)
- PostgreSQL
- Maven
- Postman (for API testing)

## Features
- Add and manage students
- Add and manage results linked to students
- Fetch results by student ID
- RESTful API architecture

## API Endpoints

### Student APIs
| Method | Endpoint | Description |
|--------|----------|-------------|
| GET | /api/students | Get all students |
| GET | /api/students/{id} | Get student by ID |
| POST | /api/students | Add a new student |
| PUT | /api/students/{id} | Update a student |
| DELETE | /api/students/{id} | Delete a student |

### Result APIs
| Method | Endpoint | Description |
|--------|----------|-------------|
| GET | /api/results | Get all results |
| GET | /api/results/student/{id} | Get results by student ID |
| POST | /api/results | Add a new result |
| DELETE | /api/results/{id} | Delete a result |

## Setup Instructions
1. Clone the repository
2. Create a PostgreSQL database named `student_db`
3. Update `application.properties` with your PostgreSQL credentials
4. Run the application using Maven
5. Test APIs using Postman
