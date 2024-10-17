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
    1. Start: The program begins execution.
    2. Input the String: The user is prompted to input the string for which the length needs to be calculated.
    3. Initialize length = 0: A variable length is initialized to 0. This will keep track of the number of characters encountered.
    4. Check for a Character at Index length:
            -> The program checks whether there is a valid character at the index represented by the length variable.
    
            -> If Yes (the character exists):
                    Increment length by 1, since a valid character was found.
                    Go back to the check and repeat for the next index.
    
            -> If No (there is no character at that index):
                    Exit the loop since the end of the string has been reached.
    
    5. Output the Value of length: Once the loop finishes, the final value of length is output, representing the total number of characters in the string.
    6. End: The program concludes.
