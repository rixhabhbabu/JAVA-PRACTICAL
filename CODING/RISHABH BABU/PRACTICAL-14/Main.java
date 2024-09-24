// Interface for a shape 
interface Shape { 
    double calculateArea(); // Method to calculate the area of the shape 
    double calculatePerimeter(); // Method to calculate the perimeter of the shape 
    } 
    // Class representing a rectangle that implements the Shape interface 
    class Rectangle implements Shape { 
    double length; 
    double width; 
    // Constructor to initialize the rectangle with length and width 
    Rectangle(double length, double width) { 
    this.length = length; 
    this.width = width; 
    } 
    // Implementing the calculateArea method from the Shape interface 
    @Override 
    public double calculateArea() { 
    return length * width; 
    } 
    // Implementing the calculatePerimeter method from the Shape interface 
    @Override 
    public double calculatePerimeter() { 
    return 2 * (length + width); 
    } 
    } 
    // Main class that contains the program's entry point 
    public class Main { 
    public static void main(String[] args) { 
    // Print a message to the console 
    System.out.println("Rishabh Babu"); 
    // Create an instance of the Rectangle class with specified dimensions 
    Rectangle rectangle = new Rectangle(4.0, 6.0); 
    // Calculate the area and perimeter of the rectangle 
    double area = rectangle.calculateArea(); 
    double perimeter = rectangle.calculatePerimeter(); 
    // Display the calculated area and perimeter 
    System.out.println("Rectangle Area: " + area);
    System.out.println("Rectangle Perimeter: " + perimeter); 
} 
} 