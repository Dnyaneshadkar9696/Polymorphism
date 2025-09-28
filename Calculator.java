/**
 * Calculator class demonstrating Method Overloading (Compile-time Polymorphism)
 * 
 * Method overloading allows multiple methods with the same name but different parameters.
 * The compiler determines which method to call based on the number and types of arguments.
 */
public class Calculator {
    
    /**
     * Add two integers
     */
    public int add(int a, int b) {
        System.out.println("Adding two integers: " + a + " + " + b);
        return a + b;
    }
    
    /**
     * Add three integers
     */
    public int add(int a, int b, int c) {
        System.out.println("Adding three integers: " + a + " + " + b + " + " + c);
        return a + b + c;
    }
    
    /**
     * Add two double numbers
     */
    public double add(double a, double b) {
        System.out.println("Adding two doubles: " + a + " + " + b);
        return a + b;
    }
    
    /**
     * Add two strings (concatenation)
     */
    public String add(String a, String b) {
        System.out.println("Concatenating strings: '" + a + "' + '" + b + "'");
        return a + b;
    }
    
    /**
     * Multiply two integers
     */
    public int multiply(int a, int b) {
        System.out.println("Multiplying two integers: " + a + " * " + b);
        return a * b;
    }
    
    /**
     * Multiply two double numbers
     */
    public double multiply(double a, double b) {
        System.out.println("Multiplying two doubles: " + a + " * " + b);
        return a * b;
    }
}