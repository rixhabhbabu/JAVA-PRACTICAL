import java.util.Scanner; 
public class Main { 
public static void main(String[] args) { 
// Print a message to the console 
System.out.println("Rishabh Babu"); 
// Create a Scanner object to read user input 
Scanner scanner = new Scanner(System.in); 
// Prompt the user to enter a string 
System.out.print("Enter a string: "); 
String input = scanner.nextLine(); 
// Check if the input string is a palindrome and display the result 
if (isPalindrome(input)) { 
System.out.println("The string is a palindrome."); 
} else { 
System.out.println("The string is not a palindrome."); 
} 
} 
// Function to check if a string is a palindrome 
public static boolean isPalindrome(String str) { 
str = str.toLowerCase(); // Convert the string to lowercase for case-insensitive comparison 
int left = 0; 
int right = str.length() - 1; 
// Compare characters from the beginning and end of the string 
while (left < right) { 
if (str.charAt(left) != str.charAt(right)) { 
return false; // If characters do not match, it's not a palindrome 
} 
left++; 
right--; 
} 
return true; // If the loop completes without finding a mismatch, it's a palindrome 
} 
}