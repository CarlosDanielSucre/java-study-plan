## 🧱 Java OOP: Encapsulation, Composition & Enum (Module 6)

This module covers three fundamental pillars of Object-Oriented Programming in Java:

- ✅ Encapsulation with Getters and Setters  
- ✅ Composition (Has-a relationship)  
- ✅ Enumerations (`enum`)

---

## 🔐 Encapsulation: Getters and Setters

Encapsulation means hiding the internal state of a class and exposing it only through controlled methods.

### ➕ Benefits:
- Protects data from invalid or unauthorized changes.
- Allows validation logic.
- Enables read-only or write-only properties.

### ✅ Example:

```java
public class BankAccount {
    private double balance;

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        } else {
            System.out.println("Invalid amount");
        }
    }
}
```
#### 💡 Never expose fields directly; always use methods to access or mutate them.
