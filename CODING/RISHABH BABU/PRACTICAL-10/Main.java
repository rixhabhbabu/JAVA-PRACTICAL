// Create a class named Overloading to demonstrate overloading. 
class Overloading { 
    // Constructor overloading 
    // Default constructor 
    public Overloading() { 
    System.out.println("Default constructor"); 
    } 
    // Parameterized constructor with an integer argument 
    public Overloading(int x) { 
    System.out.println("Parameterized constructor with int: " + x); 
    } 
    // Parameterized constructor with a double argument 
    public Overloading(double y) { 
    System.out.println("Parameterized constructor with double: " + y); 
    } 
    // Method overloading 
    // Method to add two integers 
    public int add(int a, int b) { 
    return a + b; 
    } 
    // Method to add two doubles 
    public double add(double a, double b) { 
    return a + b; 
    } 
    // Method to concatenate two strings 
    public String add(String s1, String s2) { 
    return s1 + s2; 
    } 
    } 
    // Main class that contains the program's entry point. 
    public class Main { 
    public static void main(String[] args) { 
    // Print a message to the console. 
    System.out.println("Rishabh Babu"); 
    // Create instances of the Overloading class with different constructors. 
    Overloading obj = new Overloading(); // Default constructor
    Overloading objInt = new Overloading(10); // Parameterized constructor with int 
Overloading objDouble = new Overloading(5.5); // Parameterized constructor with double 
// Call overloaded methods to perform additions and string concatenation. 
int result1 = obj.add(5, 3); 
double result2 = obj.add(2.5, 3.7); 
String result3 = obj.add("Hello, ", "world!"); 
// Display the results of method overloading. 
System.out.println("Result of int addition: " + result1); 
System.out.println("Result of double addition: " + result2); 
System.out.println("Result of string concatenation: " + result3); 
} 
}