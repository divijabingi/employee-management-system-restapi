# Employee Management System Using Spring Boot REST API

## Project Overview
The Employee Management System is a backend web application developed using Spring Boot and REST API architecture. This project is designed to manage employee records efficiently by performing CRUD operations such as adding, updating, viewing, and deleting employee details.

## Features
- Add new employee details
- View employee records
- Update employee information
- Delete employee records
- RESTful API implementation
- Database integration using MySQL
- Layered architecture using Controller, Service, Repository, and Model

## Technologies Used
- Java
- Spring Boot
- Spring Data JPA
- REST API
- MySQL
- Maven
- Eclipse / Spring Tool Suite
- Postman

## Project Structure
- Controller Layer
- Service Layer
- Repository Layer
- Model Layer

## API Testing
The APIs were tested using Postman for performing CRUD operations successfully.

## Sample API Endpoints

| Method | Endpoint | Description |
|--------|-----------|-------------|
| GET | /employees | Get all employees |
| GET | /employees/{id} | Get employee by ID |
| POST | /employees | Add new employee |
| PUT | /employees/{id} | Update employee |
| DELETE | /employees/{id} | Delete employee |

## Database
MySQL database is used to store employee information.

## How to Run the Project
1. Clone the repository
2. Open the project in Eclipse or STS
3. Configure MySQL database in application.properties
4. Run the Spring Boot application
5. Test APIs using Postman

## Author
Divija Bingi
