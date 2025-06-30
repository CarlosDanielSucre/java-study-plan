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
        - [x] No data is lost. `int` fits inside a `double`.

### Order of Widenning:

```bash
byte -> short -> int -> long -> float -> double
```
### 2. Explicit Type Casting (Narrowing)

This happend **manually** when you're converting from a **larger type to a smaller type**, because Java wants to **protect your data**.

You must use **parentheses** to tell Java:  
        - "Yes, I know there may be data loss. Do it anyway"
