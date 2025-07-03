## Loops: `for`, `while`, `do-while`.
Loops are fundamental control flow statements in Java (and most programming languages) that allow you to execute a block of code repeatedly. They are essential for automating repetitive tasks, iterating over collections, and performing operations until a certain condition is met.

Java provides three main types of loops: for, while, and do-while. Each has its specific use cases and characteristics.

1. The for Loop
The for loop is typically used when you know in advance how many times you want to iterate, or when you need to iterate over a sequence of numbers.

Syntax:
for (initialization; termination; increment/decrement) {
    // code block to execute repeatedly
}

Explanation of Components:
initialization: This statement is executed once at the very beginning of the loop. It's typically used to declare and initialize a loop counter variable (e.g., int i = 0;).

termination: This is a boolean expression that is evaluated before each iteration. If it evaluates to true, the loop continues; if it evaluates to false, the loop terminates.

increment/decrement: This statement is executed after each iteration of the loop. It's typically used to update the loop counter variable (e.g., i++, i--, i += 2).

Flow of Execution:
initialization is executed.

termination condition is evaluated.

If termination is true:

The code block inside the loop is executed.

increment/decrement is executed.

Go back to step 2.

If termination is false:

The loop terminates, and execution continues with the statement after the loop.

Examples:
Example 1: Counting from 1 to 5

public class ForLoopExample {
    public static void main(String[] args) {
        System.out.println("Counting from 1 to 5:");
        for (int i = 1; i <= 5; i++) {
            System.out.println("Current count: " + i);
        }
        // Output:
        // Counting from 1 to 5:
        // Current count: 1
        // Current count: 2
        // Current count: 3
        // Current count: 4
        // Current count: 5
    }
}

Example 2: Iterating over an array (traditional for loop)

public class ForLoopArrayExample {
    public static void main(String[] args) {
        String[] fruits = {"Apple", "Banana", "Cherry"};
        System.out.println("\nIterating over fruits:");
        for (int i = 0; i < fruits.length; i++) {
            System.out.println("Fruit at index " + i + ": " + fruits[i]);
        }
        // Output:
        // Iterating over fruits:
        // Fruit at index 0: Apple
        // Fruit at index 1: Banana
        // Fruit at index 2: Cherry
    }
}

Enhanced for Loop (for-each loop)
Java also provides an enhanced for loop, or "for-each" loop, which simplifies iterating over arrays and collections. It's more readable and less prone to off-by-one errors.

Syntax:
for (Type element : collectionOrArray) {
    // code block to execute for each element
}

Example (Enhanced for loop):
public class ForEachLoopExample {
    public static void main(String[] args) {
        String[] fruits = {"Apple", "Banana", "Cherry"};
        System.out.println("\nIterating over fruits using for-each:");
        for (String fruit : fruits) {
            System.out.println("Fruit: " + fruit);
        }
        // Output:
        // Iterating over fruits using for-each:
        // Fruit: Apple
        // Fruit: Banana
        // Fruit: Cherry
    }
}

2. The while Loop
The while loop is used when you want to repeat a block of code as long as a certain condition remains true. The condition is checked before each iteration.

Syntax:
while (condition) {
    // code block to execute repeatedly
}

Explanation:
condition: A boolean expression that is evaluated before each execution of the loop body. If condition is true, the loop body executes. If condition is false, the loop terminates.

It's crucial to ensure that the condition eventually becomes false inside the loop body; otherwise, you'll create an infinite loop.

Flow of Execution:
condition is evaluated.

If condition is true:

The code block inside the loop is executed.

Go back to step 1.

If condition is false:

The loop terminates.

Examples:
Example 1: Counting down from 5

public class WhileLoopExample {
    public static void main(String[] args) {
        int count = 5;
        System.out.println("Counting down from 5:");
        while (count > 0) {
            System.out.println("Current count: " + count);
            count--; // Important: modifies the condition to eventually become false
        }
        // Output:
        // Counting down from 5:
        // Current count: 5
        // Current count: 4
        // Current count: 3
        // Current count: 2
        // Current count: 1
    }
}

Example 2: Reading user input until a specific value is entered

import java.util.Scanner;

public class WhileLoopInputExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = "";
        System.out.println("\nEnter 'quit' to exit.");
        while (!input.equals("quit")) { // Condition: loop while input is not "quit"
            System.out.print("Enter something: ");
            input = scanner.nextLine();
            System.out.println("You entered: " + input);
        }
        System.out.println("Exited loop.");
        scanner.close();
    }
}

3. The do-while Loop
The do-while loop is similar to the while loop, but with one key difference: the code block is executed at least once before the condition is evaluated. The condition is checked after each iteration.

Syntax:
do {
    // code block to execute repeatedly
} while (condition); // Note the semicolon here!

Explanation:
The do block is executed first.

After the do block executes, the condition is evaluated.

If condition is true, the loop repeats (executes the do block again).

If condition is false, the loop terminates.

Like while loops, it's crucial to ensure the condition eventually becomes false to avoid an infinite loop.

Flow of Execution:
The code block inside the do section is executed.

condition is evaluated.

If condition is true:

Go back to step 1.

If condition is false:

The loop terminates.

Examples:
Example 1: Counting up to 3 (guaranteed at least one execution)

public class DoWhileLoopExample {
    public static void main(String[] args) {
        int count = 0;
        System.out.println("Counting with do-while:");
        do {
            System.out.println("Current count: " + count);
            count++;
        } while (count < 3); // Condition: loop while count is less than 3
        // Output:
        // Counting with do-while:
        // Current count: 0
        // Current count: 1
        // Current count: 2
    }
}

Example 2: Validating user input (ensuring input is received at least once)

import java.util.Scanner;

public class DoWhileLoopValidationExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        System.out.println("\nEnter a number between 1 and 10:");
        do {
            System.out.print("Your number: ");
            while (!scanner.hasNextInt()) { // Input validation for non-integer
                System.out.println("Invalid input. Please enter an integer.");
                scanner.next(); // Consume the invalid input
                System.out.print("Your number: ");
            }
            number = scanner.nextInt();
            if (number < 1 || number > 10) {
                System.out.println("Number out of range. Please try again.");
            }
        } while (number < 1 || number > 10); // Loop until number is in range
        System.out.println("You entered a valid number: " + number);
        scanner.close();
    }
}

4. Loop Control Statements: break and continue
These statements allow you to alter the normal flow of a loop.

break: Immediately terminates the innermost loop (or switch statement) and transfers control to the statement immediately following the loop.

Example:

for (int i = 0; i < 10; i++) {
    if (i == 5) {
        break; // Exit the loop when i is 5
    }
    System.out.println("i: " + i);
}
// Output: 0, 1, 2, 3, 4

continue: Skips the rest of the current iteration of the innermost loop and proceeds to the next iteration.

Example:

for (int i = 0; i < 5; i++) {
    if (i == 2) {
        continue; // Skip the rest of this iteration when i is 2
    }
    System.out.println("i: " + i);
}
// Output: 0, 1, 3, 4

5. Choosing the Right Loop
for loop:

Use when you know the exact number of iterations beforehand.

Ideal for iterating over arrays or collections when you need access to the index.

Enhanced for loop (for-each):

Use when you need to iterate over all elements of an array or collection and don't need the index.

More concise and readable for simple iteration.

while loop:

Use when the number of iterations is unknown and depends on a condition that changes during the loop's execution.

The loop might not execute at all if the condition is initially false.

do-while loop:

Use when you need to guarantee that the loop body executes at least once, regardless of the initial condition.

Common for input validation or menu-driven programs.

Understanding these loop types and their control statements is crucial for writing effective and efficient Java programs.
