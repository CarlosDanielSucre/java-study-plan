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

### 3. Attributes (Fields)

These are the characteristics or data stored inside an object.  

```java
private String name;
private int age;
```
The keyword private means the data cannot be accessed directly from outside — only through methods (this is part of encapsulation).  

### 4. Constructor
A special method that runs when the object is created. It’s used to initialize the object with specific values.  

```java
public Person(String name, int age) {
    this.name = name;
    this.age = age;
}
```
The keyword this refers to the current object (e.g. this.name is the field of the object, not the parameter).  

### 4. Constructor

A special method that runs when the object is created. It’s used to initialize the object with specific values.

```java
public Person(String name, int age) {
    this.name = name;
    this.age = age;
}
```
The keyword this refers to the current object (e.g. this.name is the field of the object, not the parameter).

### 6. Encapsulation  

This is the practice of protecting the internal state of the object by:  
   - Making attributes private
   - Exposing access via controlled methods: getters and setters

```java
public String getName() {
    return name;
}
public void setName(String name) {
    this.name = name;
}
```
Encapsulation keeps your code clean, safe and predictable.
