Q: Program: Java program to check if a given year is a leap year without using '%' Operator.

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
