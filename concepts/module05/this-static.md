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

### Step 3: Instance method printInfo()

```java
public void printInfo() {
    System.out.println("Title: " + this.title + ", Author: " + this.author + ", Pages: " + this.pages);
}
```
####  Why use this here?

- Optional, but helps clarity.
- Especially useful when your codebase grows and fields have similar names.

You can also omit `this`. and it will work:
```java
System.out.println("Title: " + title); // Also valid
```

### Step 4: Static method `printTotalBooks()`
```java
public static void printTotalBooks() {
    System.out.println("Total books created: " + totalBooks);
}
```

#### Key concept:

- `static` methods cannot access instance fields or methods directly.
Why? Because they run without any object existing.

That’s why you can’t do this:

```java
System.out.println("Title: " + title); // ❌ Error: title is not static
```
Only static methods/variables can be accessed directly.

###  Step 5: Main method usage
```java
public class Main {
    public static void main(String[] args) {
        Book b1 = new Book("1984", "George Orwell", 328);
        Book b2 = new Book("The Hobbit", "J.R.R. Tolkien", 310);
        Book b3 = new Book("Clean Code", "Robert C. Martin", 464);

        b1.printInfo();
        b2.printInfo();
        b3.printInfo();

        Book.printTotalBooks();
    }
}
```

####  Why this works:

- Each book is a separate object → `printInfo()` is called on each one individually.

- `Book.printTotalBooks()` is `static` → You don’t need a Book object to call it.

### Final Key Takeaways
|    Concept      |    Meaning                                                          |
|-----------------|---------------------------------------------------------------------|
|    `this`       |    	Refers to the current object instance                           |
|    `Static`     |       Belongs to the class, shared across all objects               |
|  `static.title` |Refers to the field, helps disambiguate from parameters or local vars|
|    `static int` |       Single memory location shared by all instances of the class   |
|  `Static` method|    	Cannot access non-static members directly                       |
