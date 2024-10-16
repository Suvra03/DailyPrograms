//Java program to add two numbers without using "+" operator.

// In this Java program, we are adding two numbers without using the + operator by relying on bitwise operations. The primary operations we use are:
// Bitwise XOR (^): This simulates addition without considering carries.
// Bitwise AND (&) and Left Shift (<<): This calculates the carry and shifts it to the left for the next addition.

  
public class TrickyProg5{
    //Method to add two numbers without using "+" operator
    public static int add(int a, int b){
        while(b != 0){
            //Calculates the carry using AND and left shift
            int carry = (a & b) << 1;

            //XOR gives the sum without carry
            a = a ^ b;

            //Assign carry to b for the next iteration
            b = carry;
        }
        return a;
    }

    public static void main(String[] args){
        int num1 = 15;
        int num2 = 27;

        //Calling the add method
        int result = add(num1, num2);

        //Displaying the result
        System.out.print("Sum: " + result);
    }
}




// Explaination:
  1. add(int a, int b):
        -> This method calculates the sum of a and b without using the + operator.
        -> The method keeps performing bitwise operations until no carry remains (i.e., until b == 0).
        ->  a ^ b adds the numbers without carrying the bits.
        -> (a & b) << 1 calculates the carry, which is shifted left to the next position, to add it later.
    
  2. Loop:
        -> The process is repeated until the carry becomes zero. Once b (the carry) is zero, the sum is stored in a.
    
  3. Main Method:
        -> Takes two numbers (15 and 27), calls the add() method, and prints the result.


// Flowchart:
              Start
                ↓
Input first number (a) and second number (b)
                ↓
      Is b (carry) equal to 0?
                ↓
                No
                ↓
    Calculate carry: (a & b) << 1
                ↓
    Calculate sum without carry: a = a ^ b
                ↓
    Assign carry to b: b = carry
                ↓
        Repeat until b == 0
                ↓
               Yes
                ↓
        Output the sum: a
                ↓
               End


// Execution: 
    First Iteration:
        a = 15, b = 27
        Carry = (15 & 27) << 1 = 11 << 1 = 22
        Sum without carry = 15 ^ 27 = 20
        Assign carry to b: b = 22
  
    Second Iteration:
        a = 20, b = 22
        Carry = (20 & 22) << 1 = 20 << 1 = 40
        Sum without carry = 20 ^ 22 = 2
        Assign carry to b: b = 40
  
    Third Iteration:
        a = 2, b = 40
        Carry = (2 & 40) << 1 = 0 << 1 = 0
        Sum without carry = 2 ^ 40 = 42
        Assign carry to b: b = 0
  
    Termination:
        b = 0, so the loop exits, and the result a = 42 is printed.
