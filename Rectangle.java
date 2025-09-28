/**
 * Rectangle class demonstrating Method Overriding
 * 
 * This class extends Shape and provides specific implementations
 * for abstract methods and overrides other methods as needed.
 */
public class Rectangle extends Shape {
    private double length;
    private double width;
    
    public Rectangle(double length, double width) {
        super("Rectangle");
        this.length = length;
        this.width = width;
    }
    
    /**
     * Override abstract method to calculate rectangle area
     */
    @Override
    public double calculateArea() {
        return length * width;
    }
    
    /**
     * Override abstract method to calculate rectangle perimeter
     */
    @Override
    public double calculatePerimeter() {
        return 2 * (length + width);
    }
    
    /**
     * Override displayInfo to include rectangle-specific details
     */
    @Override
    public void displayInfo() {
        System.out.println("=== Rectangle Details ===");
        System.out.println("Length: " + length);
        System.out.println("Width: " + width);
        super.displayInfo(); // Call parent method
        System.out.println("========================");
    }
    
    /**
     * Override draw method with rectangle-specific implementation
     */
    @Override
    public void draw() {
        System.out.println("Drawing a rectangle with length " + length + " and width " + width);
        System.out.println("┌" + "─".repeat((int)(length * 2)) + "┐");
        for (int i = 0; i < width; i++) {
            System.out.println("│" + " ".repeat((int)(length * 2)) + "│");
        }
        System.out.println("└" + "─".repeat((int)(length * 2)) + "┘");
    }
    
    // Getters
    public double getLength() { return length; }
    public double getWidth() { return width; }
}