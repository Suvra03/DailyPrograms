//Java Program to Find the Length of a String Without Using length() method.
import java.util.Scanner;

public class TrickyProg6{
    //Method to calculate the length of a string without using length()
    public static int getStringLength(String str){
        int length = 0;

        for(char c : str.toCharArray()){
            length++;
        }
        return length;
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        int length = getStringLength(inputString);

        System.out.print("The length of the string is: " + length);
        scanner.close();
    }
}


//Explanation:
getStringLength(String str):
    1. This method calculates the length of the string by iterating through it.
    2. The toCharArray() method converts the string into a character array, and we use a for-each loop to iterate through each character.
    3. For each character encountered, we increment the length variable by 1.
    4. Finally, the method returns the value of length, which is the total number of characters in the string.

//Step By Step Flowchart:
    1. Start: The program execution begins.
    2. Input the Number of Elements (n): The user provides the number of elements in the list.
    3. Initialize Variables:
            largest is initialized to Integer.MIN_VALUE.
            secondLargest is initialized to Integer.MIN_VALUE.
    4. Input the Array Elements: The user inputs the array of numbers.
    5. Check for Each Number:
            Is the number greater than largest?
               -> If Yes, update secondLargest = largest and largest = number.
               -> If No, check:

            Is the number greater than secondLargest and not equal to largest?
                -> If Yes, update secondLargest = number.
    
    6. Repeat for All Numbers: Go back and process the next number until all numbers are checked.
    7. Output the secondLargest: Once the loop ends, output the second largest number.
    8. End: The program finishes execution.
