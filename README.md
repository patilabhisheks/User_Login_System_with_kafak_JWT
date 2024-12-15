# User Login System with JWT and Kafka

This project demonstrates a simple user login system using JSON Web Tokens (JWT) for authentication and Kafka for messaging between services. It allows users to log in, authenticate their sessions using JWT, and communicate with other services via Kafka.

## Features
- User registration and login with JWT authentication.
- Secure password storage using hashing.
- Kafka messaging for communication between services.
- Stateless authentication using JWT tokens.
  
## Prerequisites
To run this project, ensure that you have the following software installed on your machine:
- **Node.js** (>= 14.x)
- **npm** (or **yarn** for package management)
- **Kafka** (running locally or a Kafka cluster available)

If you don't have Kafka installed, you can follow the [official Kafka documentation](https://kafka.apache.org/quickstart) for setup.

### Install Kafka (If needed):
You can use Docker to run Kafka locally. Here's a basic `docker-compose.yml` file to get you started:

```yaml
version: '2'
services:
  zookeeper:
    image: wurstmeister/zookeeper:3.4.6
    ports:
      - "2181:2181"
  kafka:
    image: wurstmeister/kafka:latest
    environment:
      KAFKA_ADVERTISED_LISTENERS: INSIDE://kafka:9093
      KAFKA_LISTENER_SECURITY_PROTOCOL: PLAINTEXT
      KAFKA_LISTENER_NAME_INTERNAL: INSIDE
      KAFKA_LISTENERS: INSIDE://kafka:9093
      KAFKA_LISTENER_PORT: 9093
      KAFKA_LISTENER_NAME_EXTERNAL: OUTSIDE
      KAFKA_LISTENERS: OUTSIDE://kafka:9092
      KAFKA_LISTENER_PORT: 9092
      KAFKA_LISTENER_SECURITY_PROTOCOL: PLAINTEXT
      KAFKA_LISTENER_NAMES: INSIDE, OUTSIDE
      KAFKA_ZOOKEEPER_CONNECT: zookeeper:2181
    ports:
      - "9093:9093"
      - "9092:9092"
