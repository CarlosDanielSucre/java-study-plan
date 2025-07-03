## Parameters - "Passing Data Into Methods"

### Syntax:

```java
public static void greet(String name) {
  System.out.println("Hello, " + name);
}
```

- `String name` -> this is the parameter
- When you call `greet("Carlos")`, you're **passing an argument**

  *Think of a method as a machine. Parameters are the inputs*

  ### ⚠️ Important Rule:

  **Java is always pass-by-value.**
  But what the "value" represents depends on the type:

  #### ✅ 1. Primitive types (int, double, boolean, char...)

  They're copied when passed.
  Changes inside the method **do not affect** the original variable.

  ```java
  public static void change(int x) {
      x = 10;
  }
  public static void main(String[} args) {
      int a = 5;
      change(a);
      System.out.println(a); // Still prints 5
  }
  ```

  #### ✅ 2. Reference types (arrays, objects, lists...)

  These pass a **copy of the reference** - which still points to the same object in memory.

  ```java
  public static void modify(int[] arr) {
    arr[0] = 99;
  }

  public static void main(String[] args) {
      int[] myArray = {1, 2, 3}
      modify(myArray);
      System.out.println(myArray[0]);
  }
  ```

##  RETURN VALUES — "Passing Data Out of Methods"

### Syntax:

```java
 public static int square(int n) {
    return n * n;
}
```

You can:  
- **Store** the return: `int result = square(5);`
- **Print** it directly: `System.out.println(square(5));`
- **Use** it inside another expression: `int total = square(3) + square(4);`

#### Important Notes:

- A method can return **only one value**
- `return` **exits** the method immediately
  
```java
public static String getMessage() {
    return "Hello!";
    // code here would never run
}
```
### METHOD OVERLOADING — “Same Name, Different Signatures”

Overloading allows **multiple methods** with the same name but **different parameters**.  
It increases **readability**, **flexibility**, and **reusability**.

#### What can be different in the overload?


