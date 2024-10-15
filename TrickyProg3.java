Q: Java program to print numbers from 1 to 100 without using loops.
  -> To print numbers from 1 to 100 without using loops, we can make use of recursion.
    In recursion, a method calls itself repeatedly until a base condition is met. Here, we can recursively print the numbers from 1 to 100.

public class TrickyProg3{
    public static void main(String[] args){
        //Start recursion with the first number(1)
        printNumbers(1);
    }

    //Recursive method to print numbers from 1 to 100
    public static void printNumbers(int number){
        //Base case: stop when numbers exceeds 100
        if(number > 100){
            return;
        }

        //Print the current number
        System.out.print(number + " ");

        //Recursive call for the next number
        printNumbers(number + 1);
    }
}


Flowchart Description:
  1. Start
  2. Call Recursive Method (printNumbers) with n = 1
  3. Check if n <= 100:
        If true: Print n and call printNumbers(n+1).
        If false: Exit the recursion (end).
  4. End

Flowchart: 
          Start
              ↓
          printNumbers(1)
              ↓
          Is n > 100?
              ↓
          If No: Print n
              ↓
          Call printNumbers(n+1)
              ↓
          If Yes: End
