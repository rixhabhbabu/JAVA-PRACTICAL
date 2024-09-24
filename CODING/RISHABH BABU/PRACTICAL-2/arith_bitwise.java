class arith_bitwise { 
// This is the main method, where the program starts execution. 
public static void main(String[] args) 
{ 
 
System.out.println("Rishabh Babu"); 
// Declare and initialize two integer variables, 'a' and 'b'. 
int a = 20; 
int b = 10; 
// Perform addition, subtraction, multiplication, division, and modulo operations on 'a' and 'b'. 
int A = a + b; 
System.out.println("Addition: " + A); 
int S = a - b; 
System.out.println("Subtraction: " + S); 
int M = a * b; 
System.out.println("Multiplication: " + M); 
int D = a / b; 
System.out.println("Division: " + D); 
int R = a % b; 
System.out.println("Remainder: " + R); 
// Bitwise Operations 
int x = 12; // 1100 in Binary 
int y = 6; // 0110 in Binary 
// Perform bitwise OR, bitwise AND, bitwise NOT, bitwise XOR, 
// bitwise right shift, and bitwise left shift operations on 'x' and 'y'. 
int Or = x | y; 
System.out.println("Bitwise OR: " + Or); 
int And = x & y; 
System.out.println("Bitwise AND: " + And); 
int NotX = ~x; 
System.out.println("Bitwise NOT of x: " + NotX); 
int NotY = ~y; 
System.out.println("Bitwise NOT of y: " + NotY); 
int Xor = x ^ y; 
System.out.println("Bitwise XOR: " + Xor); 
int rightShift = x >> 2; 
System.out.println("Bitwise Right Shift: " + rightShift); 
int leftShift = x << 2; 
System.out.println("Bitwise Left Shift: " + leftShift);
}
}