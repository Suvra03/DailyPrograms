//Java program to check if a given year is a leap year without using '%' Operator.

import java.util.Scanner;

public class TrickyProg1{
    //Method to check if the given year is divisible by the given divisor or not.
    public static boolean isDivisible(int year, int divisor){
        int quotient = year/divisor;

        return year == quotient * divisor;  //Multiplying q * d just to check if it is equal to the original year.
    }

    //Method to check if the given year is leap year or not
    public static boolean isLeapYear(int year){
        // Check if the year is divisible by 4
        if(isDivisible(year, 4)){
            // If divisible by 4, check if it's divisible by 100
            if(isDivisible(year, 100)){
                // If divisible by 100, it must also be divisible by 400 to be a leap year
                return isDivisible(year, 400);
            } else {
                return true;  //If divisible by 4 but not 100, it's a leap year.
            }
        }
        return false;        
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a year: ");
        int year = scanner.nextInt();

        if(isLeapYear(year)){
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }

        scanner.close();
    }
}



Flowchart Description:
    1. Start: Begin the process.
    2. Input Year: Read the year from the user.
    3. Call isLeapYear(year): Invoke the method to check if the year is a leap year.
    4. Check Divisibility by 4:
        If Yes, proceed to check divisibility by 100.
        If No, return False (the year is not a leap year).
    5. Check Divisibility by 100:
        If Yes, proceed to check divisibility by 400.
        If No, return True (the year is a leap year).
    6. Check Divisibility by 400:
        If Yes, return True (the year is a leap year).
        If No, return False (the year is not a leap year).
    7. Output Result: Display whether the year is a leap year or not.
    8. End: Terminate the program.

Flowchart: 
        Start
            ↓
        Input Year
            ↓
        Call isLeapYear(year)
                ↓
            Is year divisible by 4?
                ↓
               Yes
                ↓
            Is year divisible by 100?
                ↓
               Yes
                ↓
            Is year divisible by 400?
                ↓
               Yes             Noo
                ↓               ↓
            Return True     Return False
            ↓
           Noo
            ↓
        Return False
            ↓
        Output result
            ↓
           End

