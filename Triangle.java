/**
 * Triangle class demonstrating Method Overriding
 * 
 * This class extends Shape and provides specific implementations
 * for abstract methods and overrides other methods as needed.
 */
public class Triangle extends Shape {
    private double side1;
    private double side2;
    private double side3;
    
    public Triangle(double side1, double side2, double side3) {
        super("Triangle");
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }
    
    /**
     * Override abstract method to calculate triangle area using Heron's formula
     */
    @Override
    public double calculateArea() {
        double s = calculatePerimeter() / 2; // Semi-perimeter
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }
    
    /**
     * Override abstract method to calculate triangle perimeter
     */
    @Override
    public double calculatePerimeter() {
        return side1 + side2 + side3;
    }
    
    /**
     * Override displayInfo to include triangle-specific details
     */
    @Override
    public void displayInfo() {
        System.out.println("=== Triangle Details ===");
        System.out.println("Side 1: " + side1);
        System.out.println("Side 2: " + side2);
        System.out.println("Side 3: " + side3);
        System.out.println("Type: " + getTriangleType());
        super.displayInfo(); // Call parent method
        System.out.println("========================");
    }
    
    /**
     * Override draw method with triangle-specific implementation
     */
    @Override
    public void draw() {
        System.out.println("Drawing a triangle with sides " + side1 + ", " + side2 + ", " + side3);
        int height = (int) Math.min(side1, Math.min(side2, side3));
        
        for (int i = 1; i <= height; i++) {
            // Print spaces for alignment
            for (int j = height - i; j > 0; j--) {
                System.out.print(" ");
            }
            // Print stars
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
    /**
     * Additional method to determine triangle type
     */
    public String getTriangleType() {
        if (side1 == side2 && side2 == side3) {
            return "Equilateral";
        } else if (side1 == side2 || side2 == side3 || side1 == side3) {
            return "Isosceles";
        } else {
            return "Scalene";
        }
    }
    
    // Getters
    public double getSide1() { return side1; }
    public double getSide2() { return side2; }
    public double getSide3() { return side3; }
}