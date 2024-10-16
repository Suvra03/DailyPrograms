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
