Challenge: Method Chaining

Create a Car class with method chaining for the following methods:

- `setModel(String model)`
- `setColor(String color)`
- `setYear(int year)`
- `showInfo()`

---
Car class
```java
public class Car {
    private String model;
    private String color;
    private int year;

    public Car(String model, String color, int year) {
        this.model = model;
        this.color = color;
        this.year =  year;
    }

    public Car() {
        this.model = "";
        this.color = "";
        this.year  = 0;
    }


    public Car setModel(String model) {
        this.model = model;
        return this;
    }


    public Car  setColor(String color) {
        this.color = color;
        return this;
    }


    public Car setYear(int year) {
        this.year = year;
        return this;
    }

    public Car showInfo() {
        System.out.println("Model: " + model);
        System.out.println("Color: " + color);
        System.out.println("Year: " + year);
        return this; // Optional chaining support

    }

}
```
Main class

```java
package org.example.ChallengeChaining;

public class Main {
    public static void main(String[] args) {
        Car car = new Car()
                .setYear(68)
                .setColor("Yellow")
                .setModel("impala")
                .showInfo();
    }
}
```
