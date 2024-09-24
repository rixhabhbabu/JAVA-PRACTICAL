import java.util.Scanner; 
public class Main { 
public static void main(String[] args) { 
// Print a message to the console 
System.out.println("Rishabh Babu"); 
// Create a Scanner object to read user input 
Scanner scanner = new Scanner(System.in); 
// Prompt the user to enter text with instructions 
System.out.println("Enter your text (Enter an empty line to finish):"); 
int charCount = 0; // Variable to count characters 
int wordCount = 0; // Variable to count words 
int lineCount = 0; // Variable to count lines 
// Continue reading lines of text until an empty line is entered 
while (true) { 
String line = scanner.nextLine(); 
if (line.isEmpty()) { 
break; // Exit the loop when an empty line is entered 
} 
// Count characters by adding the length of the line 
charCount += line.length(); 
// Split the line into words using space as a delimiter and count words 
String[] words = line.split("\\s+"); 
wordCount += words.length; 
// Increment the line count for each line read 
lineCount++; 
} 
// Display the counts of characters, words, and lines 
System.out.println("Character count: " + charCount); 
System.out.println("Word count: " + wordCount); 
System.out.println("Line count: " + lineCount); 
} 
} 