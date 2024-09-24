import java.util.Scanner; 
// Main class that contains the program's entry point. 
public class Main { 
// Function to check if a number is prime 
public static boolean isPrime(int num) { 
// Check if the number is less than or equal to 1; such numbers are not prime. 
if (num <= 1) { 
return false; 
} 
// Check if the number is 2 or 3; they are prime. 
if (num <= 3) { 
return true; 
} 
// Check if the number is divisible by 2 or 3; if yes, it's not prime. 
if (num % 2 == 0 || num % 3 == 0) { 
return false; 
} 
// Check for prime numbers using the 6k +/- 1 rule. 
for (int i = 5; i * i <= num; i += 6) { 
if (num % i == 0 || num % (i + 2) == 0) { 
return false; 
} 
} 
return true; 
} 
public static void main(String[] args) { 
// Print a message to the console. 
System.out.println("Prince_Chhodavadiya"); 
// Create a Scanner object to read user input. 
Scanner scanner = new Scanner(System.in); 
// Prompt the user to enter an integer. 
System.out.print("Enter an integer: "); 
int n = scanner.nextInt(); 
// Display prime numbers up to the entered integer. 
System.out.println("Prime numbers up to " + n + ":"); 
for (int i = 2; i <= n; i++) { 
if (isPrime(i)) { 
System.out.print(i + " "); 
}}
}}