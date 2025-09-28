# Java Polymorphism Examples

This repository demonstrates **Polymorphism** - one of the four fundamental principles of Object-Oriented Programming in Java.

## What is Polymorphism?

Polymorphism means "many forms". It allows objects of different types to be treated as objects of a common base type, while still maintaining their specific behaviors.

## Types of Polymorphism in Java

### 1. **Compile-time Polymorphism (Static)**
- **Method Overloading**: Same method name, different parameters
- **Operator Overloading**: Not supported in Java (except + for strings)

### 2. **Runtime Polymorphism (Dynamic)**
- **Method Overriding**: Child class provides specific implementation of parent method
- **Interface Implementation**: Classes implementing interface methods

## Files in this Repository

### 📁 `MethodOverloading.java`
Demonstrates **Method Overloading** - compile-time polymorphism

**Features:**
- Same method name `add()` with different parameter lists
- Compiler determines which method to call based on arguments
- Example with 1 parameter vs 2 parameters

## Key Concepts

### Method Overloading Rules:
✅ **Same method name**  
✅ **Different parameter lists** (number, type, or order)  
✅ **Return type can be same or different**  
✅ **Compiler decides at compile-time**  

### Benefits:
- Code readability and reusability
- Natural way to handle similar operations
- Flexibility in method usage
- Clean and intuitive API design

## How to Run

```bash
# Compile
javac MethodOverloading.java

# Run
java MethodOverloading
```

## Expected Output

```
=== Method Overloading Example ===

1. Single parameter method:
add(5) = 13

2. Two parameter method:
add(5, 10) = 15

=== Method Overloading Rules ===
✓ Same method name
✓ Different parameter lists (number or type)
✓ Compiler decides which method to call
✓ Also called 'Compile-time Polymorphism'
```

## Learning Points

- **Method Signature**: Method name + parameter list (not return type)
- **Compile-time Resolution**: Java compiler determines which overloaded method to call
- **Parameter Differences**: Number, type, or order of parameters must differ
- **Return Type**: Can be different but cannot be the only difference

---

*This repository focuses on method overloading. More polymorphism examples (method overriding, interfaces) will be added in future commits.*