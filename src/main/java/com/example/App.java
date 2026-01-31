package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class App {

    @GetMapping("/")
    public String home() {
        return """
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Java CI/CD with GitHub Actions</title>
    <style>
        body {
            font-family: Arial, Helvetica, sans-serif;
            background-color: #0f172a;
            color: #e5e7eb;
            margin: 0;
            padding: 0;
        }

        header {
            background-color: #020617;
            padding: 40px 20px;
            text-align: center;
        }

        h1 {
            color: #38bdf8;
            margin-bottom: 10px;
        }

        h2 {
            color: #22c55e;
            margin-top: 40px;
        }

        p {
            font-size: 1.1rem;
            max-width: 800px;
            margin: 10px auto;
            line-height: 1.6;
        }

        .container {
            padding: 40px 20px;
            max-width: 1000px;
            margin: auto;
        }

        .card {
            background-color: #020617;
            border: 1px solid #1e293b;
            border-radius: 10px;
            padding: 25px;
            margin-bottom: 25px;
        }

        ul {
            list-style-type: square;
            padding-left: 20px;
        }

        li {
            margin: 10px 0;
        }

        footer {
            text-align: center;
            padding: 20px;
            background-color: #020617;
            margin-top: 40px;
            font-size: 0.9rem;
            color: #94a3b8;
        }

        .badge {
            display: inline-block;
            padding: 6px 12px;
            background-color: #22c55e;
            color: #022c22;
            border-radius: 20px;
            font-size: 0.9rem;
            margin-top: 10px;
        }
    </style>
</head>
<body>

<header>
    <h1>🚀 Automating Java Application Deployments</h1>
    <p>CI/CD Pipeline using GitHub Actions & Docker</p>
    <span class="badge">DevOps Project</span>
</header>

<div class="container">

    <div class="card">
        <h2>📌 Project Overview</h2>
        <p>
            This project demonstrates how a Java application can be automatically
            built and deployed using a CI/CD pipeline powered by GitHub Actions.
            Docker is used to package the application and deploy it on a Linux server.
        </p>
    </div>

    <div class="card">
        <h2>🛠️ Technologies Used</h2>
        <ul>
            <li>Java & Spring Boot</li>
            <li>Maven (Build Tool)</li>
            <li>GitHub Actions (CI/CD)</li>
            <li>Docker (Containerization)</li>
            <li>Linux</li>
            <li>AWS EC2</li>
        </ul>
    </div>

    <div class="card">
        <h2>🔄 CI/CD Workflow</h2>
        <ul>
            <li>Code pushed to GitHub repository</li>
            <li>GitHub Actions triggers the pipeline</li>
            <li>Maven builds and tests the application</li>
            <li>Docker image is built</li>
            <li>Application is deployed to EC2 using SSH</li>
        </ul>
    </div>

    <div class="card">
        <h2>🎯 Purpose of This Project</h2>
        <ul>
            <li>Hands-on CI/CD experience</li>
            <li>Understanding GitHub Actions workflows</li>
            <li>Automating Java application deployments</li>
            <li>DevOps interview preparation</li>
        </ul>
    </div>

</div>

<footer>
    <p>© 2026 | DevOps CI/CD Project</p>
</footer>

</body>
</html>
        """;
    }

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }
}
