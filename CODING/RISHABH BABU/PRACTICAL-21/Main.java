public class Main { 
    public static void main(String[] args) { 
    // Print a message to the console 
    System.out.println("Rishabh Babu"); 
    try { 
    // Attempt to access an element outside the bounds of the array 
    int[] numbers = { 1, 2, 3 }; 
    System.out.println(numbers[5]); // This will throw an ArrayIndexOutOfBoundsException 
    } catch (ArrayIndexOutOfBoundsException e) { 
    // Handle the specific exception for array index out of bounds 
    System.out.println("Array index out of bounds!"); 
    } 
    try { 
    // Attempt to access the length of a null string 
    String str = null; 
    System.out.println(str.length()); // This will throw a NullPointerException 
    } catch (NullPointerException e) { 
    // Handle the specific exception for a null pointer 
    System.out.println("NullPointerException occurred!"); 
    } 
    try { 
    // Attempt to perform division by zero 
    int result = 10 / 0; // This will throw an ArithmeticException 
    System.out.println("Result: " + result); 
    } catch (ArithmeticException e) { 
    // Handle the specific exception for arithmetic errors 
    System.out.println("ArithmeticException occurred!"); 
    } finally { 
    // This block is executed regardless of whether an exception was thrown 
    System.out.println("Finally block executed."); 
    } 
    // Display a message indicating that the program has completed 
    System.out.println("Program completed."); 
    } 
    }