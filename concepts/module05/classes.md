## What is OOP?

Object-Oriented Programming is a programming paradigm where you model real-world things (like  
people, bank accounts, games) as **objects** that have **data** (atributes) and **behavior** 
(methods).  
Java is a 100% object-oriented language (except for primitive types), so mastering this is **not 
optional** -- it's the **core of being a great Java developer.

## Fundamental Concepts (deep explanation):

### 1. Class

A class is a **blueprint** or template that defines what an object will contrain and how it will
behave.

```java
public class Person {
    // this is a class definition
}
```

It's **not an object itself**, just the design of one.


### 2. Object

An object is an **instance of a class** -- real, living data created based on the definition.

```java
Person carlos =  new Person("Carlos", 25);
```

You can create **multipe objects** from the same class.

