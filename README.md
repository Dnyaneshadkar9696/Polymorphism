# Polymorphism
A comprehensive demonstration of polymorphism concepts in Java, including both method overloading and method overriding.

## What is Polymorphism?
Polymorphism is one of the core principles of Object-Oriented Programming (OOP). It allows objects of different types to be treated as instances of the same type through a common interface. The word "polymorphism" comes from Greek, meaning "many forms."

## Types of Polymorphism Demonstrated

### 1. Method Overloading (Compile-time Polymorphism)
Method overloading allows multiple methods with the same name but different parameters (number, type, or order of parameters). The compiler determines which method to call based on the method signature.

**Example:** The `Calculator` class demonstrates method overloading with multiple `add()` methods:
- `add(int, int)` - adds two integers
- `add(int, int, int)` - adds three integers  
- `add(double, double)` - adds two doubles
- `add(String, String)` - concatenates two strings

### 2. Method Overriding (Runtime Polymorphism)
Method overriding allows a subclass to provide a specific implementation of a method that is already defined in its parent class. The actual method called is determined at runtime based on the object's type.

**Example:** The `Shape` hierarchy demonstrates method overriding:
- `Shape` (abstract base class) with abstract methods `calculateArea()` and `calculatePerimeter()`
- `Rectangle`, `Circle`, and `Triangle` classes override these methods with shape-specific implementations

## Project Structure

```
├── Calculator.java          # Demonstrates method overloading
├── Shape.java              # Abstract base class for shapes
├── Rectangle.java          # Rectangle implementation
├── Circle.java             # Circle implementation  
├── Triangle.java           # Triangle implementation
├── PolymorphismDemo.java   # Main demonstration class
└── README.md              # This file
```

## How to Run

1. **Compile all Java files:**
   ```bash
   javac *.java
   ```

2. **Run the demonstration:**
   ```bash
   java PolymorphismDemo
   ```

## Key Concepts Demonstrated

### Method Overloading Features:
- Same method name with different parameter lists
- Compile-time resolution (static binding)
- Different return types allowed when parameters differ
- Demonstrates type-specific behavior

### Method Overriding Features:
- Same method signature in parent and child classes
- Runtime resolution (dynamic binding)
- Use of `@Override` annotation
- Abstract methods forcing implementation in subclasses
- Polymorphic behavior through base class references

## Sample Output
The demonstration shows:
- Multiple overloaded methods being called with different parameter types
- Polymorphic method calls where the same method name produces different behavior based on the actual object type
- Visual representations of different shapes drawn using ASCII art
- Dynamic method dispatch in action

## Learning Objectives
After studying this code, you should understand:
1. The difference between compile-time and runtime polymorphism
2. How method overloading works and its rules
3. How method overriding enables runtime polymorphism
4. The use of abstract classes and methods
5. Dynamic method dispatch and virtual method calls
6. The `@Override` annotation and its importance
