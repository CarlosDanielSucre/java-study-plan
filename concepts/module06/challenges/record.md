## Challenge: Build a Library System with Records

### 🧠 Goal:
Create a simple system that uses record to model books, authors, and a library catalog.

### 🔨 Requirements:

1) Create a `record` called `Book`

- Fields:

 - `String title`
 - `Author author`
 - `int yearPublished`

2) Create a `record` called `Author`

- Fields:

 - `String name`
 - `String nationality`

3) In your `main` method:

- Create at least 3 authors
- Create 5 books, each linked to one of the authors
- Store the books in a `List<Book>`

4) Print:

- A full list of books
- Only books published after the year 2010
- All books written by a specific author

### 📌 Example Output:

```
📚 All Books:
- The Clean Coder (Robert C. Martin, USA), 2011
- Effective Java (Joshua Bloch, USA), 2008
...

📕 Books after 2010:
- The Clean Coder

✍️ Books by Robert C. Martin:
- The Clean Coder (2011)
```
