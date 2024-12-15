# User Login System with JWT and Kafka

This project demonstrates a user login system built using **Spring Boot**, featuring **JWT (JSON Web Tokens)** for authentication and **Kafka** for inter-service communication. It includes user registration, login, stateless session management, and messaging.

---

## Features
- User Registration and Login with JWT Authentication
- Secure password validation (minimum 8 characters, includes uppercase, numbers, and symbols)
- Stateless Authentication using JWT
- Kafka Messaging for inter-service communication
- RESTful APIs with proper exception handling
- Layered architecture: Controller, Service, Repository

---

## Technologies Used
- **Spring Boot** (Java Framework)
- **MySQL** (Relational Database)
- **JWT** (JSON Web Tokens for authentication)
- **Kafka** (Messaging system)
- **Spring Data JPA** (Database interaction)
- **Maven** (Dependency management)
- **Lombok** (Reduces boilerplate code)

---

## Prerequisites
- **Java 17** or higher
- **MySQL** installed and running
- **Apache Kafka** (Running locally or on a cluster)
- **Maven** installed
- **Postman** or any API client for testing

---

## Getting Started

### 1. Clone the Repository
```bash
git clone https://github.com/yourusername/user-login-system.git
cd user-login-system
