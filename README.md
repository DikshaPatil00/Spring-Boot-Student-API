# Spring-Boot-Student-API
A modern, lightweight RESTful Web Service built using Spring Boot. This project demonstrates the implementation of a full-stack backend architecture, including Entity modeling and Controller-based request handling for student data.

# Features
* RESTful Architecture: Uses Spring Web to handle HTTP requests (GET, POST).
* Entity Mapping: Structured data modeling with a Student entity (ID, Marks, Name, Roll Number).
* Automated JSON Handling: Automatic conversion between Java Objects and JSON for easy frontend integration.
* Scalable Structure: Follows the industry-standard package structure (Entity -> Controller -> Application).

# Tech Used
* Framework: Spring Boot 3.x
* Language: Java 17
* Build Tool: Maven
* API Testing: Postman / Browser

# Overview
* com.web.entity: Contains the Student POJO with Getters, Setters, and toString().
* com.web.controller: Handles incoming web requests and data processing.
* FirstSpringBootProjectApplication: The main entry point that launches the embedded Tomcat server.
