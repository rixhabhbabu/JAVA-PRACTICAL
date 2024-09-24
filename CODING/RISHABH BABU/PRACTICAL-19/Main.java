import java.util.Scanner; 
import java.util.StringTokenizer; 
public class Main { 
public static void main(String[] args) { 
// Print a message to the console 
System.out.println("Rishabh Babu10"); 
// Create a Scanner object to read user input 
Scanner scanner = new Scanner(System.in); 
// Prompt the user to enter a line of integers separated by spaces 
System.out.print("Enter a line of integers separated by spaces: "); 
String inputLine = scanner.nextLine(); 
// Create a StringTokenizer to tokenize the input string 
StringTokenizer tokenizer = new StringTokenizer(inputLine); 
int sum = 0; // Initialize the sum to zero 
// Display a message indicating the integers and their sum 
System.out.println("Integers and their sum:"); 
// Iterate through the tokens (integers) in the input string 
while (tokenizer.hasMoreTokens()) { 
String token = tokenizer.nextToken(); // Get the next token (string) 
int number = Integer.parseInt(token); // Parse the token to an integer 
System.out.println(number); // Print the integer 
sum += number; // Add the integer to the sum 
} 
// Display the sum of all integers in the input 
System.out.println("Sum of all integers: " + sum); 
} 
}