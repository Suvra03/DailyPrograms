Q: Java program to check whether a number is even or odd without using the modulus(%) operator.
	-> This program can be done using Bitwise AND(&) operator. 
	Bitwise AND(&): A number is even if its least significant bit (rightmost bit) is 0, and odd if it is 1.
	By performing a bitwise AND operation between the number and 1, we can check the least significant bit.
	For even numbers, the result will be 0.
	For odd numbers, the result will be 1.

	
import java.util.Scanner;

public class TrickyProg2{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int num = scanner.nextInt();

        //Check if the number is even or odd
        if(isEven(num)){
            System.out.print(num + " is Even.");
        }else{
            System.out.print(num + " is Odd.");
        }

        scanner.close();
    }

    //Method to check is the number is even or not using Bitwise AND(&)
    public static boolean isEven(int num){
        // Check if the least significant bit is 0
        return (num & 1) == 0;
    }
}

