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
        :root {
            --primary: #00ffcc;
            --secondary: #ffcc00;
            --accent: #6c8eff;
            --dark: #0b132b;
            --darker: #080f23;
            --card-bg: rgba(28, 37, 65, 0.85);
            --text: #f0f8ff;
        }

        body {
            margin: 0;
            font-family: "Segoe UI", system-ui, sans-serif;
            background: radial-gradient(ellipse at top, var(--darker), var(--dark));
            color: var(--text);
            line-height: 1.6;
        }

        header {
            text-align: center;
            padding: 70px 20px;
            background: linear-gradient(135deg, rgba(0,255,204,0.08), rgba(108,142,255,0.08));
            border-bottom: 1px solid rgba(255,255,255,0.1);
        }

        h1 {
            font-size: 3.2rem;
            background: linear-gradient(90deg, var(--primary), var(--accent));
            -webkit-background-clip: text;
            color: transparent;
            margin-bottom: 10px;
        }

        .subtitle {
            font-size: 1.4rem;
            opacity: 0.9;
        }

        .badge {
            display: inline-block;
            margin-top: 20px;
            padding: 8px 22px;
            border-radius: 30px;
            border: 1px solid rgba(0,255,204,0.4);
            color: var(--primary);
            background: rgba(0,255,204,0.08);
            font-size: 0.95rem;
            letter-spacing: 1px;
        }

        .container {
            max-width: 1100px;
            margin: 60px auto;
            padding: 0 20px;
        }

        .card {
            background: var(--card-bg);
            border-radius: 20px;
            padding: 35px;
            margin-bottom: 40px;
            border: 1px solid rgba(255,255,255,0.08);
            box-shadow: 0 20px 50px rgba(0,0,0,0.4);
        }

        .card h2 {
            color: var(--secondary);
            margin-bottom: 20px;
            font-size: 2rem;
        }

        ul {
            padding-left: 20px;
        }

        li {
            margin: 12px 0;
        }

        .flow li {
            list-style: none;
            position: relative;
            padding-left: 25px;
        }

        .flow li::before {
            content: "➤";
            position: absolute;
            left: 0;
            color: var(--primary);
        }

        footer {
            text-align: center;
            padding: 40px 20px;
            border-top: 1px solid rgba(255,255,255,0.1);
            opacity: 0.8;
            font-size: 0.9rem;
        }
    </style>
</head>
<body>

<header>
    <h1>Automating Java Application Deployments</h1>
    <p class="subtitle">CI/CD Pipeline using GitHub Actions & Docker</p>
    <span class="badge">DevOps Portfolio Project</span>
</header>

<div class="container">

    <div class="card">
        <h2>📌 Project Overview</h2>
        <p>
            This project demonstrates a complete DevOps workflow where a Java
            application is automatically built and deployed using GitHub Actions.
            Docker is used to package the application and run it on a Linux-based
            cloud server.
        </p>
    </div>

    <div class="card">
        <h2>🛠️ Technologies Used</h2>
        <ul>
            <li>Java & Spring Boot</li>
            <li>Maven (Build & Dependency Management)</li>
            <li>GitHub Actions (CI/CD)</li>
            <li>Docker (Containerization)</li>
            <li>Linux</li>
            <li>AWS EC2</li>
        </ul>
    </div>

    <div class="card">
        <h2>🔄 CI/CD Workflow</h2>
        <ul class="flow">
            <li>Code pushed to GitHub repository</li>
            <li>GitHub Actions workflow is triggered</li>
            <li>Maven builds and tests the application</li>
            <li>Docker image is built</li>
            <li>Application is deployed to EC2 using SSH</li>
        </ul>
    </div>

    <div class="card">
        <h2>🎯 Purpose of This Project</h2>
        <ul>
            <li>Hands-on CI/CD implementation</li>
            <li>Understanding GitHub Actions pipelines</li>
            <li>Automated Java application deployment</li>
            <li>DevOps interview & portfolio demonstration</li>
        </ul>
    </div>

</div>

<footer>
    © 2026 · DevOps CI/CD Project
</footer>

</body>
</html>
        """;
    }

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }
}
