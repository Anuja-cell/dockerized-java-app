This is a simple Java (Spring Boot) backend application containerized with Docker and integrated with a CI/CD pipeline using GitHub Actions.
The project demonstrates my skills in Java, Docker, GitHub Actions, CI/CD, and AWS basics.

**Tech Stack**
Java 11
Spring Boot
Maven
Docker
GitHub Actions (CI/CD)
AWS EC2 / S3 (optional deployment)

**Project Features**

REST API built with Spring Boot
Automated build & test using GitHub Actions
Dockerized application for easy deployment
Deployable on AWS EC2 instance

**Docker Setup**
Build Docker image: docker build -t java-backend-app .
Run container: docker run -p 8080:8080 java-backend-app
Access app at: http://localhost:8080

**CI/CD Workflow**
The GitHub Actions workflow (.github/workflows/ci.yml) runs on every push:
Checkout code
Set up JDK 11
Build & test with Maven
(Optional) Build Docker image

**Future Enhancements**
Push Docker image to Docker Hub / ECR
Deploy automatically to AWS EC2 / Kubernetes
