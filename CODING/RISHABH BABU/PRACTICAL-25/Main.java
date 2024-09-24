import java.util.ArrayList; 
 class Main { 
public static void main(String[] args) { 
// Print a message to the console 
System.out.println("Rishabh Babu"); 
// Create an ArrayList of integers called dynamicArray 
ArrayList<Integer> dynamicArray = new ArrayList<>(); 
// Add elements to the ArrayList 
dynamicArray.add(10); 
dynamicArray.add(20); 
dynamicArray.add(30); 
dynamicArray.add(40); 
// Print the contents of the array 
System.out.println("Contents of the array:"); 
for (int i = 0; i < dynamicArray.size(); i++) { 
System.out.println(dynamicArray.get(i)); // Get and print the element at index 'i' 
} 
} 
} 