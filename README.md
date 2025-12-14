🧑‍⚖️ DevJudge — Online Code Practice & Evaluation Platform

DevJudge is a full-stack online code practice and evaluation platform inspired by tools like HackerRank and LeetCode.
It allows users to write, run, and evaluate Java code in real time through a clean web interface backed by a secure, scalable backend.

This project was built end-to-end during a hackathon, following industry-grade workflows, AI-assisted code reviews, and cloud deployments.


🌐 Live Demo
--------------------------------------------------------------
Frontend (Vercel)
👉 https://devjudge-frontend.vercel.app/

Backend (Render)
👉 https://devjudge-backend.onrender.com

🎯 Problem Statement
-----------------------------------------------------------------------------
Learning to code requires instant feedback, safe execution, and clear results.
DevJudge solves this by providing:

A browser-based code editor

Secure backend code execution

Real-time output & error reporting

A foundation for future contests, leaderboards, and problem management

🚀 Key Features (Current & Planned)
----------------------------------------------------------------
<img width="674" height="642" alt="image" src="https://github.com/user-attachments/assets/4e71a27b-13b0-4bf9-9d1d-e1f4d6d3ce34" />


🔜 Planned / Extensible Features

Coding problem CRUD (Trainer)

Problem listing & filtering (Student)

Test / Contest creation

Code submissions & verdicts

Leaderboards & analytics

Multi-language support

🛠 Tech Stack
----------------------------------------------------------------
Backend
---------

Java 17

Spring Boot

Spring Security

JWT Authentication

Maven

REST APIs

Docker

Render (Deployment)

Frontend
---------------------------------------

React (Vite)

JavaScript

Fetch API

Vercel (Deployment)

Dev & Tooling
-----------------------

IntelliJ IDEA

Git & GitHub

Postman

AI-assisted PR reviews


🧠 Code Execution Flow (Judge Engine)
-------------------------------------------------

User writes Java code in browser

Frontend sends code → /api/judge/run

Backend:

Writes code to temp file

Compiles using javac

Executes safely

Captures output / errors

Result is returned to frontend

User sees output instantly



🔐 Authentication Flow
----------------------------------
User registers with role

Password is hashed using BCrypt

Login returns JWT token

Token can be used for secured APIs (future expansion)



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
<img width="335" height="252" alt="image" src="https://github.com/user-attachments/assets/06faa5d1-d14d-4f3a-93b1-5c981c63d0d2" />





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

POST /api/judge/run

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

Backend & Full-Stack Developer

Java • Spring Boot • React • Cloud Deployment
