//Java program to find the second largest number in a list without sorting.

import java.util.Scanner;

public class TrickyProg7{
    //Method to find the second largest number in the array
    public static int findSecondLargest(int[] numbers){
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        //Loop through each number in the array
        for(int number : numbers){
            if(number > largest){
                //Update secondLargest and largest
                secondLargest = largest;
                largest = number;
            } else if (number > secondLargest && number != largest){
                //Update secondLargest only
                secondLargest = number;
            }
        }
        return secondLargest;
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        //Input the size of the array
        System.out.print("Enter the number of elements in the list: ");
        int size = scanner.nextInt();

        //Input the elements of the array
        int[] numbers = new int[size];
        System.out.print("Enter the numbers: ");
        for(int i = 0; i < size; i++){
            numbers[i] = scanner.nextInt();
        }

        //Find and print the second largest number
        int secondLargest = findSecondLargest(numbers);
        System.out.print("The second largest number is: " + secondLargest);

        scanner.close();
    }
}

// Explanation:
  findSecondLargest(int[] numbers):
      -> largest is initialized to Integer.MIN_VALUE (the smallest possible value), so that any number in the array will be larger than it initially.
      -> secondLargest is also initialized to Integer.MIN_VALUE to track the second largest value.
      -> We iterate through the array using a for loop.
            If the current number is greater than largest, we first update secondLargest to be the current largest, and then update largest to the current number.
            If the current number is smaller than largest but larger than secondLargest, we update secondLargest to be the current number.
      -> After the loop ends, secondLargest contains the second largest number.


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
      
