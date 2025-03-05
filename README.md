# Greetings

## Overview
This project is a simple Spring Boot application that demonstrates the creation of RESTful endpoints, path variables, and query parameters. It is part of the **IT3030 – PAF: Extension for Practical Session 3** exercise, where we implement and extend a basic REST endpoint to return personalized greeting messages.

## Objective
The purpose of this project is to:
1. Understand and implement the use of **REST endpoints** in a Spring Boot application.
2. Work with **path variables** and **query parameters** to customize the behavior of an endpoint.
3. Test the application using tools like Postman or a browser.

## Steps and Implementation

### 1. Create a Basic Greeting Endpoint
The initial exercise is to create a simple REST endpoint `/greet` that returns a basic greeting message:

- **Endpoint:** `/greet`
- **Response:** `"Welcome to Spring Boot!"`

### 2. Add Path Variable for Personalized Greeting
The second part of the exercise is to modify the `/greet` endpoint to accept a **path variable** for a personalized greeting. For example, if the user accesses:

http://localhost:8080/greet/John
The response will be: Hello John! Welcome to Spring Boot!


### 3. Add Optional Query Parameter
In the final step, we extended the `/greet` endpoint to accept an **optional query parameter** for adding a custom message. For example:

http://localhost:8080/greet/John?message=Good to see you!

The response will be: Hello John! Good to see you!


### 4. Testing the Endpoint
You can test the application in two ways:
1. **Using a browser**: Open your browser and visit the appropriate URLs (e.g., `http://localhost:8080/greet/John?message=Good to see you!`).
2. **Using Postman**: Send GET requests to the same URLs to see the responses.

## Technologies Used
- **Spring Boot**: A framework to create stand-alone, production-grade Spring-based applications.
- **Maven**: Used for dependency management and building the application.


