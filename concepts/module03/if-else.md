## Java Control Flow: `if`, `else if`, and `else`

In Java, control flow statements allow you to direct the execution path of your program depending on conditions.

This document covers the basic decision-making structures: `if`, `else if`, and `else`.

---

### The `if` Statement

The `if` statement evaluates a condition. If the condition is `true`, the block of code inside the `if` executes.

```java
int age = 20;

if (age >= 18) {
    System.out.println("You are an adult.");
}
```

If `age >= 18` is false, the code block is skipped.

---

### The `else` Clause

The `else` block executes if the `if` condition is false. It acts as a fallback.

```java
int age = 15;

if (age >= 18) {
    System.out.println("You are an adult.");
} else {
    System.out.println("You are a minor.");
}
```

Only one of the two blocks (`if` or `else`) will execute.

---

### The `else if` Clause

Used to check multiple conditions sequentially. Java evaluates each condition in order and executes the first one that is true.

```java
int score = 78;

if (score >= 90) {
    System.out.println("Grade: A");
} else if (score >= 80) {
    System.out.println("Grade: B");
} else if (score >= 70) {
    System.out.println("Grade: C");
} else {
    System.out.println("Grade: F");
}
```

Only one block is executed, even if multiple conditions are true. Java stops at the first true condition.

---

### Boolean Expressions

The condition inside `if` must be a boolean expression. This means the expression must evaluate to `true` or `false`.

```java
boolean isLoggedIn = true;

if (isLoggedIn) {
    System.out.println("Access granted.");
}
```

Invalid example (will cause a compilation error):

```java
int x = 5;

if (x) { // ERROR: x is not a boolean
    System.out.println("Invalid syntax.");
}
```

---

### Nesting `if` Statements

You can place an `if` statement inside another. This is useful for checking related conditions.

```java
int score = 92;
boolean hasBonus = true;

if (score > 90) {
    if (hasBonus) {
        System.out.println("High score with bonus!");
    } else {
        System.out.println("High score without bonus.");
    }
}
```

Make sure nested code is properly indented and clear.

---

### Best Practices

- Use curly braces `{}` even for single-line blocks. It improves readability and prevents bugs.

```java
// Preferred
if (x > 5) {
    System.out.println("Greater than 5");
}

// Avoid (error-prone)
if (x > 5)
    System.out.println("Greater than 5");
```

- Keep conditions clear and simple. Use parentheses to group expressions if needed.

---

### Real-World Example

```java
int temperature = 22;

if (temperature > 30) {
    System.out.println("Hot day");
} else if (temperature >= 20) {
    System.out.println("Nice weather");
} else {
    System.out.println("Cold day");
}
```

---

### Summary

| Statement    | Description |
|--------------|-------------|
| `if`         | Executes a block if condition is true |
| `else if`    | Checks additional conditions if previous ones were false |
| `else`       | Executes when all other conditions are false |

---

### Challenge

Write a program that receives an integer value for `age` and prints:

- "Child" if age < 13  
- "Teenager" if age >= 13 and < 18  
- "Adult" if age >= 18 and < 60  
- "Senior" if age >= 60

Use `if`, `else if`, and `else` to implement the logic.

[Back to the Main README](../../README.md)
