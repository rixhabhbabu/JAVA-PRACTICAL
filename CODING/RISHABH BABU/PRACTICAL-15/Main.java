// OuterClass represents the outer class 
class OuterClass { 
    private int outerValue = 10; // Private member variable of the outer class 
    // InnerClass represents the inner class within OuterClass 
    class InnerClass { 
    // Method to display the value of outerValue from the outer class 
    void display() { 
    System.out.println("Value from InnerClass: " + outerValue); 
    } 
    } 
    // Method in the outer class to create and use the inner class 
    void useInnerClass() { 
    InnerClass inner = new InnerClass(); // Create an instance of the inner class 
    inner.display(); // Call the display method of the inner class 
    } 
    } 
    // Main class that contains the program's entry point 
    public class Main { 
    public static void main(String[] args) { 
    // Print a message to the console 
    System.out.println("Rishabh Babu"); 
    // Create an instance of the OuterClass 
    OuterClass outer = new OuterClass(); 
    // Call the useInnerClass method to demonstrate using the inner class 
    outer.useInnerClass(); 
    } 
    } 