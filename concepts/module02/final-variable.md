

### What is a Variable?

Remembering, a **variable** is a container that holds data during the execution of a program. You assign it a **data type** and a **name**,  
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

#### `final` Syntax 
