# Magento Signup and Login Automation

## 📌 Overview

This project automates the sign-up and login functionality of the Magento demo website:
🔗 https://magento.softwaretestingboard.com/

It uses **Selenium WebDriver**, **TestNG**, **Cucumber (BDD)**, and **Page Object Model (POM)** structure.

---

## 🛠 Tech Stack

- Java 8+
- Maven
- Selenium WebDriver
- TestNG
- Cucumber (Gherkin BDD)
- WebDriverManager (for driver management)

---

## 📁 Project Structure

```
MagentoAutomation
├── pom.xml
├── src
│   ├── main
│   │   └── java
│   │       └── pageobjects
│   │           ├── LoginPage.java
│   │           └── SignUpPage.java
│   └── test
│       ├── java
│       │   ├── runners
│       │   │   └── TestRunner.java
│       │   └── stepdefinitions
│       │       └── SignupSteps.java
│       └── resources
│           ├── features
│           │   └── signup.feature
│           └── testng.xml
```

---

## 🚀 How to Run the Project

### ✅ Using Eclipse:
1. **Unzip the project**
2. **Import as Maven Project**:  
   `File → Import → Maven → Existing Maven Project`
3. Right-click `TestRunner.java` → **Run As > TestNG Test**  
   _or_  
   Right-click `testng.xml` → **Run As > TestNG Suite**

---

## 🧪 Test Scenario

**Feature: Sign Up and Login**
- Visit Magento home page
- Register a new user
- Logout
- Login again using the registered account
- Confirm successful login

---

## 📸 Screenshot / Report

You can view the HTML report at:
```
target/cucumber-report.html
```

For adding screenshots on failure, integrate `TakesScreenshot` inside `SignupSteps.java`.

---

## 🧑 Author

Created as part of a QA Automation Assignment.
