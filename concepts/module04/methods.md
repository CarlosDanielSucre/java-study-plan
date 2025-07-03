## Java Fundamentals – Method Declaration & Usage

### What is a Method?

A **method** is a **block of code** that performs a task.  
You define it once - and reuse it at many times as you want.

### Why use method?

- Reuse code.
- Organize logic.
- Improve readability.
- Make testing easier.
- Keep `main()` clean and small.

### Basic Structure of a Method

```java
returnType methodName(parameter1Type parameter1Name, ...){
  //code
  return value;
}
```

#### Example:

```java
public static int sum(int a, int b){
  return a + b;
}
```

### Method Components

|  Component       |  Meaning                                               |
|------------------|--------------------------------------------------------|
|  `public`        |  Access modifier (we'll use this for now)              |
|  `static`        |  Allows calling the method without creating an object  |
|  `int`           |  Return type (method returns an integer)               |
|  `sum`           |  Method name                                           |
|  `(int a, int b)`|  Parameters: input values                              |
|  `return a + b`  |  Output returned to the caller                         |

### Calling the Method

```java
int result = sum(5,  3);
System.out.printl(result): // Output: 8
```

### Return Types

|  Return Type  |  Description        |  Example                      |
|---------------|---------------------|-------------------------------|
|  `void`       |  No return value    |  `void printHello()`          |
|  `int`        |  Returns integer    |  `int getAge()`               |
|  `String`     |  Returns a string   |  `String getName()`           |
|  `boolean`    |  Returns true/false |  `boolean isAdult(int Age)`   |

#### Example - All together

```java
public class Calculator{

    jpublic static int add(int a, int b) {
        return a + b;
    }
    public static void greet(String name) {
        System.out.println("Hello, " + name);
    }

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static void main(String[] args) {
        greet("Carlos");

        int result = add(10, 5);
        System.out.println("Sum is: " + result);

        System.out.println("Is 4 even? " + isEven(4));
    }

}
```
[Back to main README](../../README.md)
