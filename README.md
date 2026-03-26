# Claims Processing Microservices

Enterprise-style Spring Boot backend application built for claims processing workflows.

## Tech Stack
- Java 17
- Spring Boot
- Spring Security
- Spring Data JPA
- PostgreSQL
- Maven

## Features
- Create claim
- Get all claims
- Get claim by ID
- Layered architecture: Controller / Service / Repository
- Basic authentication
- JPA-based persistence

## API Endpoints
- POST /api/claims
- GET /api/claims
- GET /api/claims/{id}

## Sample JSON
{
  "memberId": "M12345",
  "patientName": "John Doe",
  "providerName": "ABC Hospital",
  "claimAmount": 1250.75,
  "status": "PENDING"
}
