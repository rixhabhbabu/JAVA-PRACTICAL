import java.util.Random; 
// A Runnable class that generates random numbers 
class RandomNumberGenerator implements Runnable { 
@Override 
public void run() { 
Random random = new Random(); 
while (true) { 
int number = random.nextInt(100); // Generate a random integer between 0 and 99 
System.out.println("Generated: " + number); 
/* Depending on whether the number is even or odd, create and 
start threads for square or cube calculation */
if (number % 2 == 0) { 
Thread t2 = new Thread(new SquareCalculator(number)); 
t2.start(); // Start the square calculator thread 
} else { 
Thread t3 = new Thread(new CubeCalculator(number)); 
t3.start(); // Start the cube calculator thread 
} 
try { 
Thread.sleep(1000); // Sleep for 1 second 
} catch (InterruptedException e) { 
Thread.currentThread().interrupt(); 
} 
} 
} 
} 
// A Runnable class that calculates the square of a number 
class SquareCalculator implements Runnable { 
private int number; 
public SquareCalculator(int number) { 
this.number = number; 
} 
@Override 
public void run() {
    int square = number * number; 
System.out.println("Square of " + number + ": " + square); 
} 
} 
// A Runnable class that calculates the cube of a number 
class CubeCalculator implements Runnable { 
private int number; 
public CubeCalculator(int number) { 
this.number = number; 
} 
@Override 
public void run() { 
int cube = number * number * number; 
System.out.println("Cube of " + number + ": " + cube); 
} 
} 
public class Main { 
public static void main(String[] args) { 
// Print a message to the console 
System.out.println("Rishabh Babu"); 
// Create and start the random number generator thread 
Thread t1 = new Thread(new RandomNumberGenerator()); 
t1.start(); 
} 
} 