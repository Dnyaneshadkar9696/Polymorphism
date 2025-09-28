/**
 * PolymorphismDemo - Main class demonstrating both types of polymorphism
 * 
 * This class demonstrates:
 * 1. Method Overloading (Compile-time Polymorphism)
 * 2. Method Overriding (Runtime Polymorphism)
 */
public class PolymorphismDemo {
    
    public static void main(String[] args) {
        System.out.println("=".repeat(60));
        System.out.println("           POLYMORPHISM DEMONSTRATION");
        System.out.println("=".repeat(60));
        
        // Demonstrate Method Overloading (Compile-time Polymorphism)
        demonstrateMethodOverloading();
        
        System.out.println("\n" + "=".repeat(60));
        
        // Demonstrate Method Overriding (Runtime Polymorphism)
        demonstrateMethodOverriding();
        
        System.out.println("\n" + "=".repeat(60));
        System.out.println("           DEMONSTRATION COMPLETE");
        System.out.println("=".repeat(60));
    }
    
    /**
     * Demonstrates Method Overloading (Compile-time Polymorphism)
     */
    private static void demonstrateMethodOverloading() {
        System.out.println("\n🔧 METHOD OVERLOADING (Compile-time Polymorphism)");
        System.out.println("-".repeat(50));
        System.out.println("Same method name 'add' with different parameters:");
        
        Calculator calc = new Calculator();
        
        // Different method calls resolved at compile time
        int result1 = calc.add(5, 3);
        System.out.println("Result: " + result1);
        
        int result2 = calc.add(10, 20, 30);
        System.out.println("Result: " + result2);
        
        double result3 = calc.add(3.14, 2.86);
        System.out.println("Result: " + result3);
        
        String result4 = calc.add("Hello, ", "World!");
        System.out.println("Result: " + result4);
        
        System.out.println("\nDemonstrating multiply overloading:");
        int multiplyInt = calc.multiply(4, 5);
        System.out.println("Result: " + multiplyInt);
        
        double multiplyDouble = calc.multiply(2.5, 4.0);
        System.out.println("Result: " + multiplyDouble);
    }
    
    /**
     * Demonstrates Method Overriding (Runtime Polymorphism)
     */
    private static void demonstrateMethodOverriding() {
        System.out.println("\n🚀 METHOD OVERRIDING (Runtime Polymorphism)");
        System.out.println("-".repeat(50));
        System.out.println("Same method name with different implementations in subclasses:");
        
        // Create an array of Shape references pointing to different objects
        Shape[] shapes = {
            new Rectangle(5.0, 3.0),
            new Circle(4.0),
            new Triangle(3.0, 4.0, 5.0)
        };
        
        // Demonstrate polymorphic behavior
        System.out.println("\n📐 Polymorphic method calls:");
        for (int i = 0; i < shapes.length; i++) {
            System.out.println("\nShape " + (i + 1) + ":");
            
            // The actual method called is determined at runtime
            // based on the actual object type (dynamic method dispatch)
            shapes[i].displayInfo();
            shapes[i].draw();
            
            System.out.println("─".repeat(40));
        }
        
        // Demonstrate method overriding with specific method calls
        System.out.println("\n🎯 Specific method override examples:");
        
        Rectangle rect = new Rectangle(6.0, 4.0);
        Circle circle = new Circle(3.0);
        Triangle triangle = new Triangle(5.0, 5.0, 5.0);
        
        // Each class has overridden these methods differently
        System.out.println("Rectangle area: " + rect.calculateArea());
        System.out.println("Circle area: " + String.format("%.2f", circle.calculateArea()));
        System.out.println("Triangle area: " + String.format("%.2f", triangle.calculateArea()));
        System.out.println("Triangle type: " + triangle.getTriangleType());
        
        // Demonstrate polymorphism with method calls
        System.out.println("\n🔄 Dynamic method dispatch in action:");
        Shape genericShape = new Circle(2.0);  // Shape reference, Circle object
        System.out.println("genericShape.calculateArea() = " + 
                         String.format("%.2f", genericShape.calculateArea()));
        System.out.println("Actual object type: " + genericShape.getClass().getSimpleName());
        
        genericShape = new Rectangle(3.0, 7.0);  // Same reference, different object
        System.out.println("genericShape.calculateArea() = " + 
                         String.format("%.2f", genericShape.calculateArea()));
        System.out.println("Actual object type: " + genericShape.getClass().getSimpleName());
    }
}