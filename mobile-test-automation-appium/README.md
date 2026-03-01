# 📱 Mobile Test Automation Framework
## (Appium + Java + TestNG + Git + CI)

---

## 📌 Project Overview

This project implements a mobile test automation framework for an Android e-commerce demo application using:

- Java
- Appium
- TestNG
- Maven
- Git
- GitHub Actions (Continuous Integration)

The framework follows the Page Object Model (POM) design pattern and automates multiple user flows including login, product selection, cart operations, and checkout.

---

## 🛠 Tools and Technologies Used

- Java 17
- Appium
- TestNG
- Maven
- Git
- GitHub
- GitHub Actions (CI)
- Android Studio (Emulator & SDK)

---

## 🏗 Framework Structure

The framework follows Page Object Model (POM):
- Each screen has a separate Page class
- Locators and actions are encapsulated
- Test logic is separated from UI logic

---

## ✅ Automated Test Cases

The framework includes at least 10 functional test cases:

1. Valid Login Test
2. Invalid Login Test
3. Empty Username Test
4. Empty Password Test
5. Open Product Test
6. Add To Cart Test
7. Remove Item From Cart Test
8. Checkout Test
9. Open Menu Test
10. Open Cart From Home Test

Each test:
- Uses TestNG
- Extends BaseDriver
- Is independent
- Uses assertions

---

## ⚙ Setup Instructions

### 1. Install Required Software
- Java 17
- Node.js
- Appium Server
- Android Studio
- Git
- IntelliJ IDEA

### 2. Clone Repository
git clone <https://github.com/NU-FAST-CFD/mobile-test-automation-appium.git>
cd mobile-test-automation-appium

### 3. Install Dependencies
mvn clean install

### 4. Start Appium Server
appium

### 5. Start Android Emulator
Open Android Studio → Device Manager → Start Emulator

---

## ▶ How to Run Tests Locally

### Option 1 — From IntelliJ
Right click any test class → Run

### Option 2 — Using Maven
mvn test

Make sure:
- Appium server is running
- Emulator is started

---

## 🔄 Continuous Integration (CI) Workflow

GitHub Actions workflow is configured in:
.github/workflows/ci.yml

The CI pipeline:

- Runs on every push to `main`
- Runs on every Pull Request
- Sets up Java 17
- Builds the Maven project
- Executes automated test cases

This ensures automated validation of the project.

---

## 🔀 Git Workflow Used

The project follows a structured Git workflow:

- Main branch is protected
- No direct commits allowed to main
- Features developed in separate branches
- All changes merged via Pull Requests
- GitHub Issues used to track tasks
- Tasks assigned equally among team members

This ensures professional version control and collaboration.

---

## 👥 Contributors

- Insbaat
- Ayman
