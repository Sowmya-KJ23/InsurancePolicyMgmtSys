Microservices Distributed Systems Showcase 
This repository serves as a hands-on implementation of modern backend architecture patterns, focusing on high-throughput processing and deep observability.

Status: Work in Progress (Active Development)

Tech Stack:
Language: Java 21 (Utilizing Virtual Threads/Project Loom)
Framework: Spring Boot 3.x
Observability: Zipkin & Micrometer for Distributed Tracing
Containerization: Docker & Docker Compose
Messaging: Kafka / REST

Key Features Implemented:
Distributed Tracing: Integrated Zipkin to track request flow across service boundaries, enabling rapid bottleneck identification.
Java 21 Virtual Threads: Optimized I/O-bound tasks to ensure the system scales efficiently without the overhead of traditional thread pools.
Containerized Environment: Fully dockerized setup for seamless "one-command" local development.

Roadmap / Next Steps:
[x] Initial Microservice Backbone
[x] Zipkin Tracing Integration
[ ] Database Schema Optimization
[ ] Resilience Patterns (Circuit Breakers with Resilience4j)
[ ] Unit & Integration Testing Suite

Getting Started:
Clone the repository.
Run docker-compose up to start the infrastructure (Zipkin, Postgres, etc.).
Run the application using ./mvnw spring-boot:run.
