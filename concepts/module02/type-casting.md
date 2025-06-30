    - "Type casting" means converting a value from one data type to another.

This is especially important in Java because it's a statically typed language -- every variable has a declared
type, and the compiler must know what types you're working with.

### Two types of Type Casting in Java:

In Java, there are two types of Type Casting, the type Implicit and the type Explicit:

|  Type        |  Also Called        |  Description       |
|--------------|---------------------|--------------------|
|  Implicit    |  Widening Conversion|  Automatically done by the complier when here's no risk  of data loss|
|  Explicit    |  Narrowing Conversion|  You must do it manually, because there's a risk of data loss or overflow|

### 1. Implicit Type Casting (Widening)

This happens **automatically** when you're converting from a smaller type to a larger type (e.g., `int`-> `long`, `float`->double`)

#### Example:

