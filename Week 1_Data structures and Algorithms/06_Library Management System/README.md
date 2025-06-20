# 📚 06_Library Management System

This project implements a basic **Library Management System** in Java that allows users to search for books by title using **Linear Search** and **Binary Search** algorithms.

---

## ✅ Exercise 6: Objective

> **Scenario:**  
You are developing a library management system where users can search for books by title or author.

---

## 🔍 1. Search Algorithms Used

### 🔹 Linear Search
- Scans each book sequentially.
- **Time Complexity:** O(n)
- **Use When:** Data is unsorted or dataset is small.

### 🔹 Binary Search
- Works on sorted data.
- Divides the search space in half each time.
- **Time Complexity:** O(log n)
- **Use When:** Data is sorted and performance is key.

---

## 🛠️ 2. Setup

The program uses a `Book` class with:
- `bookId`
- `title`
- `author`

## How to Run

```
javac *.java
java Main
```

## Time Complexity Comparison
```
| Algorithm     | Best Case | Average Case | Worst Case |
| ------------- | --------- | ------------ | ---------- |
| Linear Search | O(1)      | O(n)         | O(n)       |
| Binary Search | O(1)      | O(log n)     | O(log n)   |
```

## When to use Which?
```
| Scenario                        | Recommended |
| ------------------------------- | ----------- |
| Small or unsorted dataset       | Linear      |
| Large and sorted dataset        | Binary      |
| One-time search                 | Linear      |
| Frequent searches (sorted data) | Binary      |
```

## Folder Structure
```
├── Book.java        # Book class definition
├── Library.java     # Book list and search methods
└── Main.java        # Main runner class
```

## Author
Prathamansh Jasrotia

