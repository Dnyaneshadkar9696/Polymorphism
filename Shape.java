/**
 * Abstract Shape class demonstrating Method Overriding (Runtime Polymorphism)
 * 
 * This serves as the base class for different shapes.
 * Each subclass will override the methods to provide specific implementations.
 */
public abstract class Shape {
    protected String name;
    
    public Shape(String name) {
        this.name = name;
    }
    
    /**
     * Abstract method to calculate area - must be implemented by subclasses
     */
    public abstract double calculateArea();
    
    /**
     * Abstract method to calculate perimeter - must be implemented by subclasses
     */
    public abstract double calculatePerimeter();
    
    /**
     * Method that can be overridden by subclasses
     */
    public void displayInfo() {
        System.out.println("This is a " + name);
        System.out.println("Area: " + calculateArea());
        System.out.println("Perimeter: " + calculatePerimeter());
    }
    
    /**
     * Method that can be overridden to provide shape-specific drawing
     */
    public void draw() {
        System.out.println("Drawing a generic " + name);
    }
    
    public String getName() {
        return name;
    }
}