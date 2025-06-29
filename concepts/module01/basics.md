# 📦 Module 1: Introduction to Java and Tools

Welcome to the first module of the **Java From Zero to Advanced** study plan.  
This section focuses on understanding what Java is, its ecosystem, and how to set up your development environment.

---

## ☕ What is Java?

**Java** is a high-level, object-oriented programming language developed by **Sun Microsystems** in 1995 (now owned by Oracle).  
It is platform-independent thanks to the **Java Virtual Machine (JVM)** — “write once, run anywhere”.

### 🔑 Key Features:
- Object-Oriented
- Platform Independent
- Robust and Secure
- Multithreaded
- Rich API
- Large Community

📖 Reference:
- [Oracle: What is Java?](https://www.oracle.com/java/technologies/javase-downloads.html)
- [Wikipedia – Java (programming language)](https://en.wikipedia.org/wiki/Java_(programming_language))

---

## 📅 History, Versions, and Ecosystem

Java has evolved through major versions:

| Version | Release Year | Key Features |
|--------|--------------|---------------|
| Java 5 | 2004 | Generics, Enhanced for-loop |
| Java 8 | 2014 | Lambdas, Streams, Optional |
| Java 11 | 2018 | LTS (Long-Term Support), New APIs |
| Java 17 | 2021 | Sealed classes, LTS |
| Java 21 | 2023 | Virtual Threads (Project Loom) |

Java has an extensive **ecosystem**, including:
- **JDK**: Java Development Kit
- **JRE**: Java Runtime Environment
- **JVM**: Java Virtual Machine
- **Libraries**: Apache Commons, Google Guava, etc.
- **Frameworks**: Spring, Jakarta EE, Hibernate

📖 Reference:  
- [Java Releases & Roadmap](https://www.oracle.com/java/technologies/javase/jdk11-support-roadmap.html)

---

## 🛠 Installing the JDK and Setting Up

### 📥 Step 1: Download JDK

We recommend using **JDK 17+**, preferably from Oracle or OpenJDK.

- [Download Oracle JDK](https://www.oracle.com/java/technologies/javase-downloads.html)
- [Download OpenJDK](https://jdk.java.net/)

### ⚙ Step 2: Set Environment Variables

On Windows:
1. Add `JAVA_HOME` environment variable.
2. Add `%JAVA_HOME%\bin` to your system `PATH`.

📖 Guide:
- [How to Set JAVA_HOME on Windows](https://confluence.atlassian.com/doc/setting-the-java_home-variable-in-windows-8895.html)

On Linux/macOS:
```bash
export JAVA_HOME=/path/to/jdk
export PATH=$JAVA_HOME/bin:$PATH
```
💻 Using an IDE: IntelliJ IDEA (Recommended)
IntelliJ IDEA is a powerful Java IDE from JetBrains.

🪄 Why IntelliJ?
Intelligent code completion

Integrated debugger and terminal

Maven/Gradle integration

Great UI for Spring Boot

📥 Download: IntelliJ IDEA Community Edition

📖 IntelliJ Beginner Guide:

JetBrains Docs: Getting Started

🧱 Structure of a Java Program

```java
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}
```
 Components:
class: Blueprint for objects

main method: Entry point of any Java application

System.out.println(): Prints to console

📖 Java Classes:

W3Schools Java Classes
https://www.w3schools.com/java/java_classes.asp

🚀 Compilation and Execution
✅ Using Terminal:
1.Create file Main.java

2.Compile:

javac Main.java
```bash
javac Main.java
```
3. Run:
4. 
```bash
java Main
```

✅ Using IntelliJ IDEA:
Create project → add Java class

Right-click file → Run Main.main()

📖 Terminal vs IDE Guide:
Java: Command Line Tools
https://docs.oracle.com/javase/8/docs/technotes/tools/
