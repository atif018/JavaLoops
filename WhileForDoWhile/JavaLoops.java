/* The purpose of this program is to show a working demonstration of While, For 
 * and Do-While loops */
 
 import java.util.Scanner;
 
 public class JavaLoops
 
 {
     
     public static void main (String[] args) 
     
     {
         
         run();
         
     }
     
     public static void run() 
     
     {
         
         int firstNumber; // First number that will be input by user
         int secondNumber; // First number that will be input by user
         int goal = 0; // Number of numbers that the user wants totalled
         
         Scanner input = new Scanner(System.in);
         
         System.out.println("This program will total all numbers from your first number to your second number using a While loop.");
         System.out.println("Example: If your first number is 1 and your second number is 5, it will total all the numbers from 1 to 5 and give you the result. In this example, the total would be 15.");
         System.out.println("Please enter your first number: ");
         firstNumber = input.nextInt();
         System.out.println("Please enter your second number: ");
         secondNumber = input.nextInt();
         
         while (firstNumber <= secondNumber) // Checks that they don't have the same value otherwise while loop will end
         {
             
             goal = goal + firstNumber; // Simply adds firstNumber to goal with each iteration.
             firstNumber++; // Increases firstNumber by 1 each time the loop is repeated.
         
         }
         
         System.out.println("The total is: " + goal);
     
         System.out.println("This part of the program will total all numbers from your first number to your second number using a For loop.");
         System.out.println("Example: If your first number is 1 and your second number is 5, it will total all the numbers from 1 to 5 and give you the result. In this example, the total would be 15.");
         System.out.println("Please enter your first number: ");
         firstNumber = input.nextInt();
         System.out.println("Please enter your second number: ");
         secondNumber = input.nextInt();
         
         goal = 0;
         
         for (int i = firstNumber; i <= secondNumber; i++)
         
         {
             
             goal = goal + i; // Simply adds firstNumber to value in goal with each iteration.
             
         }
         
         System.out.println("The total is: " + goal);
         
         System.out.println("This part of the program will print a box of a height and width as instructed by the user.");
         System.out.println("Example: If your first number is 4 and your second number is 5, it will print a box of height 4 and width 5.");
         System.out.println("Please enter your first number: ");
         firstNumber = input.nextInt();
         System.out.println("Please enter your second number: ");
         secondNumber = input.nextInt();
         
         for (int i = 1; i <= firstNumber; i++) // Will start with row 1
         
         {
             
             for (int j = 1; j <= secondNumber; j++) // Will start with column 1 and repeat until row is completed.
             
             {
             
                 System.out.print("*");
             
             }
             
             System.out.println();
         }
         
         double initialBalance;
         double percentPerYear;
         double targetBalance;
         
         System.out.println("This part of the program will ask how long it will take to save up from an initial bank account balance to a target balance using a Do-While loop.");
         System.out.println("It will ask three things: Your current bank account balance, how much the user anticipates the balance to grow per year and then the target balance.");
         System.out.println("The result will show how many years it will take to reach the target balance.");
         System.out.println("Please enter your initial balance: ");
         initialBalance = input.nextInt();
         System.out.println("Please enter what percentage you except the balance to grow by per year, eg. for 20%, type \"20\": ");
         percentPerYear = input.nextInt();
         System.out.println("Please enter your target balance: ");
         targetBalance = input.nextInt();
         
         int years = 0;
         
         do // Executes the statements below for the first time before reaching the conditional while loop
         {
             
             initialBalance = initialBalance * (1 + (percentPerYear/100)); // Takes the initial balance and multiple by the percentage rate that the balance is expected to grow per year.
             years++; // Increases "years" value by 1.
             
         } while (initialBalance <= targetBalance); // Checks whether initialBalance is below or equal to targetBalance. Exits if initialBalance exceeds targetBalance.
         
         System.out.println("It will take around " + years + " years to reach your target balance.");
     } 
}