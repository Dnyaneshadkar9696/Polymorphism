// Method Overloading Example - Compile-time Polymorphism

public class MethodOverloading {
    public static void main(String[] args) {
        System.out.println("=== Method Overloading Example ===\n");
        
        Calculator calc = new Calculator();
        
        // Calling overloaded methods
        System.out.println("1. Single parameter method:");
        System.out.println("add(5) = " + calc.add(5));
        
        System.out.println("\n2. Two parameter method:");
        System.out.println("add(5, 10) = " + calc.add(5, 10));
        
        System.out.println("\n=== Method Overloading Rules ===");
        System.out.println("✓ Same method name");
        System.out.println("✓ Different parameter lists (number or type)");
        System.out.println("✓ Compiler decides which method to call");
        System.out.println("✓ Also called 'Compile-time Polymorphism'");
    }
}

class Calculator {
    // Method overloading: same method name, different parameters
    
    // Method 1: Single parameter
    public int add(int a) {
        int b = 8; // Adding 8 to the single parameter
        return a + b;
    }

    // Method 2: Two parameters
    public int add(int a, int b) {
        return a + b;
    }
}