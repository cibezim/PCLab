Notes 

Chapter 9

Memory storage is divided into two main areas: the Stack and the Heap.

The Stack is where method calls and local variables are stored.

The Heap is where objects and their instance variables reside.

Instance variables are declared within a class but outside of any specific method, while local variables are confined to the methods in which they are declared.

Overloading constructors enables us to create objects in different ways from the same class.

Constructor chaining ensures that all constructors in the inheritance hierarchy are executed when an object is created.


Chapter 10

Static methods can be invoked independently of objects. A static method operates without relying on an object's instance variable.

Static methods cannot make use of non-static variables.

Non-static methods can access both static and non-static (instance) variables.

Static variables are shared among all instances (objects) of a class.

Static variables get initialized when a class is loaded, not during object creation.

Static final variables represent constants shared within a class.
