# 📈 Financial Forecasting

This project demonstrates the use of **recursion** in financial forecasting to calculate future value based on a fixed annual growth rate. The exercise aligns with core DSA concepts.

---

## 🧠 Objective

To implement a **recursive algorithm** that predicts the future value of an investment using past data and a constant growth rate.

---

## 🔁 Recursive Formula

Given:
- `P`: Present value
- `r`: Annual growth rate
- `n`: Number of years

### Formula:

- FutureValue(n) = FutureValue(n - 1) * (1 + r)
- Base case: FutureValue(0) = P

---

## 🛠️ Technologies

- **Language**: Java
- **Concepts**: Recursion, Time Complexity

---

## 📂 Files

- `FinancialForecast.java` — contains the complete recursive implementation.

---

## 🔎 Sample Output

Enter the initial amount: 10000                                                                                                                                      
Enter the annual growth rate (as a decimal): 0.10                                                                                                                    
Enter the number of years: 5                                                                                                                                         
Future Value : 16105.10


## 📊 Time Complexity
- Approach	  Time Complexity	      Space Complexity
- Recursive	      O(n)	            O(n) (call stack)

## 📚 Conclusion
- Recursion simplifies the logic for financial growth calculations.

- For larger input values or performance needs, optimization techniques like iteration or memoization may be considered.

- This solution demonstrates a clean DSA-focused recursive implementation.

👨‍💻 Author
Prathamansh Jasrotia
