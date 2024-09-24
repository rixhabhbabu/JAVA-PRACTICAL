// Interface for a vehicle 
interface Vehicle { 
    void start(); // Method to start the vehicle 
    void stop(); // Method to stop the vehicle 
    } 
    // Interface for a music player 
    interface MusicPlayer { 
    void playMusic(); // Method to play music 
    void stopMusic(); // Method to stop music 
    } 
    // Class representing a Car 
    class Car implements Vehicle, MusicPlayer { 
    // Implementing the start method from the Vehicle interface 
    @Override 
    public void start() { 
    System.out.println("Car started."); 
    } 
    // Implementing the stop method from the Vehicle interface 
    @Override 
    public void stop() { 
    System.out.println("Car stopped."); 
    } 
    // Implementing the playMusic method from the MusicPlayer interface 
    @Override 
    public void playMusic() { 
    System.out.println("Music playing in the car."); 
    } 
    // Implementing the stopMusic method from the MusicPlayer interface 
    @Override 
    public void stopMusic() { 
    System.out.println("Music stopped in the car."); 
    } 
    } 
    // Main class that contains the program's entry point 
    public class Main { 
    public static void main(String[] args) { 
    // Print a message to the console 
    System.out.println("Rishabh Babu"); 
    // Create an instance of the Car class 
    Car car = new Car(); 
  
 
// Call various methods to demonstrate vehicle and music player functionality 
car.start(); 
car.playMusic(); 
car.stopMusic(); 
car.stop(); 
} 
} 