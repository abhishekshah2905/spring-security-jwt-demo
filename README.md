# JWT Spring Security Demo

This is a demo Spring Boot application that showcases how to implement JSON Web Token (JWT) authentication using Spring Security.

## Overview
The application demonstrates how to secure endpoints, authenticate users using JWT, and manage user roles and permissions. It provides a foundation for implementing secure authentication in Spring Boot applications.

## Getting Started

### Features
- User authentication with JWT
- Role-based access control
- RESTful API endpoints
- In-memory user and role data
- Token generation and validation

### Prerequisites
- Java JDK 8 or higher
- Maven

### Installation
1. Clone the repository:
```bash
  git clone https://github.com/abhishekshah2905/spring-security-jwt-demo.git
```
2. Navigate to the project directory:
```bash
  cd spring-security-jwt-demo
```
3. Build the project:
```bash
  mvn clean install
```
4. Run the application:
```bash
  mvn spring-boot:run
```
5. Access the application at http://localhost:8080

### Usage
- '/protected': A protected endpoint that requires the user to have the ROLE_ADMIN role.
- '/users': An endpoint for retrieving user data.
