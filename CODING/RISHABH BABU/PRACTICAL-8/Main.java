import java.util.Scanner; 
// Main class that contains the program's entry point. 
public class Main { 
public static void main(String[] args) { 
// Print a message to the console. 
System.out.println("Rishabh Babu"); 
// Create a Scanner object to read user input. 
Scanner scanner = new Scanner(System.in); 
// Prompt the user to enter the dimensions of the first and second matrices. 
System.out.print("Enter the number of rows in the first matrix: "); 
int rowsA = scanner.nextInt(); 
System.out.print("Enter the number of columns in the first matrix: "); 
int colsA = scanner.nextInt(); 
System.out.print("Enter the number of rows in the second matrix: "); 
int rowsB = scanner.nextInt(); 
System.out.print("Enter the number of columns in the second matrix: "); 
int colsB = scanner.nextInt(); 
// Check if matrix multiplication is possible by comparing dimensions. 
if (colsA != rowsB) { 
    System.out.println("Matrix multiplication is not possible."); 
    return; 
    } 
    // Create arrays to store the first and second matrices. 
    int[][] matrixA = new int[rowsA][colsA]; 
    int[][] matrixB = new int[rowsB][colsB]; 
    // Prompt the user to enter elements of the first matrix. 
    System.out.println("Enter elements of the first matrix:"); 
    for (int i = 0; i < rowsA; i++) { 
    for (int j = 0; j < colsA; j++) { 
    matrixA[i][j] = scanner.nextInt(); 
    } 
    } 
    // Prompt the user to enter elements of the second matrix. 
    System.out.println("Enter elements of the second matrix:"); 
    for (int i = 0; i < rowsB; i++) { 
    for (int j = 0; j < colsB; j++) { 
    matrixB[i][j] = scanner.nextInt(); 
    } 
} 

// Call the multiplyMatrices function to perform matrix multiplication. 
int[][] resultMatrix = multiplyMatrices(matrixA, matrixB, rowsA, colsA, colsB); 
// Display the resultant matrix after multiplication. 
System.out.println("Resultant matrix after multiplication:"); 
for (int i = 0; i < rowsA; i++) { 
for (int j = 0; j < colsB; j++) { 
System.out.print(resultMatrix[i][j] + " "); 
} 
System.out.println(); 
} 
}
// Function to multiply two matrices. 
public static int[][] multiplyMatrices(int[][] A, int[][] B, int rowsA, int colsA, int colsB) { 
    int[][] result = new int[rowsA][colsB]; 
    for (int i = 0; i < rowsA; i++) { 
    for (int j = 0; j < colsB; j++) { 
    result[i][j] = 0; 
    for (int k = 0; k < colsA; k++) { 
    result[i][j] += A[i][k] * B[k][j]; 
    } }   } 
    return result; 
    }   }