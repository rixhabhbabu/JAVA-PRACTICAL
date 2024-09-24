import java.util.LinkedList; 
import java.util.Queue; 
// A class representing a buffer for producing and consuming items 
class Buffer { 
private Queue<Integer> queue; 
private int maxSize; 
public Buffer(int maxSize) { 
this.maxSize = maxSize; 
this.queue = new LinkedList<>(); 
} 
// Method for producing an item and adding it to the buffer 
public synchronized void produce(int item) throws InterruptedException { 
while (queue.size() == maxSize) { 
wait(); // Wait if the buffer is full 
} 
queue.add(item); // Add the item to the buffer 
System.out.println("Produced: " + item); 
notify(); // Notify waiting consumers that an item is available 
} 
// Method for consuming an item from the buffer 
public synchronized int consume() throws InterruptedException { 
while (queue.isEmpty()) { 
wait(); // Wait if the buffer is empty 
} 
int item = queue.poll(); // Remove and retrieve the item from the buffer 
System.out.println("Consumed: " + item); 
notify(); // Notify waiting producers that space is available 
return item; 
} 
} 
// A producer thread that adds items to the buffer 
class Producer implements Runnable { 
private Buffer buffer; 
public Producer(Buffer buffer) { 
this.buffer = buffer; 
} 
@Override 
public void run() { 
    try { 
        for (int i = 1; i <= 5; i++) { 
        buffer.produce(i); // Produce an item and add it to the buffer 
        Thread.sleep(1000); // Sleep for 1 second 
        } 
        } catch (InterruptedException e) { 
        Thread.currentThread().interrupt(); 
        } 
        } 
        } 
        // A consumer thread that removes items from the buffer 
        class Consumer implements Runnable { 
        private Buffer buffer; 
        public Consumer(Buffer buffer) { 
        this.buffer = buffer; 
        } 
        @Override 
        public void run() { 
        try { 
        for (int i = 1; i <= 5; i++) { 
        int item = buffer.consume(); // Consume an item from the buffer 
        Thread.sleep(1500); // Sleep for 1.5 seconds 
        } 
        } catch (InterruptedException e) { 
        Thread.currentThread().interrupt(); 
        } 
        } 
        } 
        public class Main { 
        public static void main(String[] args) { 
        // Print a message to the console 
        System.out.println("Rishabh Babu"); 
        // Create a buffer with a maximum size of 3 
        Buffer buffer = new Buffer(3); 
        // Create producer and consumer threads 
        Thread producerThread = new Thread(new Producer(buffer)); 
        Thread consumerThread = new Thread(new Consumer(buffer)); 
        // Start the producer and consumer threads 
        producerThread.start(); 
        consumerThread.start(); 
        } 
        }