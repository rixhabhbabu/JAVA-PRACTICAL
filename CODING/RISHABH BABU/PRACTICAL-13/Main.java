// Base class representing an Animal 
class Animal { 
    // Method to make a generic animal sound 
    void makeSound() { 
    System.out.println("Some generic animal sound"); 
    } 
    } 
    // Subclass Dog extends Animal 
    class Dog extends Animal { 
    // Override the makeSound method to provide a specific sound for dogs 
    @Override 
    void makeSound() { 
    System.out.println("Woof! Woof!"); 
    } 
    // Additional method specific to the Dog class 
    void display() { 
    System.out.println("This is a dog."); 
    } 
    // Method to demonstrate calling the superclass's makeSound method using 'super' 
    void makeSuperSound() { 
    super.makeSound(); // Calling the superclass's method using 'super' 
    } 
    } 
    // Main class that contains the program's entry point 
    public class Main { 
    public static void main(String[] args) { 
    // Print a message to the console 
    System.out.println("Rishabh Babu"); 
    // Create an instance of the Dog class 
    Dog dog = new Dog(); 
    // Call the display method of the Dog class 
    dog.display(); // Call subclass's method 
    // Call the overridden makeSound method of the Dog class 
    dog.makeSound(); // Call overridden method in subclass 
    // Call the makeSuperSound method to demonstrate calling the superclass's method 
    dog.makeSuperSound(); // Call superclass's method using 'super' 
    } 
    }