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

#### Step 2: Constructor with this
```java
public Book(String title, String author, int pages) {
    this.title = title;
    this.author = author;
    this.pages = pages;
    totalBooks++;
}
```
### What’s happening?
- `this.title` refers to the field.

- `title` (on the right-hand side) refers to the parameter.

We use `this` to **disambiguate** — without it, Java wouldn’t know which title you mean.

#### About totalBooks++
- We don’t use `this.totalBooks` here because `totalBooks` is `static` — it doesn’t belong to the object, so you should access it using `Book.totalBooks` or just `totalBooks` if inside the class.
