## Method Chaining

Method Chaining is when you call multiple methods on the same object in a single line,
one after another, like this:

```java
object.method1().method2().method3();
```
To enable this, each method must return this (the current object) or another object.

### Real examplo

### Without Chaining:
```java
Player player = new Player();
player.setName("Carlos");
player.setHealth(100);
player.setWeapon("Sword");
```

### With Chaining:

```java
Player player = new Player()
    .setName("Carlos")
    .setHealth(100)
    .setWeapon("Sword");
```

### How to Implement Method Chaining

You need to return `this` from each method:

```java
public class Player {
    private String name;
    private int health;
    private String weapon;

    public Player setName(String name) {
        this.name = name;
        return this;
    }

    public Player setHealth(int health) {
        this.health = health;
        return this;
    }

    public Player setWeapon(String weapon) {
        this.weapon = weapon;
        return this;
    }

    public void showStats() {
        System.out.println(name + " | " + health + " HP | Weapon: " + weapon);
    }
}

```
#### Usage

```java
public class Main {
    public static void main(String[] args) {
        Player player = new Player()
            .setName("Carlos")
            .setHealth(100)
            .setWeapon("Sword");

        player.showStats();
    }
}
```

## ⚙️ Why Use Method Chaining?

**Clean Code**
  - Reduces repetition and makes object setup more readable.
**Fluent Interface**
  - Easier to understand what's happening at a glance.
**Compact Syntax**
  - Fewer lines, more expressive.

### Bonus: Method Chaining with Builders

Used in `StringBuilder`, `Stream`, or custom builders:

```java
String result = new StringBuilder()
    .append("Hello")
    .append(" ")
    .append("Carlos")
    .toString();
```
[Go to Challenge](../challenges/method-chaining.md)

[Go to Main README](../../README.md)
