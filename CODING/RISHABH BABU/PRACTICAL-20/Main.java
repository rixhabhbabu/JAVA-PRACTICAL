import java.util.InputMismatchException; 
import java.util.Scanner; 
public class Main { 
public static void main(String[] args) { 
// Print a message to the console 
System.out.println("Rishabh Babu"); 
// Create a Scanner object to read user input 
Scanner scanner = new Scanner(System.in); 
try { 
// Prompt the user to enter a number 
System.out.print("Enter a number: "); 
int number = scanner.nextInt(); // Read an integer from the user 
// Perform a division operation that may throw an ArithmeticException if 'number' is 0 
int result = 10 / number; 
// Display the result of the division 
System.out.println("Result: " + result); 
} catch (InputMismatchException e) { 
// Handle the case where the user enters invalid input (non-integer) 
System.out.println("Invalid input! Please enter a valid number."); 
} catch (ArithmeticException e) { 
// Handle the case where division by zero occurs 
System.out.println("Error: Division by zero."); 
} catch (Exception e) { 
// Handle any other unexpected exceptions 
System.out.println("An unexpected error occurred."); 
} finally { 
// This block is executed regardless of whether an exception was thrown 
System.out.println("Execution completed."); 
scanner.close(); // Close the scanner to prevent resource leakage 
} 
} 
} 