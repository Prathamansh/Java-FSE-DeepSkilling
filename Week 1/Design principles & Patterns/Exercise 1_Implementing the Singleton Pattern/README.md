# SingletonPatternExample

This project demonstrates the implementation of the **Singleton Design Pattern** in Java using a simple `Logger` utility class.

## 📌 Objective

Ensure that only **one instance** of the `Logger` class is created and used throughout the application lifecycle, maintaining consistent and centralized logging.

---

## 🧱 Project Structure

SingletonPatternExample/
├── Logger.java # Singleton Logger class
├── Main.java # Test class demonstrating the singleton behavior
└── README.md # Project documentation


---

## 🧠 How It Works

- **Private Constructor**: Prevents direct instantiation of the `Logger` class.
- **Static Instance**: Holds the single instance of `Logger`.
- **Public Static Method (`getInstance()`)**: Provides global access to the single instance.
- **Log Method**: Prints log messages to the console.

---

## ✅ How to Run

1. **Clone or Download** this repository.
2. Make sure both `Logger.java` and `Main.java` are in the same directory or package.
3. Compile the files:

```bash

🧪 Sample Output
Logger Initialized.
Log: This is the first log message.
Log: This is the second log message.
Both logger1 and logger2 refer to the same instance.
This output confirms that only one instance of Logger is used, demonstrating the Singleton pattern effectively.

📌 Concepts Demonstrated
Singleton Design Pattern

Object-oriented programming in Java

Lazy Initialization

Encapsulation

📂 Optional Enhancements
Implement thread-safe Singleton using synchronized or double-checked locking.

Add log level support (INFO, DEBUG, ERROR).

Write unit tests using JUnit.

👨‍💻 Author
Ansh Jasrotia
Created as part of a design patterns learning exercise.


