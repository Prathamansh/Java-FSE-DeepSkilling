# 🔧 11_Implementing Dependency Injection

This project demonstrates the use of **Dependency Injection (DI)** in Java using a simple customer management system.

---

## ✅ Components

- **CustomerRepository (Interface)** – Declares data access methods.
- **CustomerRepositoryImpl** – Provides mock implementation of customer lookup.
- **CustomerService** – Depends on the repository, receives it via constructor injection.
- **Main** – Demonstrates dependency injection and service usage.

---

## 📦 How to Run

```
javac *.java
java Main
```

## Sample Output
```
Customer Found: Prathamansh Jasrotia
Customer Found: Customer Not Found
```

## Author
Prathamansh Jasrotia
