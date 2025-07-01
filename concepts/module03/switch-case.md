## `switch-case`

The `switch-case` statement in Java is a control flow statement that allows a program to execute
different blocks of code based on the value of a single variable or expression.  

It provides a more concise and readable alternative to a long chain of `if-else` if statements when you need
to perform different actions based on a limited number of discrete values.

### 1. Traditional `switch` Statement (Prior to Java 14)
The traditional `switch` statement has been a staple in Java since its inception.
It evaluates an expression and then attempts to match its value against several `case` labels.

#### Syntax:
```java
switch (expression) {
    case value1:
        // code block to execute if expression matches value1
        break; // Important: exits the switch block
    case value2:
        // code block to execute if expression matches value2
        break;
    case valueN:
        // code block to execute if expression matches valueN
        break;
    default:
        // code block to execute if expression doesn't match any case
        // break; // Optional for default if it's the last case
}
```
#### Explanation of Components:

- `expression`: This is the value that the `switch` statement evaluates. In traditional `switch`, this expression must evaluate to a type that can be converted to `int`. This includes:
     - `byte`, `short`, `char`, `int`.
     - Their wrapper classes (`Byte`, `Short`, `Character`, `Integer`)
     - `enum` types
     - `String` (since Java 7)
- `case valueN`: Each `case` label specifies a constant value. If the `expression` matches valueN, the code block associated with that case is executed.
The `valueN` must be a literal, a constant variable (declared with `final`), or an `enum` constant. It cannot be a variable or an expression that changes at runtime.
- `break`: This keyword is crucial in traditional `switch` statements. When a `break` statement is encountered, the `switch` block is immediately terminated,
and program execution continues with the statement following the `switch` block.
- `fall-through`: This is a common characteristic (and often a source of bugs) of the traditional `switch`. If a `break` statement is omitted from a `case` block,
execution will "fall through" to the next `case` block (and subsequent ones) until a `break` is encountered or the `switch` block ends. This can be intentional for specific scenarios but is often an oversight.
- `default`: The `default` case is optional. If no `case` value matches the `expression`, the code block under `default` is executed.
It acts as a catch-all. It's good practice to include a `default` case, even if just to handle unexpected values.

#### Example (Traditional switch):
```java
public class TraditionalSwitchExample {
    public static void main(String[] args) {
        int dayOfWeek = 3; // Monday = 1, Sunday = 7
        String dayName;

        switch (dayOfWeek) {
            case 1:
                dayName = "Monday";
                break;
            case 2:
                dayName = "Tuesday";
                break;
            case 3:
                dayName = "Wednesday";
                break;
            case 4:
                dayName = "Thursday";
                break;
            case 5:
                dayName = "Friday";
                break;
            case 6:
                dayName = "Saturday";
                break;
            case 7:
                dayName = "Sunday";
                break;
            default:
                dayName = "Invalid day";
                break; // Optional here, as it's the last case
        }
        System.out.println("Today is " + dayName); // Output: Today is Wednesday

        // Example of fall-through (often unintentional)
        char grade = 'B';
        switch (grade) {
            case 'A':
                System.out.println("Excellent!");
            case 'B': // Falls through from 'A' if 'A' was matched, or starts here if 'B' is matched
                System.out.println("Very Good!");
            case 'C':
                System.out.println("Good!");
                break; // Stops here
            default:
                System.out.println("Needs Improvement.");
        }
        // If grade = 'B', output:
        // Very Good!
        // Good!
    }
}
```

### 2. Enhanced switch Expressions (Java 14+)

Introduced as a preview feature in Java 12 and 13, and standardized in Java 14, the enhanced switch aims to address the common pitfalls 
of the traditional switch (like accidental fall-through) and make it more expressive, especially for returning values.

#### Syntax:
```java
// As a statement (no fall-through)
switch (expression) {
    case value1 -> // code block for value1
    case value2, value3 -> // code block for value2 or value3 (multiple labels)
    default -> // code block if no match
}

// As an expression (returns a value)
result = switch (expression) {
    case value1 -> value_to_return_1;
    case value2, value3 -> value_to_return_2_or_3;
    default -> default_value_to_return;
};
```
#### Key Features and Differences:
- **Arrow (`->`) Operator**:
      - Instead of `case value: ... break`;, you use case value `-> expression`; or `case value -> { ... }`;.
      - This syntax implicitly provides a `break` for each `case` block, eliminating the fall-through behavior by `default`.
- **No `fall-through` (by default)**: This is a significant improvement. Each `case` label with the `->` operator executes only its associated code block and then exits the `switch`.
- **Multiple `case` Labels**: You can specify multiple `case` labels separated by commas for the same code block (e.g., `case value1, value2 -> ...`).
- **switch as an Expression**:
      - The enhanced `switch` can now be used as an expression, meaning it can compute a value that can be assigned to a variable or returned from a method.
      - When used as an expression, every possible path must return a value. This often means a `default `case is mandatory unless all possible values of the `expression` are covered by `case` labels.
- **`yield` Keyword (for multi-statement case blocks in expressions)**:
      - If a `case` block in a switch expression needs to execute multiple statements before returning a value, you can use a block {} and the `yield` keyword to specify the value to be returned.
      - `yield` is similar to return but specifically for switch expressions.

  #### Example (Enhanced switch - Java 14+):
```java
  public class EnhancedSwitchExample {
    public static void main(String[] args) {
        int dayOfWeek = 3;
        String dayName = switch (dayOfWeek) { // switch as an expression
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            case 7 -> "Sunday";
            default -> "Invalid day";
        };
        System.out.println("Today is " + dayName); // Output: Today is Wednesday

        // Example with multiple labels and yield
        int score = 85;
        String feedback = switch (score / 10) { // Integer division to get tens digit
            case 10, 9 -> "Excellent work!";
            case 8 -> { // Multi-statement block requires yield
                String msg = "Very good!";
                System.out.println("Score is in 80s."); // Can have other statements
                yield msg; // Yields the value for the expression
            }
            case 7 -> "Good effort.";
            case 6 -> "Passed, but needs improvement.";
            default -> "Needs significant improvement.";
        };
        System.out.println("Feedback: " + feedback);
        // If score = 85, output:
        // Score is in 80s.
        // Feedback: Very good!
    }
}
```
#### 3. When to Use `switch-cases`
`witch-case` is particularly useful when:
- You have a single variable or expression whose value you want to evaluate.
- You need to perform different actions based on a fixed set of discrete values (e.g., error codes, menu options, days of the week, enum states).
- You want to improve the readability of your code compared to a long `if-else if` ladder, especially with the enhanced switch.
- You need to return a value based on different conditions (using enhanced switch expressions).

#### 4. Best Practices

- Use Enhanced `switch` (Java 14+): If your project uses Java 14 or newer, prefer the enhanced switch syntax (`->`) to avoid `fall-through` bugs and for better readability, especially when returning values.
- Always Include `default`: Even if you think all possible values are covered, a `default` case can catch unexpected inputs or future additions to `enum` types,
preventing silent failures. For `switch` expressions, `default` is often mandatory.
- Keep `case` Blocks Concise: Try to keep the code inside each `case` block short and focused. If a block becomes too long, consider extracting the logic into a separate method.
- Use `enum` Types: For a fixed set of related constants, `enum` types are excellent candidates for `switch` expressions, as they provide type safety and make your code more robust.
- Order `case` Labels: While not strictly necessary, ordering case labels logically (e.g., numerically, alphabetically, or by frequency of use) can improve readability.
- Avoid Complex Expressions in case Labels: case labels must be compile-time constants. Avoid logic that needs to be evaluated at runtime.
#### 5. Comparison with `if-else if`
|Features|witch-case|if-else if|
|--------|----------|----------|
|Evaluation|Single expression, matched against discrete values.|Multiple boolean expressions, evaluated sequentially.|
|Flexibility|Less flexible; ideal for exact value matching.|Highly flexible; can handle complex conditions (>, <, &&, `|
|Readability|Often more readable for many discrete conditions.|Can become messy and hard to read with many conditions.|
|fall-through|Traditional switch has it; enhanced switch does not (by default).|No fall-through behavior.|
|Return Value|Enhanced switch can directly return a value.|Requires return statements within each if/else if block.|
|Performance|Can be slightly more optimized by JVM for many cases (e.g., jump table).|Sequential evaluation, might be slower for many conditions.|

#### When to choose:
**`switch-case`**: When you have a single variable and you need to execute different code based on its exact value from a predefined set of options.  
**`if-else if`**: When you need to evaluate complex conditions, ranges of values, or multiple variables.By understanding both the traditional and enhanced switch statements, you can write more efficient, readable, and maintainable Java code.

[Back to Main README](../../README.md)
