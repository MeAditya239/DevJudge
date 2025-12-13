🧑‍⚖️ DevJudge — Online Code Practice & Evaluation Platform

DevJudge is a backend-driven online coding practice and evaluation platform designed for trainers and students.
It enables trainers to create coding problems and students to practice and submit solutions in a structured, scalable way.

This project was built as part of an online hackathon and follows industry-level development practices, including pull-request-based workflows and AI-assisted code reviews.

🚀 Key Features (Current & Planned)
----------------------------------------------------------------
✅ Implemented

User authentication (Register & Login)

JWT-based security

Role-based access (Trainer / Student)

Coding Problem domain model

Clean REST API structure

PR-based development workflow with AI reviews

🔜 Planned

CRUD for coding problems (Trainer)

Problem listing (Student)

Test/Contest creation

Code submission & evaluation

Leaderboard & results

🛠 Tech Stack
----------------------------------------------------------------
Backend

Java 17

Spring Boot

Spring Security + JWT

Spring Data JPA

MySQL (configurable)

Maven

Dev & Tooling

IntelliJ IDEA

Git & GitHub

Postman (API testing)

🤖 Code Quality & AI-Assisted Reviews (CodeRabbit)
----------------------------------------------------------------

This repository uses CodeRabbit AI to maintain high code quality and follow open-source best practices.

How CodeRabbit is used:

Automated Pull Request reviews

Suggestions on:

REST API design

Response handling (ResponseEntity)

Code structure & readability

Iterative improvements by applying AI feedback

All major changes are made via feature branches → pull requests, reviewed by CodeRabbit before merging into main.

This ensures:

Clean commit history

Maintainable architecture

Professional development workflow


📂 Project Structure (Backend)
----------------------------------------------------------------
<img width="576" height="249" alt="image" src="https://github.com/user-attachments/assets/9ca555d1-8eab-458b-a5e9-5a9aa0194011" />




🔐 Authentication Flow
----------------------------------------------------------------

Users register with role (TRAINER / STUDENT)

Passwords are securely hashed using BCrypt

Login returns a JWT token

JWT is used to protect secured APIs

🧪 API Testing
----------------------------------------------------------------

APIs are tested using Postman.

Example endpoints:

POST /api/auth/register

POST /api/auth/login

GET  /api/problems        (placeholder)

POST /api/problems        (placeholder)

🌍 Deployment (Planned)
----------------------------------------------
Backend: Render

Frontend (future): Vercel


🏁 Hackathon Notes
-------------------------------------------------------
All development was done during the hackathon

PR-based workflow followed throughout

AI-assisted reviews (CodeRabbit) used transparently

Project is open-source and extensible


👤 Author
----------------------------------------------
Aditya Patil

Backend Developer | Java & Spring Boot
