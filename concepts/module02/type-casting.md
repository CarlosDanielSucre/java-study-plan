## Type Casting in Java
    
    - "Type casting" means converting a value from one data type to another.

This is especially important in Java because it's a statically typed language -- every variable has a declared
type, and the compiler must know what types you're working with.

### Two types of Type Casting in Java:

In Java, there are two types of Type Casting, the type Implicit and the type Explicit:

|  Type        |  Also Called        |  Description       |
|--------------|---------------------|--------------------|
|  Implicit    |  Widening Conversion|  Automatically done by the complier when here's no risk  of data loss|
|  Explicit    |  Narrowing Conversion|  You must do it manually, because there's a risk of data loss or overflow|

### 1. Implicit Type Casting (Widening)

This happens **automatically** when you're converting from a smaller type to a larger type (e.g., `int`-> `long`, `float`->`double`)

#### Example:

```java
int num =  10;
double result = num; // int -> double
System.out.println(result); // 10.0
```
        - No data is lost. `int` fits inside a `double`.

### Order of Widenning:

```bash
byte -> short -> int -> long -> float -> double
```
### 2. Explicit Type Casting (Narrowing)

This happend **manually** when you're converting from a **larger type to a smaller type**, because Java wants to **protect your data**.

You must use **parentheses** to tell Java:

       - "Yes, I know there may be data loss. Do it anyway".

#### Syntax:

```java
type newVar =  (type) oldVar;
```

#### Example:
```java
double pi = 3.14159;
int approx = (int) pi;  // double → int (manual cast)
System.out.println(approx);  // 3
```
     - ❗ Decimal part is truncated, not rounded.
#### Another Example: Overflow Risk:
```java
int big = 130;
byte small = (byte) big;
System.out.println(small);  // -126 (!)
```
Why? Because byte only stores from -128 to 127 — it wrapped around. That’s overflow.

#### Real-World Example: Mixing Types in Calculations

```java
int a = 5;
double b = 2.0;

double result = a / b; // a is implicitly cast to double
System.out.println(result);  // 2.5
```
But if you use two integers:
```java
int result = 5 / 2;
System.out.println(result);  // 2, because it's integer division
```

### Casting with char and int

```java
char letter = 'A';           // Unicode 65
int code = letter;           // Implicit cast
System.out.println(code);    // 65

int num = 66;
char next = (char) num;      // Explicit cast
System.out.println(next);    // B
```

#### Best Practices
- Avoid unnecessary casts — let Java handle widening
- Be careful with narrowing casts — always check for data loss
- Document your reason when casting explicitly

##### References: [Oracle Java Docs – Type Casting](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/datatypes.html) - [W3Schools – Java Type Casting](https://www.w3schools.com/java/java_type_casting.asp)
