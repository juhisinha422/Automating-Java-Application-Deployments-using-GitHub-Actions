# 🚀 Automating Java Application Deployments using GitHub Actions

This project demonstrates how to automate the **build and deployment of a Java application** using **GitHub Actions**.  
It showcases a real-world **CI/CD pipeline** where application code is built, tested, and deployed automatically to a remote Linux server using **SSH and Docker**.

This repository is suitable for **learning DevOps**, **hands-on practice**, and **interview demonstrations**.

---

## 🧠 Project Overview

The objective of this project is to:
- Automate Java application builds using **Maven**
- Implement **CI/CD pipelines** using GitHub Actions
- Deploy the application to a remote server via **SSH**
- Run deployment commands using **Docker**

---

## 🛠️ Tools & Technologies

| Tool | Purpose |

|-----|--------|

| Java | Application development |

| Maven | Build and dependency management |

| GitHub Actions | CI/CD automation |

| Docker | Application containerization |

| SSH | Secure remote access |

| appleboy/ssh-action | SSH-based deployment in GitHub Actions |

---

## 📁 Project Structure

.
├── .github/

│ └── workflows/

│ └── deploy.yml # GitHub Actions workflow

├── src/ # Java source code

├── Dockerfile # Docker build instructions

├── pom.xml # Maven configuration

└── README.md # Project documentation


---

## 🔄 CI/CD Workflow

### 1️⃣ Trigger
The pipeline is triggered automatically on every push to the `main` branch.

---

### 2️⃣ Continuous Integration (CI)
- Code is checked out from the repository
- Java environment is set up
- Maven builds the project and runs tests

This ensures only valid and tested code proceeds to deployment.

---

### 3️⃣ Continuous Deployment (CD)
- GitHub Actions connects to a remote server via SSH
- Deployment commands are executed remotely
- Docker is used to run the Java application on the server

---

## 🔐 GitHub Secrets Configuration

The following secrets must be added in your repository:

**Settings → Secrets and variables → Actions**

| Secret Name | Description |
|------------|------------|
| `EC2_HOST` | Public IP or DNS of the server |
| `EC2_USER` | SSH username (e.g., ubuntu) |
| `EC2_SSH_KEY` | Private SSH key |

These secrets are securely used during deployment.

---

## 📦 Example Deployment Step

```yaml
- name: Deploy to Server
  uses: appleboy/ssh-action@v1.1.0
  with:
    host: ${{ secrets.EC2_HOST }}
    username: ${{ secrets.EC2_USER }}
    key: ${{ secrets.EC2_SSH_KEY }}
    script: |
      docker pull my-java-app:latest
      docker stop java-app || true
      docker rm java-app || true
      docker run -d -p 8080:8080 my-java-app:latest
```

## ▶️ Run the Project Locally

```bash
git clone https://github.com/juhisinha422/Automating-Java-Application-Deployments-using-GitHub-Actions.git
cd Automating-Java-Application-Deployments-using-GitHub-Actions
mvn clean install
```

## 🎯 Key Learnings

CI/CD pipeline implementation using GitHub Actions

Secure SSH-based deployments

Dockerized Java application deployment

Real-world DevOps workflow experience

## 📌 Notes

Ensure Docker is installed on the deployment server

The SSH user must have Docker permissions

Do not hard-code credentials in workflow files

## 👩‍💻 Author

Juhi Sinha
DevOps | Cloud | CI/CD Automation

