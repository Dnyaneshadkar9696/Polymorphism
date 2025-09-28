/**
 * Circle class demonstrating Method Overriding
 * 
 * This class extends Shape and provides specific implementations
 * for abstract methods and overrides other methods as needed.
 */
public class Circle extends Shape {
    private double radius;
    private static final double PI = Math.PI;
    
    public Circle(double radius) {
        super("Circle");
        this.radius = radius;
    }
    
    /**
     * Override abstract method to calculate circle area
     */
    @Override
    public double calculateArea() {
        return PI * radius * radius;
    }
    
    /**
     * Override abstract method to calculate circle circumference
     */
    @Override
    public double calculatePerimeter() {
        return 2 * PI * radius;
    }
    
    /**
     * Override displayInfo to include circle-specific details
     */
    @Override
    public void displayInfo() {
        System.out.println("=== Circle Details ===");
        System.out.println("Radius: " + radius);
        super.displayInfo(); // Call parent method
        System.out.println("======================");
    }
    
    /**
     * Override draw method with circle-specific implementation
     */
    @Override
    public void draw() {
        System.out.println("Drawing a circle with radius " + radius);
        int size = (int)(radius * 2) + 1;
        int center = size / 2;
        
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                double distance = Math.sqrt((i - center) * (i - center) + (j - center) * (j - center));
                if (Math.abs(distance - radius) < 0.5) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    
    // Getter
    public double getRadius() { return radius; }
}