//Java program to reverse a string without using built-in string reversal functions.

import java.util.Scanner;

public class TrickyProg8{
    //Method to reverse a string
    public static String reverseString(String str){
        char[] charArray = str.toCharArray();
        String reversedStr = " ";

        //Loop to iterate over the string from the end to the beginning
        for(int i = charArray.length - 1; i >= 0; i--){
            reversedStr += charArray[i];
        }
        return reversedStr;
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        //Input the string from the user
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        //Call the reverseString method and print the result
        String reversed = reverseString(inputString);
        System.out.print("Reversed strings: " + reversed);

        scanner.close();
    }
}


//Explaination:
  reverseString(String str):
      -> The method takes a string input and converts it into a character array using toCharArray().
      -> A new string, reversedStr, is initialized as an empty string.
      -> A for loop runs from the end of the character array (charArray.length - 1) to the start (index 0), and each character is appended to reversedStr in reverse order.
      -> Finally, the reversed string is returned.



// Step-by-Step Flowchart Description:
      1. Start: The program starts execution.
        
      2. Input String: The user is prompted to enter the string to be reversed.      
        
      3. Convert String to Character Array: The string is converted into a character array (charArray) to facilitate character-by-character access.
        
      4. Initialize Empty String for Reversed Result: A string reversedStr is initialized as an empty string where the reversed characters will be stored.
        
      5. Set Loop Index to Last Character: The loop begins with the index set to charArray.length - 1 (the last character of the string).
      
      6. Check if Index is Greater Than or Equal to Zero: The loop runs as long as the index is greater than or equal to 0.
            -> Yes: If the condition is true, append the character at the current index to reversedStr. Decrement the index by 1 and repeat the loop.
            -> No: If the index becomes less than 0, the loop ends.
        
      7. Output Reversed String: After the loop ends, the reversed string (reversedStr) is printed.
      
      8. End: The program execution is complete.

