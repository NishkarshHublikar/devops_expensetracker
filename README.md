# 💰 Expense Tracker (DevOps Project)

This project is a full-stack **Expense Tracker Application** built in Java (Maven), designed to demonstrate a complete **CI/CD pipeline** using **Jenkins**, with monitoring integrated via **Nagios**, **Graphite**, and **Grafana**.

---

## 📌 Project Overview

The Expense Tracker allows users to:
- Add and manage daily expenses
- View and track expense history
- Understand spending patterns over time

This project was enhanced with **DevOps tools** to automate and monitor the development lifecycle — from code push to deployment.

---

## 🔧 Technologies Used

### Backend:
- Java 17
- Maven
- JUnit (for testing)

### DevOps & CI/CD:
- **Jenkins** – Automate builds and deployments
- **GitHub** – Source code management
- **Nagios** – System and service health monitoring
- **Graphite + CollectD** – Time-series metrics collection
- **Grafana** – Beautiful visual dashboards

---

## 🚀 CI/CD Pipeline Stages

1. **Source Control** – Code hosted on GitHub  
2. **Build** – Maven build triggered on push  
3. **Test** – Unit tests run with every build  
4. **Deploy** – Automatically deployable artifacts  
5. **Monitor** – Server monitored using Grafana/Graphite/Nagios

---

## 📊 Monitoring Stack

- **Nagios**: Uptime, load, disk usage, service checks  
- **Graphite + CollectD**: Metrics like CPU, memory, I/O  
- **Grafana**: Real-time dashboards visualizing system health

---

## 🛠 How to Run Locally

1. Clone the repo  
   ```bash
   git clone https://github.com/NishkarshHublikar/devops_expensetracker.git
