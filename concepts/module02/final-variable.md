

### What is a Variable?

A **variable** is a container that holds data during the execution of a program. You assign it a **data type** and a **name**,  
and it can be updated during the program's life.

#### Vaiable syntax

```java
type name = value;
```
### Example:

```java
int age = 25;
String name =  "Carlos";
boolean isLearningJava = true;
```
Variables are declared with `camelCase` names by convention, and must begin with a letter, `$`, or `_` (not a number).

### Types of Variables in Java

|  Type            |  Description                                           |
|------------------|--------------------------------------------------------|
|  Local Variable  |  	Declared inside a method, only accessible within it |
|  Instance Variable|  Belongs to the object (non-static fields)            |
|  Static Variable |    	Belongs to the class (shared by all instances)    |

### Java is Statically Typed

You must declare the type of every variable at compile time. Java does not allow you to reassign a different type later:

```java
int x = 5;
x = "Hello"; // Compile error
```

## Constants in Java: The `final` Keyword

A `constant` is a variable whose value cannot be changed once assigned. In java, we use the keyword `final` for this.

#### `final` Syntax:

```java
final type NAME_IN_CAPS = value;
```
   - Convention: Use **UPPER_CASE** for constant names.
#### Example:
```java
final double PI = 3.12159;
final int MAX_USERS = 100;
```
Trying to reassign a final variable causes a `compile-time` error:
```java
PI = 3.14;// Error: cannot assign a value to final variable 'Pi'
```
### Why Use `final`?

A `final` variable is used when we want to define constants (e.g., `MAX_SIZE`, `URL`, `TIMEOUT`), it is also used to prevent accidental changes in values, also to make code more readable and maintainable and required in certain context(like lambda expressions or local inner classes)

### Variable Declaration & Initialization

#### Declaration only:
```java
int a;
final int b;
```
   - But `final` variables must be initialized once and only once:
```java
final int b;
b = 10; // ok
b = 20; // cannot assign again
```

### Final with Objects

Delaring an **object** as `final` means the reference cannot change, but the internal state can:
```java
final List<String> names = new ArrayList<>();
names.add("Carlos");// allowed
names = new ArrayList<>();// not allowed
```

### Sumary

|  Concept      |  Description            |
|---------------|-------------------------|
|  `variable`   | A named container to store data|
|  `final`      | Makes a variable a constant (immutable)|
|  Naming       | VAriables use `camelCase`, constants use `UPPER_CASE`|
|  Scope        | Controls where a variable is visible|
|  `final` with objects|  Reference is constant, not the content|

##### References: [Oracle Java Tutorials: Variables](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/variables.html) - [W3Schools: Java Variables](https://www.w3schools.com/java/java_variables.asp)

##### [Back to the main README](/../../README.md)
