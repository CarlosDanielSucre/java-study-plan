## Java List

The Java List interface, java.util.List, represents an ordered sequence of objects. The elements 
contained in a Java List can be inserted, accessed, iterated and removed according to the order 
in which they appear internally in the Java List. The ordering of the elements is why this data structure 
is called a List.

Each element in a Java List has an index. The first element in the List has index 0, the second element has
index 1 etc. The index means "how many elements away from the beginning of the list". The first element is
thus 0 elements away from the beginning of the list - because it is at the beginning of the list.

You can add any Java object to a List. If the List is not typed, using Java Generics, then you can even mix
objects of different types (classes) in the same List. Mixing objects of different types in the same List 
is not often done in practice, however.

The Java List interface is a standard Java interface, and it is a subtype of the Java Collection interface,
meaning List inherits from Collection.

## Java List Tutorial Video

If you prefer to watch a video instead of reading text, here is a video version of this Java List tutorial:
https://youtu.be/d3QbptJRln4

## List vs. Set
The Java List and Java Set interfaces are quite similar in that they both represents a collection of elements.
However, there are some significant differences. These differences are reflected in the methods the List 
and Set interfaces offer.

The first difference between the Java List and Java Set interface is, that the same element can occur more 
than once in a Java List. This is different from a Java Set where each element can occur only once.

The second difference between a Java List and Java Set interfaces is, that the elements in a List has an 
order, and the elements can be iterated in that order. A Java Set does not make any promises about the order 
of the elements kept internally.

## List Implementations
Being a Collection subtype all methods in the Collection interface are also available in the List 
interface.

Since List is an interface you need to instantiate a concrete implementation of the interface in order
to use it. You can choose between the following List implementations in the Java Collections API:

- java.util.ArrayList
- java.util.LinkedList
- java.util.Vector
- java.util.Stack
- 
Of these implementations, the ArrayList is the most commonly used.

There are also concurrent List implementations in the java.util.concurrent package. These List implementations
are explained in more detail in my `java.util.concurrent tutorial` .

## Create a List
You create a List instance by creating an instance of one of the classes that implements the List 
interface. Here are a few examples of how to create a `List` instance:
```
List listA = new ArrayList();
List listB = new LinkedList();
List listC = new Vector();
List listD = new Stack();
```

Remember, most often you will use the ArrayList class, but there can be cases where using one of the 
other implementations might make sense.

## Generic Lists
By default you can put any Object into a List, but from Java 5, Java Generics makes it possible to 
limit the types of object you can insert into a List. Here is an example:
```
List<MyObject> list = new ArrayList<MyObject>();
```
This List can now only have MyObject instances inserted into it. You can then access and iterate its 
elements without casting them. Here is how it looks:
```
List<MyObject> list = new ArrayList<MyObject>();

list.add(new MyObject("First MyObject"));

MyObject myObject = list.get(0);

for(MyObject anObject : list){
   //do someting to anObject...
}
```
Without generics the example above would have looked like this:
```
List list = new ArrayList();   //no generic type specified

list.add(new MyObject("First MyObject"));

MyObject myObject = (MyObject) list.get(0);  //cast needed

for(Object anObject : list){
    //cast needed
    MyObject theMyObject = (MyObject) anObject;

   //do someting to anObject...
}
```
Notice how it is necessary to cast the MyObject instances retrieved from the List to MyObject. Without
a generic type set on the List variable declaration the Java compiler only knows that the List contains
Object instances. Thus, you need to cast them to the concrete class (or interface) that you know the 
object to be of.

It is a good practice to specify a generic type for your List variables whenever you can. It helps you 
avoid inserting the wrong types of objects into the List. It enables you to retrieve the objects from 
the List without having to cast them their real type. And - it helps the reader of your code see what 
type of objects the List is supposed to contain. You should only omit a generic type if you have very 
good reasons to do so.

Throughout the rest of this Java List tutorial I will be using generic List examples as much as possible.

For more information about Java Generics, see the Java Generics Tutorial.
