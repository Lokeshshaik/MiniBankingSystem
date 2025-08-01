# 💳 MiniBankingSystem (Java Console App)

A beginner-level **Java banking system** built using **object-oriented programming** principles. This project is a lightweight console application that allows users to create bank accounts, login securely, and perform basic banking operations.

---

## 🚀 Features

- 🏦 Account creation with name, password, and initial deposit
- 🔐 Secure login using account number and password
- 💰 Deposit and withdraw funds
- 📄 View account details
- 🔄 Session-based login/logout flow
- 🎯 Input validation for user-friendly experience

---

## 🛠 Technologies Used

- Java 17+
- IntelliJ IDEA (recommended)
- Standard Java libraries (no external dependencies)

---

## 📁 Project Structure

```bash
MiniBankingSystem/
├── src/
│   ├── Account.java       # Represents a user's bank account
│   ├── Bank.java          # Handles account creation and login
│   ├── BankingSystem.java # Main class with menus and control flow
│   └── InputUtil.java     # Utility for reading user input safely
└── .gitignore             # Ignores build/config files
