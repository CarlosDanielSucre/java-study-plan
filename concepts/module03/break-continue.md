## Keywords: break, continue.

### `break` - **Emergency Exit**

### What is does:  

Immediately stops the closet loop or `switch` and exits it.

### Use case:  

- You found what you were looking for.
- No need to keep looping.
- You want to **abort** a loop early.

#### Example:

```java
for (int i = 1; i <= 10; i++) {
    if (i == 5) {
        break; // Exit loop when i == 5
    }
    System.out.println("i = " + i);
}
```
#### Output: 
```
i = 1
i = 2
i = 3
i = 4
```

### `continue` - **Skip This Round**

What is does: 

Skips the **current iteration**, and jumps to the next loop cycle.

####  Use case: 

- You want to **ignore certain values** but keep looaping.
- You want to skip when input is invalid, or when a condition doesn't apply.

#### Example: 

```java
for (int i = 1; i <= 5; i++) {
    if (i == 3) {
        continue; // Skip number 3
    }
    System.out.println("i = " + i);
}
```
#### Output:
```
i = 1
i = 2
i = 4
i = 5
```

### Use with care:

- `break` can make code harder to read if used excessively.
- `continue` might skip important logic if not well planned.

### Applied Example - `break` + `continue` in loop.

```java
for (int i = 1; i <= 10; i++) {
    if (i % 2 != 0) {
        continue; // skip odd numbers
    }
    if (i > 6) {
        break; // stop after 6
    }
    System.out.println("Valid even: " + i);
}
```
#### Output
```
Valid even: 2
Valid even: 4
Valid even: 6
```
