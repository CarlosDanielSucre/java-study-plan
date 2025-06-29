## 🔢 Java Primitive Data Types

Primitive types in Java are fundamental building blocks for storing simple data values. They are essentially the most basic data types available in the language, used for   
directly holding values like numbers, single characters, or boolean (true/false) states.
Think of them as the raw materials or basic ingredients in Java programming.  

Java has **8 primitive data types**, which are the most basic data types built into the language.   
They are **not objects**, and are stored directly in memory for performance.

## List of Primitive Types

| Type     | Size       | Default Value | Description                              |
|----------|------------|----------------|------------------------------------------|
| `byte`   | 8-bit      | 0              | Small integers (-128 to 127)             |
| `short`  | 16-bit     | 0              | Larger range than byte (-32,768 to 32,767) |
| `int`    | 32-bit     | 0              | Default integer type (-2^31 to 2^31-1)   |
| `long`   | 64-bit     | 0L             | Very large integers (-2^63 to 2^63-1)    |
| `float`  | 32-bit     | 0.0f           | Decimal numbers with lower precision     |
| `double` | 64-bit     | 0.0d           | Default decimal type, higher precision   |
| `char`   | 16-bit     | '\u0000'      | A single Unicode character (e.g., 'A')   |
| `boolean`| 1-bit      | false          | True/false values                        |



## 🧠 Key Concepts

### 📌 Integers (`byte`, `short`, `int`, `long`)

Used for whole numbers, the primitive types are:  
`byte` (very small numbers, 8-bit)  
`short` (small numbers, 16-bit)  
`int` (most commonly used for general whole numbers, 32-bit)  
`long` (very large whole numbers, 64-bit)  

Note:  `int` is most common. Use `long` when you need very big numbers, below is an example

```java
int age = 25;
long distance = 9876543210L;
```

### 📌 Floating Point Numbers (`float`, `double`)
Used for decimal values. `double` is the default for most decimal calculations.

```java
float pi = 3.14f;
double gravity = 9.80665;
```

### 📌 Characters (`char`)
Holds a single character (letter, symbol, etc.). Enclosed in single quotes.

```java
char letter = 'A';
char unicode = '\u03A9'; // Greek Omega Ω
```

### 📌 Booleans (`boolean`)
Holds only `true` or `false`. Often used in conditionals.

```java
boolean isJavaFun = true;
```

---

## 🔍 Type Casting

### Implicit (Widening)
Java automatically converts smaller types to larger types.

```java
int x = 10;
double y = x; // OK
```

### Explicit (Narrowing)
You must cast manually when going from larger to smaller types.

```java
double pi = 3.14;
int truncated = (int) pi; // 3
```

---

## 📖 References

- [Oracle Java Primitive Types](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/datatypes.html)
- [W3Schools Java Data Types](https://www.w3schools.com/java/java_data_types.asp)
