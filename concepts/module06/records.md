## Java Record

A Java Record is a special kind of Java class which has a concise syntax for defining immutable
data-only classes. Java Record instances can be useful for holding records returned from a database 
query, records returned from a remote service call, records read from a CSV file, or similar types
of use cases.

A Java Record consist of one or more data fields which corresponds to member variables in a regular 
Java class. The Java compiler auto generates getter methods, toString(), hashcode() and equals()
methods for these data fields, so you don't have to write that boilerplate code yourself. Since 
a Java Record is immutable, no setter methods are generated.

The Java Record type is a preview feature in Java 14, so we don't know yet if records will remain
in Java for the long term. Give them a try, and see what you think. Because Java Records is a 
preview feature in Java 14, you need to enable preview features to play with them (do an online 
search to learn how).

[Java Record Tutorial Video](https://www.youtube.com/watch?v=xs7DiEIHW0U)

## Java Record Syntax

The Java Record syntax is quite simple. Here is an example of a Java Record modeling a Vehicle:
```java
public record Vehicle(String brand, String licensePlate) {}
```
Notice how the example uses the record instead of class. The record keyword is what tells the 
Java compiler that this type definition is a record.
Notice also how the record defined in the example has no explicit Java field definitions. The record 
is defined solely by what looks like a regular Java constructor . That constructor is actually 
enough to define a Java Record. The two parameters defined in the Record constructor tells the Java
compiler that the record type has two fields - one field per parameter in the constructor. The 
Java compiler then generates the corresponding fields, getter methods and a hashCode() and equals()
method.

## Using a Java Record

You use a Java Record just like you use other Java classes - by creating instances of the record
type using the Java new keyword. Here is an example of using the Java Record type Vehicle defined
in the previous section:

```java
public class RecordsExample {

  public static void main(String[] args) {

    Vehicle vehicle = new Vehicle("Mercedes", "UX 1238 A95");

    System.out.println( vehicle.brand() );
    System.out.println( vehicle.licensePlate() );

    System.out.println( vehicle.toString() );

  }
}
```
Notice how the Java compiler has generated a `brand()` method, a `licensePlate()` method and a
`toString()` method for us. The output printed from the above example would be:

```java
Mercedes
UX 1238 A95
Vehicle[brand=Mercedes, licensePlate=UX 1238 A95]
```

## A Record is Final

A Record type definition is final, meaning you cannot create subclasses (subrecords) of a 
Java Record type.

## Multiple Constructors

It is possible for a Java Record type definition to contain multiple constructors. Here is a 
Java Record example that defines an extra constructor for the Vehicle record type shown 
earlier in this Java Record tutorial:

```java
public record Vehicle(String brand, String licensePlate) {

    public Vehicle(String brand) {
        this(brand, null);
    }

}
```
The extra constructor is declared inside the body of the Vehicle Record declaration. Notice how
dthe extra constructor calls the default constructor of the Vehicle Record. This is required by
the Java compiler, so the compiler knows what constructor parameters in the extra constructor
matches what parameters in the default constructor.

You can add as many extra constructors as makes sense for your concrete Java Record definition.

## Instance Methods

You can add instance methods to a Java Record definition - just like you can with a regular 
Java class. Here is an example of the Vehicle Java Record definition from earlier sections 
with an instance method named `brandAsLowerCase()` added:

```java
public record Vehicle(String brand, String licensePlate) {

    public String brandAsLowerCase() {
        return brand().toLowerCase();
    }
}
```
Notice how the `brandAsLowerCase()` method calls the auto-generated `brand()` method internally.

## Static Methods

It is also possible to add static methods to a Java Record definition. Here is an example of
the previous Vehicle Java Record definition with a static method added:

```java
public record Vehicle(String brand, String licensePlate) {

    public static String brandAsUpperCase(Vehicle vehicle) {
        return vehicle.brand.toUpperCase();
    }

}
```
