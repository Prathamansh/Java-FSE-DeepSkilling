# 🔌 Implementing the Adapter Pattern

This project demonstrates the **Adapter Pattern** in Java by adapting third-party payment gateways (like PayPal and Stripe) to a common interface `PaymentProcessor`.

## 📁 Project Structure

- AdapterPatternExample/
- ├── PaymentProcessor.java # Target interface
- ├── PayPalGateway.java # Existing PayPal API (
- ├── StripeGateway.java # Existing Stripe API 
- ├── PayPalAdapter.java # Adapter for PayPal
- ├── StripeAdapter.java # Adapter for Stripe
- ├── AdapterPatternTest.java # Test class with main()

## ▶️ How to Run

**Compile all files:**
   
   - javac *.java
   - java AdapterPatternTest


## Author
Prathamansh Jasrotia
