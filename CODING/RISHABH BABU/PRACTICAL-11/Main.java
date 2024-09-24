// Abstract class 
abstract class Shape { 
    // Abstract method (no implementation) 
    abstract double calculateArea(); 
    // Concrete method 
    void display() { 
    System.out.println("This is a shape."); 
    } 
    } 
    // Concrete subclass (Circle) 
    class Circle extends Shape { 
    double radius; 
    // Constructor to initialize the circle with a radius 
    Circle(double radius) { 
    this.radius = radius; 
    } 
    // Override the abstract method to calculate the area of the circle 
    @Override 
    double calculateArea() { 
    return Math.PI * radius * radius; 
    } 
    } 
    // Concrete subclass (Rectangle) 
    class Rectangle extends Shape { 
    double length; 
    double width; 
    // Constructor to initialize the rectangle with length and width 
    Rectangle(double length, double width) { 
    this.length = length; 
    this.width = width; 
    } 
    // Override the abstract method to calculate the area of the rectangle 
    @Override 
    double calculateArea() { 
    return length * width; 
    } 
    } 
    // Main class that contains the program's entry point 
    public class Main {
        public static void main(String[] args) { 
            // Print a message to the console 
            System.out.println("Rishabh Babu"); 
            // Create instances of Circle and Rectangle 
            Circle circle = new Circle(5.0); 
            Rectangle rectangle = new Rectangle(4.0, 6.0); 
            // Call the display method and calculateArea method for Circle 
            circle.display(); 
            System.out.println("Circle Area: " + circle.calculateArea()); 
            // Call the display method and calculateArea method for Rectangle 
            rectangle.display(); 
            System.out.println("Rectangle Area: " + rectangle.calculateArea()); 
            } 
            } 