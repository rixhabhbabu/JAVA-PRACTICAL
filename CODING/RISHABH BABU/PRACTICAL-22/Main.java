// Custom exception class that extends Exception 
class CustomException extends Exception { 
    public CustomException(String message) { 
    super(message); 
    } 
    } 
    public class Main { 
    public static void main(String[] args) { 
    // Print a message to the console 
    System.out.println("Rishabh Babu"); 
    try { 
    // Attempt to set a negative age 
    int age = -5; 
    if (age < 0) { 
    // Throw a CustomException with a custom error message 
    throw new CustomException("Age cannot be negative"); 
    } 
    System.out.println("Age: " + age); 
    } catch (CustomException e) { 
    // Catch and handle the CustomException 
    System.out.println("CustomException caught: " + e.getMessage()); 
    } 
    } 
    }