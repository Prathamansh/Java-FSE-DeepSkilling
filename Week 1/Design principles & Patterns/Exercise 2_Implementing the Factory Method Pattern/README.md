# 🏭 Exercise 2_lmplementing the Factory Method Pattern

This project demonstrates the **Factory Method Design Pattern** in Java through a simple Document Management System. It allows the creation of different document types (Word, PDF, Excel) without tightly coupling the client code to specific classes.

---

## 📁 Project Structure

Exercise 2_lmplementing the Factory Method Pattern/
├── Document.java
├── WordDocument.java
├── PdfDocument.java
├── ExcelDocument.java
├── DocumentFactory.java
├── WordFactory.java
├── PdfFactory.java
├── ExcelFactory.java
└── Main.java


---

## 📜 Description

- **Document.java**: Interface that declares the `open()` method.
- **WordDocument.java**, **PdfDocument.java**, **ExcelDocument.java**: Concrete classes implementing `Document` interface, each with its own `open()` implementation.
- **DocumentFactory.java**: Abstract factory class with an abstract method `createDocument()`.
- **WordFactory.java**, **PdfFactory.java**, **ExcelFactory.java**: Concrete factories extending `DocumentFactory`, each returning a specific type of document.
- **Main.java**: Demonstrates usage by instantiating factories and opening different documents.

---

## 💡 Sample Output

Opening a Word document.
Opening a PDF document.
Opening an Excel document.


---

## 📌 Concepts Demonstrated

- Factory Method Design Pattern  
- Abstraction & Interfaces  
- Inheritance and Polymorphism  
- Loose Coupling and Extensibility

---

## 🛠️ Optional Enhancements

- Add more document types like PowerPoint or Text files.  
- Implement additional behaviors (save, print, close).  
- Create a dynamic factory using enums or reflection.  
- Introduce logging or configuration-based factory decisions.  
- Combine with Abstract Factory for related object groups.

---

## 👨‍💻 Author

**Prathamansh Jasrotia**  
Created as part of a design patterns learning exercise.

