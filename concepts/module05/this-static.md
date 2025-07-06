#### To understand `this` and `static`, we will do the following.

### Class Design: `Book`

#### Step 1: Define the fields
```java
public class Book {
    private String title;
    private String author;
    private int pages;

    private static int totalBooks = 0;
}
```

#### What’s happening?

- `title`, `author`, `pages` → These are instance variables.
Every `Book` object will have its own copy.

- `static int totalBooks` → This is a class variable.
All `Book` instances share the same `totalBooks` counter.
It exists once in memory, and it belongs to the class, not any object.
