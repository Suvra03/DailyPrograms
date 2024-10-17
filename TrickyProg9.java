//Java program to generate random number without utilizing the random module

import java.util.Scanner;

public class TrickyProg9{
    //Method to generate random numberm using system time in nanoseconds (System.nanoTime()) and some bitwise operations to create pseudo-randomness.
    public static int generateRandomNumber(int min, int max){
        //Calculate the range of possible values
        long timeSeed = System.nanoTime();      //Getting the current system time in nanoseconds

        //Performing a linear transformation to improve randomness
        timeSeed ^= (timeSeed << 21); 
        timeSeed ^= (timeSeed >>> 35);
        timeSeed ^= (timeSeed << 4);

        long seed =Math.abs(timeSeed % (max - min + 1));  //Using Math.abs to ensure non-negative values within the range
        return(int)(seed + min);
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        //Input the minimum and maximum range
        int min = 1;
        int max = 50;

        //Generate and print a random number within the range
        int randomNumber = generateRandomNumber(min, max);
        System.out.print("Generated random number is: " + randomNumber);

        scanner.close();
    }
}


// Method explaination:
    1. System.nanoTime(): The program starts by fetching the current system time in nanoseconds, which changes rapidly and provides a variable source for randomness.
      
    2. Bitwise Operations: It applies several bitwise XOR and shift operations (^ and <<, >>) to the timeSeed. These operations "scramble" the seed value, increasing randomness.
      
    3. Modulo Operation: The result of the bitwise transformations is then taken modulo (max - min + 1) to restrict the random number within the given range.
			
    4. Math.abs(): This ensures that the random number is positive and within the valid range.
			
    5. The method returns the random number by adjusting it to fit the user-specified range [min, max].








			
