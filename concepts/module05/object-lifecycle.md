## What is Object Lifecycle?

The Object Lifecycle refers to the series of steps an object goes through during its creation,
use, and destruction in a program.

## Phases of the Object Lifecycle

### Creation (Instantiation)

- The object is created using the new keyword (in Java).
- Memory is allocated for the object on the heap.
- The constructor is called to initialize the object.

  ```java
  Player player1 = new Player("Carlos", 100);
  ```
- At this point:
  - A memory space is reserved.
  - Fields are set (e.g., name = "Carlos", health = 100).
  - You can now use the object.

 ### 2. Usage (Active Phase)

 - The object is in use — you call methods, read/write fields, interact with other objects.

```java
player1.takeDamage(20);
System.out.println(player1.getHealth());
```
- Objects may change state over time.
- They may collaborate with other objects (e.g., enemies, weapons).

### 3. Destruction (End of Life)

In some languages, like C++, you must manually destroy objects.
But in Java (and many managed languages), Garbage Collection takes care of that.

- When there are no more references to an object, it becomes eligible for garbage collection.
- The JVM will eventually free the memory.
- You can override the finalize() method (though this is deprecated and rarely needed now).
  
```java
player1 = null;  // Hint for the GC that the object can be collected.
```
