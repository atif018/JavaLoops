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
             
             goal = goal + firstNumber;
             firstNumber++;
         
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
             
             goal = goal + i; 
             
         }
         
         System.out.println("The total is: " + goal);
         
         System.out.println("This part of the program will print a box of a height and width as instructed by the user.");
         System.out.println("Example: If your first number is 4 and your second number is 5, it will print a box of height 4 and width 5.");
         System.out.println("Please enter your first number: ");
         firstNumber = input.nextInt();
         System.out.println("Please enter your second number: ");
         secondNumber = input.nextInt();
         
         for (int i = 1; i <= firstNumber; i++)
         
         {
             
             for (int j = 1; j <= secondNumber; j++)
             
             {
             
                 System.out.print("*");
             
             }
             
             System.out.println();
         }
         
     } 
}