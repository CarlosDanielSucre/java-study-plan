##  Composition: Has-a Relationship

Composition allows you to build complex types from simpler components. One class contains
instances of other classes.

### ✅ Example:

```java
public class Engine {
    private int horsepower;

    public Engine(int horsepower) {
        this.horsepower = horsepower;
    }

    public int getHorsepower() {
        return horsepower;
    }
}
```

```java
public class Car {
    private Engine engine;

    public Car(Engine engine) {
        this.engine = engine;
    }

    public void start() {
        System.out.println("Starting engine with " + engine.getHorsepower() + " HP");
    }
}
```

#### 🔍 The Car class has an Engine — this is composition.

