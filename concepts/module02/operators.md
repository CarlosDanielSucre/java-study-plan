## Java Operators: Complete Guide

This file explains the most important operators in Java: **Arithmetic**, **Logical**, **Relational**, and **Ternary**.

---

### 1. Arithmetic Operators

Used for basic math operations.

| Operator | Name           | Example   | Result (if `a = 10`, `b = 3`) |
|----------|----------------|-----------|-------------------------------|
| `+`      | Addition       | `a + b`   | `13`                          |
| `-`      | Subtraction    | `a - b`   | `7`                           |
| `*`      | Multiplication | `a * b`   | `30`                          |
| `/`      | Division       | `a / b`   | `3` (integer division)        |
| `%`      | Modulo         | `a % b`   | `1`                           |

```java
int a = 10;
int b = 3;
System.out.println(a + b); // 13
System.out.println(a / b); // 3
```

---

### 2. Logical Operators

Used to combine boolean expressions.

| Operator | Name  | Description                      |
|----------|-------|----------------------------------|
| `&&`     | AND   | true if both conditions are true |
| `||`     | OR    | true if at least one is true     |
| `!`      | NOT   | negates a boolean expression     |

```java
boolean isAdmin = false;
boolean isLogged = true;

if (isLogged && isAdmin) {
    System.out.println("Welcome, admin");
} else {
    System.out.println("Access denied");
}
```

---

### 3. Relational Operators

Used to compare two values.

| Operator | Meaning               | Example     |
|----------|------------------------|-------------|
| `==`     | Equal to               | `a == b`    |
| `!=`     | Not equal to           | `a != b`    |
| `>`      | Greater than           | `a > b`     |
| `<`      | Less than              | `a < b`     |
| `>=`     | Greater than or equal  | `a >= b`    |
| `<=`     | Less than or equal     | `a <= b`    |

⚠️ **Use `.equals()` to compare Strings:**

```java
String s1 = "Carlos";
String s2 = "Carlos";
System.out.println(s1.equals(s2)); // true
```

---
### 4. Ternary Operator

Shortcut for simple if/else.

```java
int age = 18;
String status = (age >= 18) ? "Adult" : "Minor";
System.out.println(status); // Adult
```

Also useful for choosing between values:

```java
int max = (a > b) ? a : b;
```

---

### Summary Practice

```java
int x = 10, y = 5;
boolean isAdult = true;

// Arithmetic
System.out.println(x + y); // 15

// Relational
System.out.println(x > y); // true

// Logical
System.out.println((x > 5) && (y < 10)); // true

// Ternary
String result = (x > y) ? "x is greater" : "y is greater";
System.out.println(result); // x is greater
```

---

###  Summary Table

| Category   | Purpose                    |
|------------|----------------------------|
| Arithmetic | Perform math               |
| Logical    | Combine boolean conditions |
| Relational | Compare values             |
| Ternary    | One-line conditional check |

[Back to Main README](../../README.md)
