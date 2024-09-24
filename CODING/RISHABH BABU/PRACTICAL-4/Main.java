import java.util.Scanner; 
// Create a class named Employee to represent an employee's information. 
class Employee { 
// Declare instance variables for name, age, and salary. 
String name; 
int age; 
double salary; 
// Method to input employee details. 
public void inputDetails() { 
// Create a Scanner object to read user input. 
Scanner scanner = new Scanner(System.in); 
// Prompt the user to enter the employee's name and read it as a string. 
System.out.print("Enter employee name: "); 
name = scanner.nextLine(); 
// Prompt the user to enter the employee's age and read it as an integer. 
System.out.print("Enter employee age: "); 
age = scanner.nextInt(); 
// Prompt the user to enter the employee's salary and read it as a double. 
System.out.print("Enter employee salary: "); 
salary = scanner.nextDouble(); 
} 
// Method to display employee details. 
public void displayDetails() { 
// Print a header for the employee details. 
System.out.println("\nEmployee Details:"); 
// Print the employee's name, age, and salary. 
System.out.println("Name: " + name); 
System.out.println("Age: " + age); 
System.out.println("Salary: " + salary); 
} 
} 
// Main class that contains the program's entry point. 
public class Main { 
public static void main(String[] args) { 
// Print a message to the console. 
System.out.println("Rishabh Babu");
Employee employee = new Employee(); 
// Call the inputDetails method to input the employee's information. 
employee.inputDetails(); 
// Call the displayDetails method to display the employee's information. 
employee.displayDetails(); 
} }